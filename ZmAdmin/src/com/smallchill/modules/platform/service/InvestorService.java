package com.smallchill.modules.platform.service;

import com.smallchill.core.base.service.IService;
import com.smallchill.modules.platform.model.Investor;

import java.util.Map;

/**
 * Generated by Blade.
 * 2017-09-26 18:12:48
 */
public interface InvestorService extends IService<Investor> {
	
	boolean updateStatus(String ids, Integer status);
	
	Map<String, Object> findOne(Object id);

	boolean saveInvestor(Investor investor);

    boolean updateInvestor(Investor investor);

}
