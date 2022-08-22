package com.studentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentservice.model.Student;
import com.studentservice.service.StudentService;

@RestController
public class StudentController {
		
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentsById(@PathVariable("id") Long studentId) {
		return studentService.getStudentsById(studentId);
	}
	
	@PostMapping("/students")
	public void createStudents(@RequestBody Student student) {
		studentService.createStudents(student);
	}
	
	@PutMapping("/students/{id}")
	public void updateStudents(@PathVariable("id") Long studentId,@RequestBody Student student) {
		studentService.updateStudents(studentId,student);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudents(@PathVariable("id") Long studentId) {
		studentService.deleteStudents(studentId);
	}
}
