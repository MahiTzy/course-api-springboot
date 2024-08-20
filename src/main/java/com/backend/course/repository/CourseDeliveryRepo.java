package com.backend.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.course.entites.CourseDelivery;

@Repository
public interface CourseDeliveryRepo extends JpaRepository<CourseDelivery, Long> {
    List<CourseDelivery> findByYearAndSemester(int year, int semester);
    CourseDelivery findByYearAndSemesterAndCourseId(int year, int semester, Long courseId);
    void deleteByYearAndSemesterAndCourseId(int year, int semester, Long courseId);
}
