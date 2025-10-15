package com.example.PrepareUniversity.repository;

import com.example.PrepareUniversity.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
