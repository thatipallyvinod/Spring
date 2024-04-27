package com.sathya.spring;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService implements CourseService{

	@Override
	public void courseInfo() {
		System.out.println("This is JavaCourse Service");
		System.out.println("Like java AdvJava Spring boot");
	}

}