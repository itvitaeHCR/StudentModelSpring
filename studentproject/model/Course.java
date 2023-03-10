package com.practice.studentproject.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer credits;

    // RELATIONSHIP - owned side
    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<>();

    // CONSTRUCTORS

    public Course() {}

    public Course(String name, Integer credits) {
        this.name = name;
        this.credits = credits;
    }

    // GETTERS AND SETTERS

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
