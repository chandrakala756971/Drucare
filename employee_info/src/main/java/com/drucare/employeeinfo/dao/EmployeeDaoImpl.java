package com.drucare.employeeinfo.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.drucare.employeeinfo.bean.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public Boolean insertEmployeeDetailsByMap(Employee insertEmployeeReq) {
		Boolean flag = false;
		String queryForInsertEmployee = "INSERT INTO employees_info_ref(first_nm,middle_nm,last_nm,mobile_no,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,salary,qualification,gender,experience,blood_group) values (:firstNm,:middleNm,:lastNm,:mobileNo,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:salary,:qualification,:gender,:experience,:bloodGroup)";

		try {
			Map<String, Object> parameters = new HashMap<>();

			parameters.put("firstNm", insertEmployeeReq.getFirstNm());
			parameters.put("middleNm", insertEmployeeReq.getMiddleNm());
			parameters.put("lastNm", insertEmployeeReq.getLastNm());
			parameters.put("mobileNo", insertEmployeeReq.getMobileNo());
			parameters.put("emailId", insertEmployeeReq.getEmailId());
			parameters.put("empCode", insertEmployeeReq.getEmpCode());
			parameters.put("addressLine1", insertEmployeeReq.getAddressLine1());
			parameters.put("addressLine2", insertEmployeeReq.getAdressLine2());
			parameters.put("stateNm", insertEmployeeReq.getStateNm());
			parameters.put("cityNm", insertEmployeeReq.getCityNm());
			parameters.put("countryNm", insertEmployeeReq.getCountryNm());
			parameters.put("pinCode", insertEmployeeReq.getPinCode());
			parameters.put("salary", insertEmployeeReq.getSalary());
			parameters.put("qualification", insertEmployeeReq.getQualification());
			parameters.put("gender", insertEmployeeReq.getGender());
			parameters.put("experience", insertEmployeeReq.getExperience());
			parameters.put("bloodGroup", insertEmployeeReq.getBloodGroup());

			flag = namedParameterJdbcTemplate.update(queryForInsertEmployee, parameters) > 0;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	@Override
	public Boolean insertEmployeeDetailsByMapSql(Employee insertEmployeeReqMapSql) {

		boolean result=false;
		String queryForInsertEmployee = "INSERT INTO employees_info_ref(first_nm,middle_nm,last_nm,mobile_no,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,salary,qualification,gender,experience,blood_group) values (:firstNm,:middleNm,:lastNm,:mobileNo,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:salary,:qualification,:gender,:experience,:bloodGroup)";		
		try {
			MapSqlParameterSource mapSql = new MapSqlParameterSource();
			mapSql.addValue("firstNm",  insertEmployeeReqMapSql.getFirstNm());
			mapSql.addValue("middleNm", insertEmployeeReqMapSql.getMiddleNm());
			mapSql.addValue("lastNm", insertEmployeeReqMapSql.getLastNm());
			mapSql.addValue("mobileNO", insertEmployeeReqMapSql.getMobileNo());
			mapSql.addValue("emailId", insertEmployeeReqMapSql.getEmailId());
			mapSql.addValue("salary", insertEmployeeReqMapSql.getSalary());
			mapSql.addValue("empCode", insertEmployeeReqMapSql.getEmpCode());
			mapSql.addValue("addressLine1", insertEmployeeReqMapSql.getAddressLine1());
			mapSql.addValue("addressLine2", insertEmployeeReqMapSql.getAdressLine2());
			mapSql.addValue("stateNm", insertEmployeeReqMapSql.getStateNm());
			mapSql.addValue("cityNm", insertEmployeeReqMapSql.getCityNm());
			mapSql.addValue("countryNm", insertEmployeeReqMapSql.getCountryNm());
			mapSql.addValue("pinCode", insertEmployeeReqMapSql.getPinCode());
			mapSql.addValue("qualification", insertEmployeeReqMapSql.getQualification());
			mapSql.addValue("gender", insertEmployeeReqMapSql.getGender());
			mapSql.addValue("experience", insertEmployeeReqMapSql.getExperience());
			mapSql.addValue("bloodGroup", insertEmployeeReqMapSql.getBloodGroup());


			result = namedParameterJdbcTemplate.update(queryForInsertEmployee, mapSql)>0;

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}


	@Override
	public Boolean insertEmployeeDetailsByBeanProperty(Employee insertEmployeeReqBeanProperty) {
		boolean result=false;
		String queryInsertEmployeeDetails ="INSERT INTO employees_info_ref(first_nm,middle_nm,last_nm,mobile_no,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,salary,qualification,gender,experience,blood_group) values (:firstNm,:middleNm,:lastNm,:mobileNo,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:salary,:qualification,:gender,:experience,:bloodGroup)";
		try {
			result=namedParameterJdbcTemplate.update(queryInsertEmployeeDetails, new BeanPropertySqlParameterSource(insertEmployeeReqBeanProperty))>0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}


		return result;
	}

	@Override
	public Boolean updateEmployeeDetailsByMap(Employee updateEmployeeReqMap) {
		boolean result = false;
		String queryUpdateEmployeeDetails = "UPDATE employees_info_ref SET first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2 WHERE emp_id=:empId";
		try {
			Map<String, Object> mapUpdate = new HashMap<>();
			mapUpdate.put("empId", updateEmployeeReqMap.getEmpId());
			mapUpdate.put("firstNm", updateEmployeeReqMap.getFirstNm());
			mapUpdate.put("middleNm", updateEmployeeReqMap.getMiddleNm());
			mapUpdate.put("lastNm", updateEmployeeReqMap.getLastNm());
			mapUpdate.put("mobileNo", updateEmployeeReqMap.getMobileNo());
			mapUpdate.put("emailId", updateEmployeeReqMap.getEmailId());
			mapUpdate.put("addressLine1", updateEmployeeReqMap.getAddressLine1());
			mapUpdate.put("addressLine2", updateEmployeeReqMap.getAdressLine2());

			result = namedParameterJdbcTemplate.update(queryUpdateEmployeeDetails, mapUpdate) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}



	@Override

	public Boolean updateEmployeeDetailsByMapSql(Employee updateEmployeeReqMapSql) {
		boolean result = false;
		String queryUpdateEmployeeDetailsByMapSql = "UPDATE employees_info_ref SET first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2 WHERE emp_id=:empId";
		try {
			MapSqlParameterSource updateMapSqlParameter = new MapSqlParameterSource()
					.addValue("empId", updateEmployeeReqMapSql.getEmpId())
					.addValue("firstNm", updateEmployeeReqMapSql.getFirstNm())
					.addValue("middleNm", updateEmployeeReqMapSql.getMiddleNm())
					.addValue("lastNm", updateEmployeeReqMapSql.getLastNm())
					.addValue("emailId", updateEmployeeReqMapSql.getEmailId())
					.addValue("mobileNo", updateEmployeeReqMapSql.getMobileNo())
					.addValue("addressLine1", updateEmployeeReqMapSql.getAddressLine1())
					.addValue("addressLine2", updateEmployeeReqMapSql.getAdressLine2());

			result = namedParameterJdbcTemplate.update(queryUpdateEmployeeDetailsByMapSql, updateMapSqlParameter) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}




	@Override
	public Boolean updateEmployeeDetailsByBeanProperty(Employee updateEmployeeReqBeanProperty) {
		boolean result = false;
		String queryUpdateEmployeeDetailsByBeanProperty = "UPDATE employees_info_ref SET first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2 WHERE emp_id=:empId";
		try {

			result = namedParameterJdbcTemplate.update(queryUpdateEmployeeDetailsByBeanProperty, new BeanPropertySqlParameterSource(updateEmployeeReqBeanProperty)) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}


}

