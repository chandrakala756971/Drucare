package com.drucare.serviceEmployee.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.drucare.serviceEmployee.Bean.EmployeeBean;
import com.drucare.serviceEmployee.Bean.EmployeeDeptXref;
import com.drucare.serviceEmployee.Bean.EmployeeDesignationXref;
import com.drucare.serviceEmployee.Bean.InsertOrUpdateEmployeeReq;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
@Autowired 
JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

/*	@Override
	public Boolean insertEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
		boolean result = false;
		KeyHolder holder = new GeneratedKeyHolder();
		String queryInsertEmployeeDetails = "INSERT INTO employees_info_ref(emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,isactive) values(:empId,:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
		//Long key = holder.getKey().longValue();

		result = namedParameterJdbcTemplate.update(queryInsertEmployeeDetails,
				new BeanPropertySqlParameterSource(insertOrUpdateEmployeeReq), holder, new String[] { "emp_id" }) > 0;
				//insertOrUpdateEmployeeReq.setEmpId(key);
				return result;
	}

	@Override
	public Boolean updateEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
		boolean result = false;
		String queryForUpdateEmployeeDetails = "UPDATE employees_info_ref SET first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2 WHERE emp_id=:empId and is_active=true";
		result = namedParameterJdbcTemplate.update(queryForUpdateEmployeeDetails,
				new BeanPropertySqlParameterSource(insertOrUpdateEmployeeReq)) > 0;
				return result;
	}*/

	@Override
	public Long insertEmployee(EmployeeBean employeeBean) {
		String queryForInsertEmployee = "INSERT INTO employees_info_ref(emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:empId,:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
		long empId = 0;
		try {

			KeyHolder holder = new GeneratedKeyHolder();

			namedParameterJdbcTemplate.update(queryForInsertEmployee, new BeanPropertySqlParameterSource(employeeBean),
					holder, new String[] { "emp_id" });

			empId = holder.getKey().longValue();
			employeeBean.setEmpId(empId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empId;
	}

	@Override
	public Boolean updateEmployee(EmployeeBean employeeBean) {
		boolean result = false;
		String queryForInsertEmployeeDataIntoHistory = "INSERT INTO employee_history_info_ref(emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,isactive) values(:empId,:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
		String queryForUpdateEmployee = "UPDATE employees_info_ref SET first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2 WHERE emp_id=:empId and isactive=true";
		try {
			result = namedParameterJdbcTemplate.update(queryForInsertEmployeeDataIntoHistory,
					new BeanPropertySqlParameterSource(employeeBean)) > 0;

					result = namedParameterJdbcTemplate.update(queryForUpdateEmployee,
							new BeanPropertySqlParameterSource(employeeBean)) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean insertEmployeeDepartments(MapSqlParameterSource parameters) {
		boolean result = false;
		String queryForInsertEmployeeDepartments = "INSERT INTO employee_dept_xref(emp_dept_id,emp_id,dept_id,org_id,isactive) VALUES (:empDeptId,:empId,:deptId,:orgId,:isactive)";
		try{
			result= namedParameterJdbcTemplate.update(queryForInsertEmployeeDepartments, parameters) > 0;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	

	@Override
	public Boolean insertEmployeeDesignation(MapSqlParameterSource parameters) {
		boolean result = false;
		String queryForInsertEmployeeDesignation = "INSERT INTO employee_designation_xref(emp_designation_id,emp_id,designation_id,org_id,isactive) VALUES (:empDesignationId,:empId,:designationId,:isactive)";
		try{
			result= namedParameterJdbcTemplate.update(queryForInsertEmployeeDesignation, parameters) > 0;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	



/*	@Override
	public Boolean insertemployeeDepartments(EmployeeBean employeeBean) {
		boolean result=false;
		int count = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		String queryForInsertEmployeeDetails = "INSERT INTO employees_info_ref(emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:empId,:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
		 count = namedParameterJdbcTemplate.update(queryForInsertEmployeeDetails,
				new BeanPropertySqlParameterSource(employeeBean), holder, new String[] { "emp_id" });
		Long key = holder.getKey().longValue();
		employeeBean.setEmpId(key);

		String queryForUpdateEmployeeData= "UPDATE employees_info_ref SET first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2 WHERE emp_id=:empId and is_active=true";
		count = namedParameterJdbcTemplate.update(queryForUpdateEmployeeData,
				new BeanPropertySqlParameterSource(employeeBean));

		if (count > 0) {
			String queryForInsertEmployeeDepartments = "INSERT INTO employee_dept_xref(emp_dept_id,emp_id,dept_id,org_id,is_active) VALUES (:empDeptId,:empId,:deptId,:orgId,:is_active)";
			List<EmployeeDeptXref> empDeptXrefSave = new ArrayList<>();
			Long keys=holder.getKey().longValue();
			employeeBean.setEmpId(keys);
			SqlParameterSource[] parameters = SqlParameterSourceUtils.createBatch(empDeptXrefSave.toArray());
			namedParameterJdbcTemplate.batchUpdate(queryForInsertEmployeeDepartments, parameters);

			String queryForInsertEmployeeDesignation = "INSERT INTO employee_designation_xref(emp_designation_id,emp_id,designation_id,org_id,is_active) VALUES (:empDesignationId,:empId,:designationId,:is_active)";
			List<EmployeeDesignationXref> empDesignationRefSave = new ArrayList<>();
			Long Key=holder.getKey().longValue();
			employeeBean.setEmpId(Key);
			SqlParameterSource[] values = SqlParameterSourceUtils
					.createBatch(empDesignationRefSave.toArray());
			namedParameterJdbcTemplate.batchUpdate(queryForInsertEmployeeDesignation, values);
		}
		return result;
	}*/


}

