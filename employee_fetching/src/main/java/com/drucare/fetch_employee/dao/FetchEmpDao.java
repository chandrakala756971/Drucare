package com.drucare.fetch_employee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.drucare.fetch_employee.bean.FetchEmployeeDto;
import com.drucare.fetch_employee.bean.FetchEmployeeReq;
@Repository
public interface FetchEmpDao {

	String fetchEmpByObject(FetchEmployeeReq fetchEmployeeReq);

	FetchEmployeeDto fetchEmpByEmpIdUsingMap(FetchEmployeeReq fetchEmployeeReq);

	List<FetchEmployeeDto> fetchAllEmpUsingList(FetchEmployeeReq fetchEmployeeReq);

	List<FetchEmployeeDto> fetchAllEmpDetails(FetchEmployeeReq fetchEmployeeReq);



}
