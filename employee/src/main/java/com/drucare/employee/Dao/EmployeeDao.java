package com.drucare.employee.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.drucare.employee.model.InserOrUpdateEmployee;

@Repository
public interface EmployeeDao {


//1
	
	Boolean insertEmployee(InserOrUpdateEmployee insertOrUpdateEmployeeReq);

	Boolean updateEmployee(InserOrUpdateEmployee insertOrUpdateEmployeeReq);
/*
	
	Boolean  insertDepartment(InserOrUpdateEmployee insertOrUpdateEmployee);

	Boolean updateDepartment(InserOrUpdateEmployee insertOrUpdateEmployee);
	*/
//3
}
