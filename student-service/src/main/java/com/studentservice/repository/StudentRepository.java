package com.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.studentservice.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
