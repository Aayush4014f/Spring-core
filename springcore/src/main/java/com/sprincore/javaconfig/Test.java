package com.sprincore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {
//	ApplicationContext con = new ClassPathXmlApplicationContext("com/sprincore/javaconfig/config.xml");
	ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
	Student stud= con.getBean("temp",Student.class);
	System.out.println(stud);
	stud.study();
	
	
}
}
