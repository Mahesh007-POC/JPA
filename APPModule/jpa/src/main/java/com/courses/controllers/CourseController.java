package com.courses.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.courses.model.AuthorizationToken;
import com.courses.model.Course;
import com.courses.service.CourseService;

@RestController
@RequestMapping("/")

public class CourseController {

	@Autowired
	CourseService courseService;
	
	@RequestMapping(path="courses",method=RequestMethod.GET,produces="application/json")
	Iterable<Course> getAllCourses() {
		
		return courseService.getAllCourses();
	}
	
	@RequestMapping(path="token",method=RequestMethod.POST,produces="application/json")
	AuthorizationToken getAuthorizationToken() {
		
		return new AuthorizationToken();
	}	
	
	@RequestMapping(path="courses",method=RequestMethod.POST,produces="application/json")
	void Courses(@RequestBody Course course ) {
		
		 courseService.saveCourse(course);
	}
	
}
