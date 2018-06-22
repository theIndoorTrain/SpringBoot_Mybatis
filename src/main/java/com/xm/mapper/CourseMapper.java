package com.xm.mapper;

import com.xm.pojo.Course;

public interface CourseMapper {
	/**
	 * 根据课程id查询选修此课程的全部学生
	 * @param id
	 * @return
	 */
	public Course selectStudentById(Integer id);

}
