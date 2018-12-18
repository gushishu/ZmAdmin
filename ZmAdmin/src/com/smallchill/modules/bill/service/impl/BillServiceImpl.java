package com.smallchill.modules.bill.service.impl;

import com.smallchill.core.base.service.BaseService;
import com.smallchill.core.plugins.dao.Md;
import com.smallchill.core.toolbox.CMap;
import com.smallchill.core.toolbox.support.Convert;
import com.smallchill.modules.bill.model.Bill;
import com.smallchill.modules.bill.service.BillService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Generated by Blade.
 * 2017-10-18 16:49:02
 */
@Service
public class BillServiceImpl extends BaseService<Bill> implements BillService {

	@Override
	public boolean updateStatus(String ids, Integer status) {
		StringBuilder sb = new StringBuilder(" status = #{status} ");
		CMap map = CMap.init().set("status", status).set("ids", Convert.toIntArray(ids));
		boolean temp = updateBy(sb.toString(), "id in (#{join(ids)})", map);
		return temp;
	}

	@Override
	@SuppressWarnings("unchecked")
	public Map<String, Object> findOne(Object id) {
		return Md.selectOne("bill.findOne", CMap.init().set("id", id), Map.class);
	}

}