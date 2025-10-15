package com.example.PrepareUniversity.controller;

import com.example.PrepareUniversity.model.Course;
import com.example.PrepareUniversity.model.Student;
import com.example.PrepareUniversity.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(courseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> getById(@PathVariable(name = "id") Long id){
        return new ResponseEntity<>(courseService.getById(id),HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addCourse(@RequestBody Course course){
       courseService.addCourse(course);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateCourse(@PathVariable(name = "id") Long id,@RequestBody Course course){
        courseService.updateCourse(id,course);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable(name = "id") Long id){
        if(courseService.deleteCourse(id)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
