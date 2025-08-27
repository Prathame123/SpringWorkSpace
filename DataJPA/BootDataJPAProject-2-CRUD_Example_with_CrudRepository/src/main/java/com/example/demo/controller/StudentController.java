package com.example.demo.controller;

import java.util.Optional;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentManagmentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentManagmentService service;

    public StudentController(StudentManagmentService service) {
        this.service = service;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.save(student);
    }

    @PostMapping("/bulk")
    public Iterable<Student> addStudents(@RequestBody Iterable<Student> students) {
        return service.saveAll(students);
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping
    public Iterable<Student> getAllStudents() {
        return service.findAll();
    }

    @GetMapping("/count")
    public long countStudents() {
        return service.count();
    }

    @GetMapping("/exists/{id}")
    public boolean exists(@PathVariable Integer id) {
        return service.existsById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll(@RequestBody Iterable<Student> students) {
        service.deleteAll(students);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        service.deleteAll();
    }
}
