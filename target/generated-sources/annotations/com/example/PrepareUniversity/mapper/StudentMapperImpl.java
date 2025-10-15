package com.example.PrepareUniversity.mapper;

import com.example.PrepareUniversity.dto.StudentDto;
import com.example.PrepareUniversity.model.Student;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-15T06:08:41+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.8 (Microsoft)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDto toDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        return studentDto;
    }

    @Override
    public Student toEntity(StudentDto studentDto) {
        if ( studentDto == null ) {
            return null;
        }

        Student student = new Student();

        return student;
    }

    @Override
    public List<StudentDto> toStudentDtoList(List<Student> students) {
        if ( students == null ) {
            return null;
        }

        List<StudentDto> list = new ArrayList<StudentDto>( students.size() );
        for ( Student student : students ) {
            list.add( toDto( student ) );
        }

        return list;
    }
}
