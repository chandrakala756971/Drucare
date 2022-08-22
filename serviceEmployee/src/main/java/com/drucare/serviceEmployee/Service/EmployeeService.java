package com.drucare.serviceEmployee.Service;

import org.springframework.stereotype.Service;

import com.drucare.serviceEmployee.Bean.InsertEmployee;
import com.drucare.serviceEmployee.Bean.InsertOrUpdateEmployeeReq;

@Service
public interface EmployeeService {
//	public Boolean insertOrUpdateEmployeeReq(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);

	public Boolean insertEmployeeList(InsertEmployee insertEmployee);
}
