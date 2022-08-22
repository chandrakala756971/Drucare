package com.drucare.fetch_employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.drucare.fetch_employee.bean.FetchEmployeeDto;
import com.drucare.fetch_employee.bean.FetchEmployeeReq;

@Service
public interface FetchEmpService {

	String fetchEmpByObject(FetchEmployeeReq fetchEmployeeReq);

	FetchEmployeeDto fetchEmpByEmpIdUsingMap(FetchEmployeeReq fetchEmployeeReq);

	List<FetchEmployeeDto> fetchAllEmpUsingList(FetchEmployeeReq fetchEmployeeReq);

	List<FetchEmployeeDto> fetchAllEmpDetails(FetchEmployeeReq fetchEmployeeReq);

	
}
