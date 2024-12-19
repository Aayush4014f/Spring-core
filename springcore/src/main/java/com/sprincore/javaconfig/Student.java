package com.sprincore.javaconfig;


import org.springframework.stereotype.Component;

//@Component("student")
public class Student {
	
	private Samosa samosa;
	
	
public void study() {
	this.samosa.display();
	System.out.println("Student is watching Movie");
}


public Samosa getSamosa() {
	return samosa;
}
 


public Student(Samosa samosa) {
	super();
	this.samosa = samosa;
}


public void setSamosa(Samosa samosa) {
	this.samosa = samosa;
}
}
