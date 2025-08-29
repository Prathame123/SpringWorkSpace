package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.model.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {
} 