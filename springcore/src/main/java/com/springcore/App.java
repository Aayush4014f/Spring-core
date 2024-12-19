 package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        /* 
         if we have multiple spring bean configuration file then we can pass it array of config files
         Example:
         
          new ClassPathXmlApplicationContext(new String[] {"config.xml"."cofig2.xml"});
         * */
       Student student = (Student)context.getBean("student");
       Student student1=(Student)context.getBean("student1");
       Student student2=(Student)context.getBean("student2");
       Student student3=(Student)context.getBean("student3");
       System.out.println(student);
       System.out.println(student1);
       System.out.println(student2);
       System.out.println(student3);
      
       
    }
}
 