package com.covalense.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class CourseTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("courseConfig.xml");
		CourseBean courseBean = context.getBean(CourseBean.class);
		log.info("Course id is: " + courseBean.getCourseId());
		log.info("Course Nasme is: " + courseBean.getCourseName());
		log.info("Faculty is: " + courseBean.getFacultyName());

	}

}
