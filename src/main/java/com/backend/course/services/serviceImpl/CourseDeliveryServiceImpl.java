package com.backend.course.services.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.course.entites.CourseDelivery;
import com.backend.course.repository.CourseDeliveryRepo;
import com.backend.course.services.CourseDeliveryService;

@Service
public class CourseDeliveryServiceImpl implements CourseDeliveryService {

    @Autowired
    private CourseDeliveryRepo courseDeliveryRepository;

    public CourseDelivery saveCourseDelivery(CourseDelivery courseDelivery) {
        return courseDeliveryRepository.save(courseDelivery);
    }

    @Override
    public List<CourseDelivery> getCourseDeliveriesByYearAndSemester(int year, int semester) {
        return courseDeliveryRepository.findByYearAndSemester(year, semester);
    }

    @Override
    public CourseDelivery getCourseDeliveryByYearSemesterAndCourseId(int year, int semester, Long courseId) {
        return courseDeliveryRepository.findByYearAndSemesterAndCourseId(year, semester, courseId);
    }

    @Override
    public void deleteCourseDeliveryByYearSemesterAndCourseId(int year, int semester, Long courseId) {
        courseDeliveryRepository.deleteByYearAndSemesterAndCourseId(year, semester, courseId);
    }

}
