package com.drucare.InsertOrUpdate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.InsertOrUpdate.bean.Employee;
import com.drucare.InsertOrUpdate.bean.InsertOrUpdateReq;
import com.drucare.InsertOrUpdate.dao.InsertOrUpdateDao;

@Service
public class InsertOrUpdateServiceImpl implements InsertOrUpdateService{

	@Autowired
	InsertOrUpdateDao insertOrUpdateDao;
	
	@Override
	public Boolean insertOrUpdateInBatch(InsertOrUpdateReq insertOrUpdateReq) {
		

		for (Employee employeeObj : insertOrUpdateReq.getEmployeeList()) {
			employeeObj.setOrgId(insertOrUpdateReq.getOrgId());
			
			
			if (employeeObj.getEmpId() == null) {
				insertOrUpdateDao.insertEmployeeDetails(employeeObj);
			} else {
				insertOrUpdateDao.updateEmployeeDetails(employeeObj);
		}		
		
	}
		return null;

	}
}
