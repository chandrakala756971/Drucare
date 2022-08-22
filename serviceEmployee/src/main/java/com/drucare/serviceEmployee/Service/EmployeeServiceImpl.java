package com.drucare.serviceEmployee.Service;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Service;

import com.drucare.serviceEmployee.Bean.DeptBean;
import com.drucare.serviceEmployee.Bean.DesignationBean;
import com.drucare.serviceEmployee.Bean.EmployeeBean;
import com.drucare.serviceEmployee.Bean.EmployeeDeptXref;
import com.drucare.serviceEmployee.Bean.EmployeeDesignationXref;
import com.drucare.serviceEmployee.Bean.InsertEmployee;
import com.drucare.serviceEmployee.Bean.InsertOrUpdateEmployeeReq;
import com.drucare.serviceEmployee.Dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;

/*	@Override
	public Boolean insertOrUpdateEmployeeReq(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
		if (insertOrUpdateEmployeeReq.getEmpId() == null) {
			return employeeDao.insertEmployeeDetails(insertOrUpdateEmployeeReq);
		} else {
			return employeeDao.updateEmployeeDetails(insertOrUpdateEmployeeReq);
		}
		//		return employeeDao.insertOrUpdateEmployeeReq(insertOrUpdateEmployeeReq);
	}*/

	@Override
	public Boolean insertEmployeeList(InsertEmployee insertEmployee) {
		Long empId = null;
		for (EmployeeBean employeeObj : insertEmployee.getEmpList()) {
			employeeObj.setOrgId(insertEmployee.getOrgId());
			if (employeeObj.getEmpId() == null) {
				empId = employeeDao.insertEmployee(employeeObj);
				employeeObj.setEmpId(empId);
			} else {
				employeeDao.updateEmployee(employeeObj);
			}
			if(CollectionUtils.isNotEmpty(employeeObj.getDeptList())) {
				//employeeDao.insertemployeeDepartments(employeeObj,insertEmployee.getOrgId());
				for(DeptBean deptObj:employeeObj.getDeptList()) {
					MapSqlParameterSource parametrs=new MapSqlParameterSource();
					parametrs.addValue("orgId", insertEmployee.getOrgId());
					parametrs.addValue("empId", employeeObj.getEmpId());
					parametrs.addValue("deptId", deptObj.getDeptId());
				}
				//employeeDao.insertemployeeDepartments(employeeObj);
			}

			if(CollectionUtils.isNotEmpty(employeeObj.getDesignationList())) {
				for(DesignationBean desigantionObj:employeeObj.getDesignationList()) {
					MapSqlParameterSource parametrs=new MapSqlParameterSource();
					parametrs.addValue("orgId", insertEmployee.getOrgId());
					parametrs.addValue("empId", employeeObj.getEmpId());
					parametrs.addValue("designationId", desigantionObj.getDesignationId());
				}
			}
		/*	if(CollectionUtils.isNotEmpty(employeeObj.getEmployeeDeptXrefList())) {
				for(EmployeeDeptXref employeeDetpXrefObj:employeeObj.getEmployeeDeptXrefList()) {
					MapSqlParameterSource parametrs=new MapSqlParameterSource();
					parametrs.addValue("orgId", insertEmployee.getOrgId());
					parametrs.addValue("empId", employeeObj.getEmpId());
					parametrs.addValue("empDeptId", employeeDetpXrefObj.getDeptId());
				}
			}
			if(CollectionUtils.isNotEmpty(employeeObj.getEmployeeDesignationXrefList())) {
				for(EmployeeDesignationXref employeeDesignationXrefObj:employeeObj.getEmployeeDesignationXrefList()){
					MapSqlParameterSource parametrs=new MapSqlParameterSource();
					parametrs.addValue("orgId", insertEmployee.getOrgId());
					parametrs.addValue("empId", employeeObj.getEmpId());
					parametrs.addValue("empDesignationId", employeeDesignationXrefObj.getEmpDesignationId());
				}
			}
		*/}
		return true;
	}
}
