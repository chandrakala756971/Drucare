package com.drucare.employee.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import com.drucare.employee.model.InserOrUpdateEmployee;

@Service
public interface EmployeeService  {
	

	Boolean insertOrUpdateEmployee(InserOrUpdateEmployee insertOrUpdateEmployeeReq);


	//Boolean insertOrUpdateDepartment(InserOrUpdateEmployee insertOrUpdateEmployee);
}