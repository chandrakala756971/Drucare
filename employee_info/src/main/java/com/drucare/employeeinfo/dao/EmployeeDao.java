package com.drucare.employeeinfo.dao;

import org.springframework.stereotype.Repository;

import com.drucare.employeeinfo.bean.Employee;
@Repository
public interface EmployeeDao {
	Boolean insertEmployeeDetailsByMap(Employee insertEmployeeReq);
	Boolean insertEmployeeDetailsByMapSql(Employee insertEmployeeReqMapSql);
	Boolean insertEmployeeDetailsByBeanProperty(Employee insertEmployeeReqBeanProperty);
	
	Boolean updateEmployeeDetailsByMapSql(Employee updateEmployeeReqMapSql);
	Boolean updateEmployeeDetailsByBeanProperty(Employee updateEmployeeReqBeanProperty);
	Boolean updateEmployeeDetailsByMap(Employee updateEmployeeReqMap);
	

}
