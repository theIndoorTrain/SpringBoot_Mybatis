package com.xm;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xm.mapper.StudentMapper;
import com.xm.pojo.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {
	@Autowired
	private StudentMapper studentMapper;
	
	@Test
	public void insertStudent() {
		Student student = new Student();
		student.setName("张大萨");
		int a= studentMapper.insert(student);
		System.out.println(a);
		System.out.println(student.getId());
		
		a= studentMapper.insertToId(student);
		System.out.println(a);
		System.out.println(student.getId());
		
	}
	@Test
	public void selectStudent() {
		
		/*Student student = studentMapper.getByName("郭小明");*/
		/*Student student = studentMapper.getStudentByIdAndName(1, "郭小明");*/
		Student student = new Student();
		student.setName("郭小明");
		student.setId(1);
		Student student2 = studentMapper.getStudentByIdAndName(student);
		System.out.println(student2);
		
	}
	
	@Test
	public void pageText() {
		Page page = PageHelper.startPage(1, 5);
		List<Student> students = studentMapper.list();
		for(Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println("当前页："+page.getPageNum());
		System.out.println("当前页数据数："+page.getPageSize());
		System.out.println("页总数："+page.getPages());
		System.out.println("数据总数："+page.getTotal());
		System.out.println("第3个数据详情："+page.get(2));
	}
	

}
