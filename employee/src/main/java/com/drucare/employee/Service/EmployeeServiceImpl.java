package com.drucare.employee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.employee.Dao.EmployeeDao;
import com.drucare.employee.model.InserOrUpdateEmployee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;

//1
	public Boolean insertOrUpdateEmployee(InserOrUpdateEmployee insertOrUpdateEmployeeReq) {
		
		if(insertOrUpdateEmployeeReq.getEmpId()==null) {
			return  employeeDao.insertEmployee(insertOrUpdateEmployeeReq);
		}else
			return  employeeDao.updateEmployee(insertOrUpdateEmployeeReq);
	}

	/*
	@Override
	public Boolean insertOrUpdateDepartment(InserOrUpdateEmployee insertOrUpdateEmployee) {
		if(insertOrUpdateEmployee.getDeptId()==null) {
		return 	employeeDao.insertDepartment(insertOrUpdateEmployee);
		
		}else
			
		return employeeDao.updateDepartment(insertOrUpdateEmployee);
	}
	*/
}

	





