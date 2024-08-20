package com.backend.course.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.backend.course.entites.CourseDelivery;

public interface CourseDeliveryService {

    public CourseDelivery saveCourseDelivery(CourseDelivery courseDelivery);

    public List<CourseDelivery> getCourseDeliveriesByYearAndSemester(int year, int semester);

    public CourseDelivery getCourseDeliveryByYearSemesterAndCourseId(int year, int semester, Long courseId);

    @Transactional
    public void deleteCourseDeliveryByYearSemesterAndCourseId(int year, int semester, Long courseId);

}
