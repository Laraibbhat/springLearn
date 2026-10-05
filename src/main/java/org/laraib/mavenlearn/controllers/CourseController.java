package org.laraib.mavenlearn.controllers;

import org.laraib.mavenlearn.dto.CourseDto;
import org.laraib.mavenlearn.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/course")
    public ResponseEntity<List<CourseDto>> getCourseDetails() {
        System.out.println("CourseController: Getting course details");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(courseService.getCourses());
    }

    @PostMapping("/course")
    public ResponseEntity<String> addCourse(@RequestBody CourseDto course) {
        courseService.addCourse(course);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Courses added successfully");
    }
}
