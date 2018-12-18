package com.smallchill.modules.app.model;

import com.smallchill.core.base.model.BaseModel;
import org.beetl.sql.core.annotatoin.Table;

import java.util.Date;

/**
 * Generated by Blade.
 * 2018-01-07 12:18:34
 */
@Table(name = "tb_proceeds")
@SuppressWarnings("serial")
public class Proceeds extends BaseModel {

	private Integer id; //主键
	private String proceed_num; //收益率
	private Date create_time; //创建时间
	private Date proceed_time; //收益日期
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getProceed_num() {
		return proceed_num;
	}
	
	public void setProceed_num(String proceed_num) {
		this.proceed_num = proceed_num;
	}
	
	public Date getCreate_time() {
		return create_time;
	}
	
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	public Date getProceed_time() {
		return proceed_time;
	}
	
	public void setProceed_time(Date proceed_time) {
		this.proceed_time = proceed_time;
	}
	

}
