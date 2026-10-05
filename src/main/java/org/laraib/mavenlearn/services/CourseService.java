package org.laraib.mavenlearn.services;

import org.laraib.mavenlearn.dto.CourseDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {

    List<CourseDto> getCourses();

    void addCourse(CourseDto course);
}
