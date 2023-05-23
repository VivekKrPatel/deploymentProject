package com.example.springBootDeploy.services;

import com.example.springBootDeploy.models.Student;
import com.example.springBootDeploy.repos.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    
    @Autowired
    private IStudentRepo iStudentRepo;

    public List<Student> getAllStudent() {
        return iStudentRepo.findAll();
    }

    public String addStudent(Student student) {
        Student added = iStudentRepo.save(student);
        
        if(added != null) {
            return "added";
        }
        return "failed to add";
    }

    public String printMessage() {
        return "welcome to spring boot deployment, You have deployed your project successfully";
    }
}
