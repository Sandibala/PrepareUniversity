package com.example.PrepareUniversity.controller;

import com.example.PrepareUniversity.model.Student;
import com.example.PrepareUniversity.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(studentService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> getById(@PathVariable(name = "id") Long id){
        return new ResponseEntity<>(studentService.getById(id),HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
      studentService.addStudent(student);
      return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable(name = "id") Long id,@RequestBody Student student){
        studentService.updateStudent(id,student);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable(name = "id") Long id){
        if(studentService.deleteStudent(id)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

