package com.drucare.InsertOrUpdate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.InsertOrUpdate.bean.InsertOrUpdateReq;
import com.drucare.InsertOrUpdate.service.InsertOrUpdateService;

@RestController
public class InsertOrUpdateController {
@Autowired
InsertOrUpdateService insertOrUpdateService;

@PostMapping("/EmployeeDetails")
public Boolean insertOrUpdateInBatch(@RequestBody InsertOrUpdateReq insertOrUpdateEmployeeReq) {
	return insertOrUpdateService.insertOrUpdateInBatch(insertOrUpdateEmployeeReq);

}
	
}
