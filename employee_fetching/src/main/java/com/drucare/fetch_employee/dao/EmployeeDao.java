package com.drucare.fetch_employee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.drucare.fetch_employee.bean.FetchEmployeeDto;
import com.drucare.fetch_employee.bean.FetchEmployeeReq;
@Repository
public interface EmployeeDao {

	String fetchEmployeeNameByEmpIdUsingObject(FetchEmployeeReq fetchEmployeeRequest);

	FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(FetchEmployeeReq fetchEmployeeRequest);

	List<FetchEmployeeDto> fetchAllEmployeesUsingList(FetchEmployeeReq fetchEmployeeRequest);

	List<FetchEmployeeDto> fetchAllEmployeeDetails(FetchEmployeeReq fetchEmployeeRequest);

	List<FetchEmployeeDto> fetchEmployeeDetails(FetchEmployeeReq fetchEmployeeRequest);

}
