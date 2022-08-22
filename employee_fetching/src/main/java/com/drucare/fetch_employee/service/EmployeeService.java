package com.drucare.fetch_employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.drucare.fetch_employee.bean.FetchEmployeeDto;
import com.drucare.fetch_employee.bean.FetchEmployeeReq;

@Service
public interface EmployeeService {

	String fetchEmployeeNameByEmpIdUsingObject(FetchEmployeeReq fetchEmployeeRequest);


	FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(FetchEmployeeReq fetchEmployeeRequest);

	List<FetchEmployeeDto> fetchAllEmployeesUsingList(FetchEmployeeReq fetchEmployeeRequest);

	List<FetchEmployeeDto> fetchAllEmployeeDetails(FetchEmployeeReq fetchEmployeeRequest);

	List<FetchEmployeeDto> fetchEmployeeDetails(FetchEmployeeReq fetchEmployeeRequest);
}
