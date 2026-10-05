package org.laraib.mavenlearn.services;

import org.laraib.mavenlearn.dto.CourseDto;
import org.laraib.mavenlearn.mapper.CourseMapper;
import org.laraib.mavenlearn.pojo.Course;
import org.laraib.mavenlearn.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseDto> getCourses() {
        List<Course> courses = courseRepository.findAll();
        System.out.println("courses size: " + courses.size());
        System.out.println("courses: " + courses);
        List<CourseDto> courseDtos = new ArrayList<>();
        for (Course course : courses) {
            courseDtos.add(CourseMapper.CourseToCourseDto(course));
        }
        System.out.println("courseDtos: " + courseDtos);
        return courseDtos;
    }

    @Override
    public void addCourse(CourseDto course) {
        Course courseEntity = CourseMapper.CourseDtoToCourse(course);
        courseRepository.save(courseEntity);
    }
}
