package com.studentapi.service;

import com.studentapi.dto.StudentDTO;
import com.studentapi.model.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(StudentDTO student);
    List<Student> findAll();
}
