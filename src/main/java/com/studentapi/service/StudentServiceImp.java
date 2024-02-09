package com.studentapi.service;

import com.studentapi.dto.StudentDTO;
import com.studentapi.model.Student;
import com.studentapi.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImp implements StudentService {
    private final StudentRepository repStudent;
    @Override
    public Student createStudent(StudentDTO studentDTO) {
        Student newStudent = new Student();
        newStudent.setName(studentDTO.getName());
        return repStudent.save(newStudent);
    }

    @Override
    public List<Student> findAll() {
        return repStudent.findAll();
    }
}
