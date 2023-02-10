package com.practice.studentproject.repository;

import com.practice.studentproject.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CourseRepository extends CrudRepository<Course, Long> {}
