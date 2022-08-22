package com.drucare.fetch_employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.fetch_employee.bean.FetchEmployeeDto;
import com.drucare.fetch_employee.bean.FetchEmployeeReq;
import com.drucare.fetch_employee.service.FetchEmpService;

@RestController
public class FetchEmpController {
	@Autowired
	FetchEmpService fetchEmpService;
	@GetMapping("/fetchEmployeebyobject1")
	public String fetchEmpByObject(@RequestBody FetchEmployeeReq fetchEmployeeReq) {
		return fetchEmpService.fetchEmpByObject(fetchEmployeeReq);

	}
	@GetMapping("/fetchEmployeeNameByEmpIdUsingMap1")
	public FetchEmployeeDto fetchEmpByEmpIdUsingMap(@RequestBody FetchEmployeeReq fetchEmployeeReq) {
		return fetchEmpService.fetchEmpByEmpIdUsingMap(fetchEmployeeReq);
	}
	@GetMapping("/fetchAllEmployeesUsingList1")
	public List<FetchEmployeeDto> fetchAllEmpUsingList(@RequestBody FetchEmployeeReq fetchEmployeeReq) {
		return fetchEmpService.fetchAllEmpUsingList(fetchEmployeeReq);
	}
	@GetMapping("/fetchAllEmployeeDetails1")
	public List<FetchEmployeeDto> fetchAllEmpDetails( @RequestBody FetchEmployeeReq fetchEmployeeReq) {
		return fetchEmpService.fetchAllEmpDetails(fetchEmployeeReq);
	}
	
	



}
