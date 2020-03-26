package com.courses.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.model.Course;
import com.courses.repository.CoursesRepository;
import com.courses.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CoursesRepository coursesRepository;
	@Override
	public Iterable<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return coursesRepository.findAll();
		
	}
	@Override
	public void saveCourse(Course course) {
		coursesRepository.save(course);
		
	}
}


