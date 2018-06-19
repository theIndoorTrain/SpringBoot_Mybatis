package com.xm.pojo;

import java.util.List;

/**
 * name:学生实体
 * @author xxm
 *
 */
public class Student {
	/**
	 * content:主键id
	 */
	private int id;
	/**
	 * content:姓名
	 */
	private String name;
	
	private List<Book> books;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
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
