package com.temp.exe.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.temp.exe.dao.CourseDao;
import com.temp.exe.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	//List<Course> list;
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(1, "java", "This is java dec"));
//		list.add(new Course(2, "Mysql", "This is Mysql dec"));
	}
	
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course courses) {
		
//		list.forEach(e -> {
//			if(e.getId() == courses.getId()) {
//				e.setCourse(courses.getCourse());
//				e.setDescription(courses.getDescription());
//			}
//		});
		courseDao.save(courses);
		return courses;
	}
	
	
	@Override
	public void deleteCourse(long parseLong) {
		//list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
		@SuppressWarnings("deprecation")
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
		
		
		
	}

}
