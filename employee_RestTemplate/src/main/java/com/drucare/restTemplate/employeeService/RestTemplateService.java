package com.drucare.restTemplate.employeeService;

import com.drucare.restTemplate.employeeBean.EmpFetchFieldsReq;
import com.drucare.restTemplate.employeeBean.Employee;

public interface RestTemplateService {
	Boolean insertEmployeeDetailsUsingMap(Employee insertEmployeeRequest);

	Boolean updateEmployeeDetailsUsingSqlParameterSource(Employee updateEmployeeRequest);

	Employee fetchEmployeeNameByEmpIdUsingMap(EmpFetchFieldsReq empFetchFieldsReq);

	String fetchEmployeeNameByEmpIdUsingObject(EmpFetchFieldsReq empFetchFieldsReq);

}

