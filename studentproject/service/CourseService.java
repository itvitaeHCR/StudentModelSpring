package com.practice.studentproject.service;

import com.practice.studentproject.repository.CourseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

}
