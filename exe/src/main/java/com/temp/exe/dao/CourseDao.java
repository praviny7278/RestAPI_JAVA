package com.temp.exe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temp.exe.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

	
	
}
