package com.drucare.employeeinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.employeeinfo.bean.Employee;
import com.drucare.employeeinfo.dao.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public Boolean insertEmployeeDetailsByMap(Employee insertEmployeeReq) {

		return employeeDao.insertEmployeeDetailsByMap(insertEmployeeReq);
	}

	@Override
public Boolean insertEmployeeDetailsByMapSql(Employee insertEmployeeReqMapSql) {

		return employeeDao.insertEmployeeDetailsByMapSql(insertEmployeeReqMapSql);
	}

	@Override
	public Boolean insertEmployeeDetailsByBeanProperty(Employee insertEmployeeReqBeanProperty) {

		return employeeDao.insertEmployeeDetailsByBeanProperty(insertEmployeeReqBeanProperty);
	}
	

	@Override
	public Boolean updateEmployeeDetailsByMap(Employee updateEmployeeReqMap) {
		
		return employeeDao.insertEmployeeDetailsByMap(updateEmployeeReqMap);
	}

	@Override
	public Boolean updateEmployeeDetailsByMapSql(Employee updateEmployeeReqMapSql) {
		
		return employeeDao.insertEmployeeDetailsByMapSql(updateEmployeeReqMapSql);
	}

	@Override
	public Boolean updateEmployeeDetailsByBeanProperty(Employee updateEmployeeReqBeanProperty) {
		
		return employeeDao.insertEmployeeDetailsByBeanProperty(updateEmployeeReqBeanProperty);
	}


}
