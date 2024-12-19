package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
	
//	Person p1 = (Person)con.getBean("person1",Person.class);
	Person p2 = (Person)con.getBean("person2",Person.class);
//	System.out.println(p1);
//	System.out.println(p1.getFriends().getClass());
	System.out.println(p2);
	System.out.println(p2.getFriends().getClass());
	System.out.println(p2.getFeestructure());
	System.out.println(p2.getProperties());
}
}
