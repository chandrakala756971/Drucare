package com.drucare.employeeinfo.service;

import org.springframework.stereotype.Service;

import com.drucare.employeeinfo.bean.Employee;

@Service
public interface EmployeeService {
	Boolean insertEmployeeDetailsByMap(Employee insertEmployeeReqMap);
	Boolean insertEmployeeDetailsByBeanProperty(Employee insertEmployeeReqBeanProperty);
	Boolean insertEmployeeDetailsByMapSql(Employee insertEmployeeReqMapSql);
	
	Boolean updateEmployeeDetailsByMap(Employee updateEmployeeReqMap);
	Boolean updateEmployeeDetailsByMapSql(Employee updateEmployeeReqMapSql);
	Boolean updateEmployeeDetailsByBeanProperty(Employee updateEmployeeReqBeanProperty);
	

}
