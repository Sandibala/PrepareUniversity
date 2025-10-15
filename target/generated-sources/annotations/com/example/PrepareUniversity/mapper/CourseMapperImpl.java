package com.example.PrepareUniversity.mapper;

import com.example.PrepareUniversity.dto.CourseDto;
import com.example.PrepareUniversity.model.Course;
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
public class CourseMapperImpl implements CourseMapper {

    @Override
    public CourseDto toDto(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDto courseDto = new CourseDto();

        courseDto.setEdYear( course.getEdYear() );

        return courseDto;
    }

    @Override
    public Course toEntity(CourseDto courseDto) {
        if ( courseDto == null ) {
            return null;
        }

        Course course = new Course();

        course.setEdYear( courseDto.getEdYear() );

        return course;
    }

    @Override
    public List<CourseDto> toCourseDtoList(List<Course> courses) {
        if ( courses == null ) {
            return null;
        }

        List<CourseDto> list = new ArrayList<CourseDto>( courses.size() );
        for ( Course course : courses ) {
            list.add( toDto( course ) );
        }

        return list;
    }
}
