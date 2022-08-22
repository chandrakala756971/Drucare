package com.drucare.employee.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.drucare.employee.model.InserOrUpdateEmployee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	//	1

	@Override
	public Boolean insertEmployee(InserOrUpdateEmployee insertOrUpdateEmployeeReq) {

		Boolean result=false;
		KeyHolder holder = new GeneratedKeyHolder();
		String queryInsertEmployeeDetails = "INSERT INTO employee_info_ref(emp_id,emp_nm,mobile_no,email_id,emp_code,address_line,state_nm,city_nm,country_nm,pin_code,salary,qualification,gender,experience,blood_group,org_id,version_id) values(:empId,:empNm,:mobileNo,:emailId,:empCode,:addressLine,:stateNm,:cityNm,:countryNm,:pinCode,:salary,:qualification,:gender,:experience,:bloodGroup,:orgId,:versionId)";
		result=namedParameterJdbcTemplate.update(queryInsertEmployeeDetails, 
				new BeanPropertySqlParameterSource(insertOrUpdateEmployeeReq), holder, new String[] { "emp_id" }) > 0;
				Long key  =   holder.getKey().longValue();
				insertOrUpdateEmployeeReq.setEmpId(key);
				return result;
	}

	@Override

	public Boolean updateEmployee(InserOrUpdateEmployee insertOrUpdateEmployeeReq) {

		Boolean result1 = false;

		// String queryForUpdateEmployeeDetails = "UPDATE employees_info_ref SET
		// first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2
		// WHERE emp_id=:empId and is_active=true";
        String queryForUpdateEmployeeDetails = "UPDATE employee_info_ref SET(emp_id=:empId,emp_nm=:empNm,mobile_no=:mobileNo,email_id=:emailId,emp_code=:empCode,address_line=:addressLine,state_nm=:stateNm,city_nm=:cityNm,country_nm=:countryNm,pin_code=:pinCode,salary=:salary,qualification=:qualification,gender=:gender,experience=:experience,blood_group=:bloodGroup,org_id=:orgId,version_id:=versionId) ";
		result1= namedParameterJdbcTemplate.update(queryForUpdateEmployeeDetails,
				new BeanPropertySqlParameterSource(insertOrUpdateEmployeeReq)) > 0;

				return result1;

	}




	//2.department_ref	



	/*

	@Override
	public Boolean insertDepartment(InserOrUpdateEmployee insertOrUpdateEmployee) {
		Boolean result2=false;
		KeyHolder holder = new GeneratedKeyHolder();
//		String queryInsertEmployeeDetails = "Insert into department_ref(dept_id,dept_nm,is_active) values(:deptId,:deptNm,:isActive)";

		String insertDepartmentDetails = "Insert into department_ref(dept_id,dept_nm,is_active) values(:deptId,:deptNm,:isActive)";
		result2=namedParameterJdbcTemplate.update(insertDepartmentDetails,
				new BeanPropertySqlParameterSource(insertOrUpdateEmployee), holder, new String[] { "dept_id" })>0;

				Long key = holder.getKey().longValue();
				insertOrUpdateEmployee.setDeptId(key);
				return result2;
	}




	@Override
	public Boolean updateDepartment(InserOrUpdateEmployee insertOrUpdateEmployee) {
		Boolean result3=false;
		KeyHolder holder=new GeneratedKeyHolder();
		//		String queryForUpdateEmployeeDetails = "update department_ref set dept_nm=:deptNm where dept_id=:deptId";

		String queryForUpdateDepartmentDetails="Update department_ref set dept_nm=:deptNm  where dept_id=:deptId and is_active=true";
		result3=namedParameterJdbcTemplate.update(queryForUpdateDepartmentDetails, new BeanPropertySqlParameterSource(insertOrUpdateEmployee))>0;
		return result3;
	}

	 */

}