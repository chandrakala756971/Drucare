package com.drucare.fetch_employee.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.drucare.fetch_employee.bean.FetchEmployeeDto;
import com.drucare.fetch_employee.bean.FetchEmployeeReq;

@Repository
public class FetchEmpDaoimpl implements FetchEmpDao{
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public String fetchEmpByObject(FetchEmployeeReq fetchEmployeeReq) {
		String queryForFetchByObject=" SELECT concat( emp_id,' ',emp_nm,  ' ',mobile_no ,' ' ,email_id ,' ' ,emp_code,' ' ,org_id)	FROM employees_info_ref WHERE emp_id=:empId and org_id=:orgId";				
			 
		return namedParameterJdbcTemplate.queryForObject(queryForFetchByObject, new BeanPropertySqlParameterSource(fetchEmployeeReq), String.class);
	}

	@Override
	public FetchEmployeeDto fetchEmpByEmpIdUsingMap(FetchEmployeeReq fetchEmployeeReq) {
		FetchEmployeeDto fetchEmployeeDto=new FetchEmployeeDto();
		String queryForEmpbyMap="SELECT emp_id,emp_nm,mobile_no,email_id,emp_code,org_id FROM employees_info_ref WHERE emp_id=:empId and org_id=:orgId";
		Map<String,Object> map=namedParameterJdbcTemplate.queryForMap(queryForEmpbyMap, new BeanPropertySqlParameterSource(fetchEmployeeReq));
		
		
		fetchEmployeeDto.setEmpId((Long) map.get("emp_id"));
//		fetchEmployeeDto.setFirstNm((String) map.get("first_nm"));
//		fetchEmployeeDto.setMiddleNm((String) map.get("middle_nm"));
//		fetchEmployeeDto.setLastNm((String) map.get("last_nm"));
		fetchEmployeeDto.setMobileNo((String) map.get("mobile_no"));
		fetchEmployeeDto.setEmailId((String) map.get("email_id"));
		fetchEmployeeDto.setEmpCode((String) map.get("emp_code"));
		fetchEmployeeDto.setOrgId((Integer) map.get("org_id"));

		return fetchEmployeeDto;
	}

	@Override
	public List<FetchEmployeeDto> fetchAllEmpUsingList(FetchEmployeeReq fetchEmployeeReq) {
	List<FetchEmployeeDto> fetchEmployeeList=new ArrayList<>();
	FetchEmployeeDto fetchEmployeeDto = null;
	String queryForEmpByList="SELECT emp_id,emp_nm,mobile_no,email_id,emp_code,org_id FROM employees_info_ref";
	StringBuilder query = new StringBuilder(queryForEmpByList);
	if ((StringUtils.isNoneBlank(fetchEmployeeReq.getEmpNm()))) {
		query.append(
				" AND concat(first_nm,middle_nm,last_nm) ilike '%' ||:empId||'%' ");

	}

	if ((StringUtils.isNoneBlank(fetchEmployeeReq.getMobileNo()))) {
		query.append("mobile_no=:mobileNo");
	}
	query.append("  order by emp_id desc ");
	List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(
			query.toString(), new BeanPropertySqlParameterSource(fetchEmployeeReq));
	if (CollectionUtils.isNotEmpty(rows)) {
		for (Map<String, Object> row : rows) {
			fetchEmployeeDto = new FetchEmployeeDto();
			fetchEmployeeDto.setEmpId((Long) row.get("emp_id"));
//			fetchEmployeeDto.setFirstNm((String) row.get("first_nm"));
//			fetchEmployeeDto.setMiddleNm((String) row.get("middle_nm"));
//			fetchEmployeeDto.setLastNm((String) row.get("last_nm"));
			fetchEmployeeDto.setMobileNo((String) row.get("mobile_no"));
			fetchEmployeeDto.setEmailId((String) row.get("email_id"));
			fetchEmployeeDto.setEmpCode((String) row.get("emp_code"));
			fetchEmployeeDto.setOrgId((Integer) row.get("org_id"));

			fetchEmployeeList.add(fetchEmployeeDto);

		}
		
	}
	return fetchEmployeeList;
}
	

	@Override
	public List<FetchEmployeeDto> fetchAllEmpDetails(FetchEmployeeReq fetchEmployeeReq) {
		
			String queryForFetchEmpByEmpIdUsingList = "SELECT emp_id,emp_nm,mobile_no,email_id,emp_code FROM employee_info_ref ";
			return namedParameterJdbcTemplate.query(queryForFetchEmpByEmpIdUsingList, new BeanPropertySqlParameterSource(fetchEmployeeReq), new BeanPropertyRowMapper<FetchEmployeeDto>(FetchEmployeeDto.class));
		}
		
	}



