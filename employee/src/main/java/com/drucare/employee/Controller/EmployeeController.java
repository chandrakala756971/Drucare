package com.drucare.employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.employee.Service.EmployeeService;
import com.drucare.employee.model.InserOrUpdateEmployee;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/insertOrUpdateforEmployee")
	public Boolean insertOrUpdateEmployee(@RequestBody InserOrUpdateEmployee insertOrUpdateEmployeeReq) {
		return   employeeService.insertOrUpdateEmployee(insertOrUpdateEmployeeReq);
	}

	/*
	  @PostMapping("/inserOrUpdateforDepartment")
	 
   public Boolean insertOrUpdateDepartment(InserOrUpdateEmployee insertOrUpdateEmployee ) {
	return employeeService.insertOrUpdateDepartment(insertOrUpdateEmployee);
	}
	*/
}









