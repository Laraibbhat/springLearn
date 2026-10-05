package org.laraib.mavenlearn.mapper;

import org.laraib.mavenlearn.dto.CourseDto;
import org.laraib.mavenlearn.pojo.Course;

public class CourseMapper {

    public static CourseDto CourseToCourseDto(Course course) {
        CourseDto courseDto = new CourseDto();
        courseDto.setId(course.getId());
        courseDto.setName(course.getName());
        courseDto.setAuthor(course.getAuthor());
        return courseDto;

    }

    public static Course CourseDtoToCourse(CourseDto courseDto) {
        Course course = new Course();
        course.setName(courseDto.getName());
        course.setAuthor(courseDto.getAuthor());
        return course;
    }
}
