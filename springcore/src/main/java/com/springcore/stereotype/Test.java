package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
	//Here we have to mention the bean name, So put Class name with camel case letter that will be your bean name here 
	//and class is where you are using @Component
	//this is by default
	//Student student=(Student)con.getBean("student");
//	Student student=con.getBean("student",Student.class);
	
	
	
	//if we want to set our object name then use this:   @Component("objname")
	Student student1=con.getBean("obj",Student.class);
	Student student2=con.getBean("obj",Student.class);
//	System.out.println(student);
//	System.out.println(student.getAddress());
	System.out.println(student1 + "\n Hascode :"+student1.hashCode());
	System.out.println(student2 + "\n Hascode :"+student2.hashCode());
}

}
