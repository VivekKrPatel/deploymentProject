package com.example.springBootDeploy.controllers;

import com.example.springBootDeploy.models.Student;
import com.example.springBootDeploy.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @PostMapping("/")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("msg")
    public String printMessage() {
        return studentService.printMessage();
    }

}
