package com.xm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.xm.mapper.CourseMapper;
import com.xm.pojo.Course;

/**
 * 课程
 * @author xm
 *
 */
@RestController
public class CourseController {
	@Autowired
	private CourseMapper  courseMapper;
	
	/**
	 * 根据课程id查询选修此课程的全部学生
	 * @param id
	 * @return
	 */
	@GetMapping("/course/student/{id}")
	public Course selectStudentById(@PathVariable("id")Integer id) {
		
		Course course = courseMapper.selectStudentById(id);
		return course;
		
	}

}
