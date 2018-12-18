package com.smallchill.modules.app.service;

import com.smallchill.api.model.Order;
import com.smallchill.core.base.service.IService;

import java.util.Map;

/**
 * Generated by Blade.
 * 2018-01-07 12:18:34
 */
public interface OrderService extends IService<Order> {
	
	boolean updateStatus(String ids, Integer status);
	
	Map<String, Object> findOne(Object id);

}