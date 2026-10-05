package org.laraib.mavenlearn.repository;

import jakarta.persistence.EntityManager;
import org.laraib.mavenlearn.pojo.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    private final EntityManager entityManager;

    public CourseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    String GET_ALL_COURSES = "SELECT c FROM Course c";

    @Override
    public List<Course> findAll() {
        System.out.println("CourseRespositoryImpl.findAll() called");

        return entityManager
                .createQuery(GET_ALL_COURSES, Course.class)
                .getResultList();
    }

    @Override
    @Transactional
    public Course save(Course course) {
        System.out.println("CourseRespositoryImpl.saveCourse() called" + course);
        entityManager.persist(course);
        return course;
    }
}
