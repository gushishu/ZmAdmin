package com.smallchill.common.task;

import com.smallchill.core.toolbox.kit.LogKit;
import com.smallchill.core.toolbox.support.SpringAcaHolder;
import com.smallchill.modules.platform.service.SyncService;

public class GlobalTask implements Runnable {

    SyncService service;

    public SyncService getService() {
        if (null == service) {
            service = SpringAcaHolder.getBean(SyncService.class);
        }
        return service;
    }


	@Override
	public void run() {
//        getService().saveSync();
//        LogKit.info("数据同步定时调度任务执行成功");
	}

}
