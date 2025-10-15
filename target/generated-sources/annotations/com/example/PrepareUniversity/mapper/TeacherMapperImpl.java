package com.example.PrepareUniversity.mapper;

import com.example.PrepareUniversity.dto.TeacherDto;
import com.example.PrepareUniversity.model.Teacher;
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
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherDto toDto(Teacher teacher) {
        if ( teacher == null ) {
            return null;
        }

        TeacherDto teacherDto = new TeacherDto();

        return teacherDto;
    }

    @Override
    public Teacher toEntity(TeacherDto teacherDto) {
        if ( teacherDto == null ) {
            return null;
        }

        Teacher teacher = new Teacher();

        return teacher;
    }

    @Override
    public List<TeacherDto> toTeacherDtoList(List<Teacher> teachers) {
        if ( teachers == null ) {
            return null;
        }

        List<TeacherDto> list = new ArrayList<TeacherDto>( teachers.size() );
        for ( Teacher teacher : teachers ) {
            list.add( toDto( teacher ) );
        }

        return list;
    }
}
