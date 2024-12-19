package com.sprincore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.sprincore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	

	@Bean(name= {"student", "temp", "con"})
	public Student getStudent() {
	//Reurning bean name will be same to method name getStudent
		
		
		//creating new student object
		Student student = new Student(getSamosa());
		return student;
	}
}
