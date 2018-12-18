package com.smallchill.modules.platform.controller;

import com.smallchill.common.base.BaseController;
import com.smallchill.core.annotation.Json;
import com.smallchill.core.toolbox.ApiResult;
import com.smallchill.core.toolbox.kit.JsonKit;
import com.smallchill.modules.platform.model.Station;
import com.smallchill.modules.platform.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Generated by Blade.
 * 2017-09-09 15:42:39
 */
@Controller
@RequestMapping("/station")
public class StationController extends BaseController {
	private static String CODE = "station";
	private static String PREFIX = "tb_station";
	private static String LIST_SOURCE = "station.list";
	private static String BASE_PATH = "/modules/platform/station/";
	
	@Autowired
    StationService service;
	
	@RequestMapping(KEY_MAIN)
	public String index(ModelMap mm) {
		mm.put("code", CODE);
		return BASE_PATH + "station.html";
	}

	@RequestMapping(KEY_ADD)
	public String add(ModelMap mm) {
		mm.put("code", CODE);
		return BASE_PATH + "station_add.html";
	}

	@RequestMapping(KEY_EDIT + "/{id}")
	public String edit(@PathVariable Integer id, ModelMap mm) {
		Station station = service.findById(id);
		mm.put("model", JsonKit.toJson(station));
		mm.put("id", id);
		mm.put("code", CODE);
		return BASE_PATH + "station_edit.html";
	}

	@RequestMapping(KEY_VIEW + "/{id}")
	public String view(@PathVariable Integer id, ModelMap mm) {
		Station station = service.findById(id);
		mm.put("model", JsonKit.toJson(station));
		mm.put("id", id);
		mm.put("code", CODE);
		return BASE_PATH + "station_view.html";
	}

	@Json
	@RequestMapping(KEY_LIST)
	public Object list() {
		Object grid = paginate(LIST_SOURCE);
		return grid;
	}

	@Json
	@RequestMapping(KEY_SAVE)
	public ApiResult save() {
		Station station = mapping(PREFIX, Station.class);
		boolean temp = service.save(station);
		if (temp) {
			return success(SAVE_SUCCESS_MSG);
		} else {
			return error(SAVE_FAIL_MSG);
		}
	}

	@Json
	@RequestMapping(KEY_UPDATE)
	public ApiResult update() {
		Station station = mapping(PREFIX, Station.class);
		boolean temp = service.update(station);
		if (temp) {
			return success(UPDATE_SUCCESS_MSG);
		} else {
			return error(UPDATE_FAIL_MSG);
		}
	}

	@Json
	@RequestMapping(KEY_REMOVE)
	public ApiResult remove(@RequestParam String ids) {
		int cnt = service.deleteByIds(ids);
		if (cnt > 0) {
			return success(DEL_SUCCESS_MSG);
		} else {
			return error(DEL_FAIL_MSG);
		}
	}
}
