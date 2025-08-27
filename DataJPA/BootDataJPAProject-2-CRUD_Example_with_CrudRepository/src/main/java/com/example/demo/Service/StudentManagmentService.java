package com.example.demo.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repositary.IStudent;

@Service
public class StudentManagmentService {
	 private final IStudent repository;

	    public StudentManagmentService(IStudent repository) {
	        this.repository = repository;
	    }

	    // Create or Update
	    public Student save(Student student) {
	        return repository.save(student);
	    }

	    // Save multiple
	    public Iterable<Student> saveAll(Iterable<Student> students) {
	        return repository.saveAll(students);
	    }

	    // Read by ID
	    public Optional<Student> findById(Integer id) {
	        return repository.findById(id);
	    }

	    // Read all
	    public Iterable<Student> findAll() {
	        return repository.findAll();
	    }

	    // Read multiple by IDs
	    public Iterable<Student> findAllById(Iterable<Integer> ids) {
	        return repository.findAllById(ids);
	    }

	    // Count
	    public long count() {
	        return repository.count();
	    }

	    // Exists by ID
	    public boolean existsById(Integer id) {
	        return repository.existsById(id);
	    }

	    // Delete by ID
	    public void deleteById(Integer id) {
	        repository.deleteById(id);
	    }

	    // Delete entity
	    public void delete(Student student) {
	        repository.delete(student);
	    }

	    // Delete all by IDs
	    public void deleteAllById(Iterable<? extends Integer> ids) {
	        repository.deleteAllById(ids);
	    }

	    // Delete multiple entities
	    public void deleteAll(Iterable<? extends Student> students) {
	        repository.deleteAll(students);
	    }

	    // Delete all
	    public void deleteAll() {
	        repository.deleteAll();
	    }
}
