package com.drucare.employeeinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.employeeinfo.bean.Employee;
import com.drucare.employeeinfo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/insertEmployeeDetailsByMap")
	public Boolean insertEmployeeDetailsByMap(@RequestBody Employee insertEmployeeReqMap) {
		return employeeService.insertEmployeeDetailsByMap(insertEmployeeReqMap);
		
	}
	
	
	@PostMapping("/insertEmployeeDetailsByMapSql")
	public Boolean insertEmployeeDetailsByMapSql(@RequestBody Employee insertEmployeeReqMapSql) {
		return employeeService.insertEmployeeDetailsByMapSql(insertEmployeeReqMapSql);

	}
	@PostMapping("/insertEmployeeDetailsByBeanProperty")
	public Boolean insertEmployeeDetailsByBeanProperty(@RequestBody Employee insertEmployeeReqBeanProperty) {
		return employeeService.insertEmployeeDetailsByBeanProperty(insertEmployeeReqBeanProperty);

	}


	@PutMapping("/updateEmployeeDetailsByMap")
	public Boolean updateEmployeeDetailsByMap(@RequestBody Employee updateEmployeeReqMap) {
		return employeeService.updateEmployeeDetailsByMap(updateEmployeeReqMap);

	}

	@PutMapping("/updateEmployee2")
	public Boolean updateEmployeeDetailsByMapSql(@RequestBody Employee updateEmployeeReqMapSql) {
		return employeeService.updateEmployeeDetailsByMapSql(updateEmployeeReqMapSql);

	}
	@PutMapping("/updateEmployee3")
	public Boolean updateEmployeeDetailsByBeanProperty(@RequestBody Employee updateEmployeeReqBeanProperty) {
		return employeeService.updateEmployeeDetailsByBeanProperty(updateEmployeeReqBeanProperty);

	}
	

}