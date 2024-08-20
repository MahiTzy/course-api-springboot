package com.backend.course.services;

import com.backend.course.entites.Course;

public interface CourseService {

    public Course saveCourse(Course course);


    public Course getCourseById(Long courseId);

    public void deleteCourseById(Long courseId);

    public Iterable<Course> getAllCourses();
}
