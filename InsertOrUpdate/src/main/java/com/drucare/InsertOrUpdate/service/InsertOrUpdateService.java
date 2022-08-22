package com.drucare.InsertOrUpdate.service;

import org.springframework.stereotype.Service;

import com.drucare.InsertOrUpdate.bean.InsertOrUpdateReq;
@Service
public interface InsertOrUpdateService {

	Boolean insertOrUpdateInBatch(InsertOrUpdateReq insertOrUpdateEmployeeReq);

}
