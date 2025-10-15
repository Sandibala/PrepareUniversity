package com.example.PrepareUniversity.mapper;

import com.example.PrepareUniversity.dto.CourseDto;
import com.example.PrepareUniversity.model.Course;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    CourseDto toDto(Course course);
    Course toEntity(CourseDto courseDto);
    List<CourseDto> toCourseDtoList(List<Course> courses);
}
