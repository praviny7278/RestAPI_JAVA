package com.temp.exe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private long id;
	private String course;
	private String description;
	
	public Course(long id, String course, String description) {
		super();
		this.id = id;
		this.course = course;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", description=" + description + "]";
	}

	
	
	
}
