package com.example.PrepareUniversity.repository;

import com.example.PrepareUniversity.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Long> {
}
