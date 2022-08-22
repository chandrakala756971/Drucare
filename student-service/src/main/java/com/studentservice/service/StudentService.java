package com.studentservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentservice.model.Student;
import com.studentservice.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		List<Student> students=new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}

	public Student getStudentsById(Long studentId) {
		return studentRepository.findById(studentId).get();
	}

	public void createStudents(Student student) {
		studentRepository.save(student);
	}

	public void updateStudents(Long studentId, Student student) {
		studentRepository.save(student);
	}

	public void deleteStudents(Long studentId) {
		studentRepository.deleteById(studentId);
	}
	

}
