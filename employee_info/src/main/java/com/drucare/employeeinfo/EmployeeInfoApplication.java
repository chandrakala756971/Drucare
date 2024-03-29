package com.drucare.employeeinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@SpringBootApplication
@PropertySource({"classpath:application.properties"})
public class EmployeeInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeInfoApplication.class, args);
	}

}
