package com.covalense.springboot.dto;

import java.util.List;

import com.covalense.springboot.dto.EmployeeInfoBean;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("employee-response")
public class EmployeeResponse {
	@JsonProperty("statuscode")
	private int statuscode;

	private String message;

	private String description;
	
	private List<EmployeeInfoBean> bean;

	public int getstatuscode() {
		return statuscode;
	}

	public void setstatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<EmployeeInfoBean> getBean() {
		return bean;
	}

	public void setBean(List<EmployeeInfoBean> bean) {
		this.bean = bean;
	}
	
	
	

}
