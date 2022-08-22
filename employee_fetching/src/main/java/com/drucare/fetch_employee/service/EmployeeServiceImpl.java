package com.drucare.fetch_employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.fetch_employee.bean.FetchEmployeeDto;
import com.drucare.fetch_employee.bean.FetchEmployeeReq;
import com.drucare.fetch_employee.dao.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public String fetchEmployeeNameByEmpIdUsingObject(FetchEmployeeReq fetchEmployeeRequest) {
		return employeeDao.fetchEmployeeNameByEmpIdUsingObject(fetchEmployeeRequest);
	}

	@Override
	public FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(FetchEmployeeReq fetchEmployeeRequest) {
		return employeeDao.fetchEmployeeNameByEmpIdUsingMap(fetchEmployeeRequest);
	}

	@Override
	public List<FetchEmployeeDto> fetchAllEmployeesUsingList(FetchEmployeeReq fetchEmployeeRequest) {
		return employeeDao.fetchAllEmployeesUsingList(fetchEmployeeRequest);
	}

	@Override
	public List<FetchEmployeeDto> fetchAllEmployeeDetails(FetchEmployeeReq fetchEmployeeRequest) {
		return employeeDao.fetchAllEmployeeDetails(fetchEmployeeRequest);
	}

	@Override
	public List<FetchEmployeeDto> fetchEmployeeDetails(FetchEmployeeReq fetchEmployeeRequest) {
		return employeeDao.fetchEmployeeDetails(fetchEmployeeRequest);
	}
}
