package com.courses.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.courses.model.Course;


@Repository
public interface CoursesRepository extends CrudRepository<Course, Long> {


}