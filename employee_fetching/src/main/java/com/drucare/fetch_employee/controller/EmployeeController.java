package com.drucare.fetch_employee.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.fetch_employee.bean.FetchEmployeeDto;
import com.drucare.fetch_employee.bean.FetchEmployeeReq;
import com.drucare.fetch_employee.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@ApiResponses(value= {@ApiResponse(code=401,message="you are not to view resource"),
		@ApiResponse(code=402,message="Accessing the resource your write trying to reach in forbidden"),
		@ApiResponse(code=403,message="the resource you write trying to reach not found "),
		@ApiResponse(code=404,message="bad request"),
		@ApiResponse(code=405,message="internal server error"),

})

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@ApiOperation(value="this api is used to insert employee details")
	@GetMapping("/fetchEmployeeNameByEmpIdUsingObject")
	String fetchEmployeeNameByEmpIdUsingObject(@RequestBody FetchEmployeeReq fetchEmployeeRequest) {
		return employeeService.fetchEmployeeNameByEmpIdUsingObject(fetchEmployeeRequest);
	}

	@ApiOperation(value="this api is used to insert employee details")

	@GetMapping("/fetchEmployeeNameByEmpIdUsingMap")
	public FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(@RequestBody FetchEmployeeReq fetchEmployeeRequest) {
		return employeeService.fetchEmployeeNameByEmpIdUsingMap(fetchEmployeeRequest);
	}

	@ApiOperation(value="this api is used to insert employee details")

	@GetMapping("/fetchAllEmployeesUsingList")
	public List<FetchEmployeeDto> fetchAllEmployeesUsingList(@RequestBody FetchEmployeeReq fetchEmployeeRequest) {
		return employeeService.fetchAllEmployeesUsingList(fetchEmployeeRequest);
	}

	@ApiOperation(value="this api is used to insert employee details")

	@GetMapping("/fetchAllEmployeeDetails")
	public List<FetchEmployeeDto> fetchAllEmployeeDetails(@RequestBody  FetchEmployeeReq  fetchEmployeeRequest) {
		return employeeService.fetchAllEmployeeDetails(fetchEmployeeRequest);
	}
	
	@ApiOperation(value="this api is used to insert employee details")

	@GetMapping("/fetchEmployeeDetails")
	public List<FetchEmployeeDto> fetchEmployeeDetails(@RequestBody  FetchEmployeeReq  fetchEmployeeRequest){
		return employeeService.fetchEmployeeDetails(fetchEmployeeRequest);
	}
	
}
