package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	private void start() { 
		System.out.println("Starting method");

	}
	
	@PreDestroy
	private void end() {
		System.out.println("ending method");
	}
	//by default @PostCOnstruct and @PreDestroy are disabled
	//for enabling all the annotations jyst go to xml file
	//and use <context:annotation-config/>

}
