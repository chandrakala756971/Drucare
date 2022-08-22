package com.drucare.InsertOrUpdate.bean;

import java.util.List;

public class InsertOrUpdateReq {

	private Long orgId;
	private List<Employee> employeeList;
	
	
	
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
}
