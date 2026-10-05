package org.laraib.mavenlearn.repository;

import org.laraib.mavenlearn.pojo.Course;

import java.util.List;

public interface CourseRepository {

    List<Course> findAll();

    Course save(Course course);
}
