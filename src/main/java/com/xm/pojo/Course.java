package com.xm.pojo;

import java.util.List;

/**
 * 课程实体
 * @author xm
 *
 */
public class Course {
	private int id;
	private String name;
	private List<StudentCourse> studentCourses;
	
	public List<StudentCourse> getStudentCourses() {
		return studentCourses;
	}
	public void setStudentCourses(List<StudentCourse> studentCourses) {
		this.studentCourses = studentCourses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
