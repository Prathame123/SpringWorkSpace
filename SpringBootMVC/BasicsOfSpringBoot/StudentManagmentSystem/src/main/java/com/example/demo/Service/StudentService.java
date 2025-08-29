package com.example.demo.Service;

import java.util.List;

import com.example.student.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student getStudentById(Long id);
	Student saveStudent(Student student);
	void deleteStudent(Long id);
}