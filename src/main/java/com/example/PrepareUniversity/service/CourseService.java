package com.example.PrepareUniversity.service;

import com.example.PrepareUniversity.model.Course;
import com.example.PrepareUniversity.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public List<Course> getAll(){
        return courseRepository.findAll();
    }

    public Course getById(Long id){
        return courseRepository.findById(id).orElse(null);
    }
    public void addCourse(Course course){
        courseRepository.save(course);
    }
    public void updateCourse(Long id,Course course) {
        Course updateCourse = getById(id);
        if(updateCourse == null){
            throw new RuntimeException("Student with id " + id + " not found");
        }

        updateCourse.setName(course.getName());
        updateCourse.setDescription(course.getDescription());
        updateCourse.setEdYear(course.getEdYear());
        courseRepository.save(course);
    }

    public boolean deleteCourse(Long id){
        Course course = getById(id);
        if(Objects.isNull(course)){
            return false;
        }else{
            courseRepository.deleteById(id);
            return true;
        }
    }
}
