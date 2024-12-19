package com.springcore.stereotype;

import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("obj")
//@Scope("singleton") //while creating object reference will be same
@Scope("prototype") //while creating object everything is new
public class Student {
	@Value("Aayush")
private String studentName;
	@Value("Delhi")
private String city;
	
	
	@Value("#{temp}")
	private List<String> address;
	
	
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + "]";
}
 


}
