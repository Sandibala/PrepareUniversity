package com.example.PrepareUniversity.controller;

import com.example.PrepareUniversity.model.Teacher;
import com.example.PrepareUniversity.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teachers")
@RequiredArgsConstructor
public class TeacherController {
private final TeacherService teacherService;
@GetMapping("/all")
    public ResponseEntity<?> getAll(){
    return new ResponseEntity<>(teacherService.getAll(), HttpStatus.OK);
}

@GetMapping("/find/{id}")
    public ResponseEntity<?> getById(@PathVariable(name = "id") Long id){
    return new ResponseEntity<>(teacherService.getById(id), HttpStatus.OK);
}

@PostMapping("/add")
    public ResponseEntity<?> addTeacher(@RequestBody Teacher teacher){
    teacherService.addTeacher(teacher);
    return new ResponseEntity<>(HttpStatus.OK);
}

@PutMapping("/update/{id}")
    public ResponseEntity<?> updateTeacher(@PathVariable(name = "id") Long id, @RequestBody Teacher teacher){
    teacherService.updateTeacher(id,teacher);
    return  new ResponseEntity<>(HttpStatus.OK);
}

@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTeacher(@PathVariable(name = "id") Long id){
    if(teacherService.deleteTeacher(id)){
        return new ResponseEntity<>(HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

}
