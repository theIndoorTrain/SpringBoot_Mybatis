package com.xm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value="com.xm.mapper")
@SpringBootApplication
public class Demo005MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo005MybatisApplication.class, args);
	}
}
