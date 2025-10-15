package com.example.PrepareUniversity.mapper;

import com.example.PrepareUniversity.dto.StudentDto;
import com.example.PrepareUniversity.model.Student;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDto toDto(Student student);
    Student  toEntity(StudentDto studentDto);
    List<StudentDto>  toStudentDtoList(List<Student> students);

}
