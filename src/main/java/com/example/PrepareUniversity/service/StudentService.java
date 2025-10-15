package com.example.PrepareUniversity.service;

import com.example.PrepareUniversity.model.Student;
import com.example.PrepareUniversity.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }
    public Student getById(Long id){
        return studentRepository.findById(id).orElse(null);
    }
   public void addStudent(Student student){
       studentRepository.save(student);
   }
   public void updateStudent(Long id, Student student){
        Student updateStudent = getById(id);
       if (updateStudent == null) {
           throw new RuntimeException("Student with id " + id + " not found");
       }
        updateStudent.setName(student.getName());
        updateStudent.setSurname(student.getSurname());
       studentRepository.save(updateStudent);
   }

   public boolean deleteStudent(Long id){
        Student student = getById(id);
        if(Objects.isNull(student)){
            return false;
        }
        studentRepository.deleteById(id);
        return true;
   }

}
