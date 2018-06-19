package com.xm.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xm.mapper.StudentMapper;
import com.xm.pojo.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentMapper studentMapper;
	
	/**
	 * 根据id查询学生
	 * @param id
	 * @return
	 */
	@GetMapping("/student/{id}")
	public Student getById(@PathVariable("id") Integer id) {
		
		Student student = studentMapper.getById(id);
		return student;
		
	}
	
	/**
	 * 查询全部
	 * @return
	 */
	@GetMapping("/students")
	public List<Student> list(){
		List<Student> students = studentMapper.list();
		return students;
	}
	
	/**
	 * 插入
	 * @param student
	 */
	@PostMapping("/student")
	public void insert( Student student) {
		studentMapper.insert(student);
	}
	
	/**
	 * 修改
	 * @param student
	 */
	@PutMapping("/student/{id}")
	public void update(Student student,@PathVariable("id")Integer id) {
		studentMapper.update(student);
	}
	
	/**
	 * 根据id删除
	 * @param id
	 */
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable("id") Integer id) {
		studentMapper.delete(id);
	}
	
	/**
	 * 根据id查询所有的书
	 */
	@GetMapping("/student/book/{id}")
	public Student getBooks(@PathVariable("id") Integer id) {
		Student student = studentMapper.selectBookById(id);
		return student;
	}

}
