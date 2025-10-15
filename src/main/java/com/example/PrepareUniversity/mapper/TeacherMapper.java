package com.example.PrepareUniversity.mapper;

import com.example.PrepareUniversity.dto.TeacherDto;
import com.example.PrepareUniversity.model.Teacher;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    TeacherDto toDto(Teacher teacher);
    Teacher toEntity(TeacherDto teacherDto);
    List<TeacherDto>  toTeacherDtoList(List<Teacher> teachers);

}
