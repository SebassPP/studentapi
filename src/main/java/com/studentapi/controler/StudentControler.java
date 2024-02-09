package com.studentapi.controler;

import com.studentapi.dto.StudentDTO;
import com.studentapi.model.Student;
import com.studentapi.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentControler {

    private final StudentService servicioUsuario;

    @GetMapping
    public List<Student> getStudents() {
        return servicioUsuario.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<?> crearCuenta(@RequestBody StudentDTO studentDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(servicioUsuario.createStudent(studentDTO));
    }
}
