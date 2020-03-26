package com.courses.service;

import com.courses.model.Course;

public interface CourseService {

	Iterable<Course> getAllCourses();
	void saveCourse(Course course);
}
