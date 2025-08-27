package com.example.demo.Repositary;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Student;

public interface IStudent extends CrudRepository<Student, Integer> {

}
