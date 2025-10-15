package com.example.PrepareUniversity.service;

import com.example.PrepareUniversity.model.Student;
import com.example.PrepareUniversity.model.Teacher;
import com.example.PrepareUniversity.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    public Teacher getById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public void updateTeacher(Long id, Teacher teacher) {
        Teacher updateTeacher = getById(id);
        if (updateTeacher == null) {
            throw new RuntimeException("Student with id " + id + " not found");
        }
        updateTeacher.setName(teacher.getName());
        updateTeacher.setSurname(teacher.getSurname());
        teacherRepository.save(updateTeacher);
    }

    public boolean deleteTeacher(Long id) {
        Teacher teacher = getById(id);
        if (Objects.isNull(teacher)) {
            return false;
        } else {
            teacherRepository.deleteById(id);
             return true;
        }


    }
}
