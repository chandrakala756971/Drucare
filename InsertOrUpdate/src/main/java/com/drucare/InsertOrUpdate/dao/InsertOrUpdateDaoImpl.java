package com.drucare.InsertOrUpdate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.drucare.InsertOrUpdate.bean.Employee;

@Repository
public class InsertOrUpdateDaoImpl implements InsertOrUpdateDao{
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public Long insertEmployeeDetails(Employee employeeObj) {
		
		String queryInsertEmployeeDetails = "INSERT INTO employee_info_ref(emp_id,emp_nm,mobile_no,email_id,emp_code,address_line,state_nm,city_nm,country_nm,pin_code,salary,qualification,gender,experience,blood_group,org_id,version_id) values(:empId,:empNm,:mobileNo,:emailId,:empCode,:addressLine,:stateNm,:cityNm,:countryNm,:pinCode,:salary,:qualification,:gender,:experience,:bloodGroup,:orgId,:versionId)";
		long result=0;
		
		try {
			KeyHolder holder=new GeneratedKeyHolder();

			namedParameterJdbcTemplate.update(queryInsertEmployeeDetails, new BeanPropertySqlParameterSource(employeeObj), holder, new String[] { "emp_id" });
			result=holder.getKey().longValue();
		}catch(Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public Boolean updateEmployeeDetails(Employee employeeObj) {
    
		boolean result=false;
		String queryForUpdateEmployee = "UPDATE employee_info_ref SET emp_nm=:empNm,mobile_no=:mobileNo,email_id=:emailId,address_line=:addressLine WHERE emp_id=:empId and is_active=true";
		try {
			namedParameterJdbcTemplate.update(queryForUpdateEmployee,
					new BeanPropertySqlParameterSource(employeeObj));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
