package com.backend.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.course.entites.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {

}
