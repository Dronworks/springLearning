package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach = appContext.getBean("swimCoach", Coach.class);
		System.out.println(theCoach.getDayliWorkout());
		System.out.println(theCoach.getDayliFortune());
		appContext.close();
	}

}
