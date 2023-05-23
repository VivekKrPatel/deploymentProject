package com.example.springBootDeploy.repos;

import com.example.springBootDeploy.models.Student;
import org.springframework.data.repository.ListCrudRepository;

public interface IStudentRepo extends ListCrudRepository<Student,Long> {

}
