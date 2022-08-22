package com.drucare.InsertOrUpdate.dao;

import org.springframework.stereotype.Repository;

import com.drucare.InsertOrUpdate.bean.Employee;

@Repository
public interface InsertOrUpdateDao {

  Long insertEmployeeDetails(Employee employeeObj);

Boolean updateEmployeeDetails(Employee employeeObj);

}
