package com.drucare.serviceEmployee.Dao;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.drucare.serviceEmployee.Bean.EmployeeBean;
import com.drucare.serviceEmployee.Bean.InsertOrUpdateEmployeeReq;

@Repository
public interface EmployeeDao {
//	public Boolean insertEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);
//	public Boolean updateEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);

	public Long insertEmployee(EmployeeBean employeeBean);
	public Boolean updateEmployee(EmployeeBean employeeBean);
	public Boolean insertEmployeeDepartments(MapSqlParameterSource parameters);
	//public Boolean insertemployeeDepartments(EmployeeBean employeeBean);
	public Boolean insertEmployeeDesignation(MapSqlParameterSource parameters);
	//	public Boolean insertEmployeeDepartmentsXref(MapSqlParameterSource parameter);
}
