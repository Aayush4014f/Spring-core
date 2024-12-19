package com.springcore.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//1.using xml
//		samosa s1=(samosa)context.getBean("s1");
//		System.out.println(s1);
//		
		//this is for clean and destroy the bean
		//registering shutdown
		//this is inside AbstractApplicationContext interface 
		
		context.registerShutdownHook();
		
//		System.out.println("**********************************************");
//		2.using interface
//		pepsi p1 =(pepsi) context.getBean("p1");
//		System.out.println(p1);
		
//		3.using annotation
		Example example=(Example) context.getBean("example");
		System.out.println(example);

	}

}
