package com.xm.mapper;

import java.util.List;

import com.xm.pojo.Student;

public interface StudentMapper {

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Student getById(Integer id);
	
	/**
	 * 查询全部
	 * @return
	 */
	public List<Student> list();
	
	/**
	 * 插入
	 * @param student
	 */
	public int insert(Student student);
	/**
	 * 主键回填的插入
	 * @param student
	 * @return
	 */
	public int insertToId(Student student);
	
	/**
	 * 根据student的id修改
	 * @param student
	 */
	public void update(Student student);
	
	/**
	 * 根据id删除
	 * @param id
	 */
	public void delete(Integer id);
	
	
}
