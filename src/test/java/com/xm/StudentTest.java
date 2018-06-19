package com.xm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
	

}
