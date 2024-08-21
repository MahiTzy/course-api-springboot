package com.backend.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.course.entites.CourseDelivery;
import com.backend.course.services.CourseDeliveryService;

@RestController
@RequestMapping("/api/instances")
@CrossOrigin("*")
public class CourseDeliveryController {
@Autowired
    private CourseDeliveryService courseDeliveryService;

    @PostMapping
    public CourseDelivery createCourseDelivery(@RequestBody CourseDelivery courseDelivery) {
        return courseDeliveryService.saveCourseDelivery(courseDelivery);
    }

    @GetMapping("/{year}/{semester}")
    public List<CourseDelivery> getCoursesByYearAndSemester(
            @PathVariable int year,
            @PathVariable int semester) {
        return courseDeliveryService.getCourseDeliveriesByYearAndSemester(year, semester);
    }

    @GetMapping("/{year}/{semester}/{courseId}")
    public CourseDelivery getCourseDelivery(
            @PathVariable int year,
            @PathVariable int semester,
            @PathVariable Long courseId) {
        return courseDeliveryService.getCourseDeliveryByYearSemesterAndCourseId(year, semester, courseId);
    }

    @DeleteMapping("/{year}/{semester}/{courseId}")
    public void deleteCourseDelivery(
            @PathVariable int year,
            @PathVariable int semester,
            @PathVariable Long courseId) {
        courseDeliveryService.deleteCourseDeliveryByYearSemesterAndCourseId(year, semester, courseId);
    }
}
