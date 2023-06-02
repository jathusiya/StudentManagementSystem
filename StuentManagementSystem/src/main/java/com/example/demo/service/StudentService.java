package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
	void deleteStudentById(Long Id);
    
	
}
