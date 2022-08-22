package com.drucare.fetch_employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.fetch_employee.bean.FetchEmployeeDto;
import com.drucare.fetch_employee.bean.FetchEmployeeReq;
import com.drucare.fetch_employee.dao.FetchEmpDao;

@Service
public class FetchEmpServiceImpl implements FetchEmpService {
	@Autowired
	private FetchEmpDao fetchEmpDao;

	@Override
	public String fetchEmpByObject(FetchEmployeeReq fetchEmployeeReq) {
		
		return fetchEmpDao.fetchEmpByObject(fetchEmployeeReq);
	}

	@Override
	public FetchEmployeeDto fetchEmpByEmpIdUsingMap(FetchEmployeeReq fetchEmployeeReq) {
	
		return fetchEmpDao.fetchEmpByEmpIdUsingMap(fetchEmployeeReq);
	}

	@Override
	public List<FetchEmployeeDto> fetchAllEmpUsingList(FetchEmployeeReq fetchEmployeeReq) {
	
		return fetchEmpDao.fetchAllEmpUsingList(fetchEmployeeReq);
	}

	@Override
	public List<FetchEmployeeDto> fetchAllEmpDetails(FetchEmployeeReq fetchEmployeeReq) {
		
		return fetchEmpDao.fetchAllEmpDetails(fetchEmployeeReq);
	}

}
