package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = appContext.getBean("tennisCoach", Coach.class);
		KickboxCoach kickCoach = appContext.getBean("kickboxCoach", KickboxCoach.class);
		System.out.println(theCoach.getDayliWorkout());
		System.err.println(kickCoach.getDayliWorkout());
		appContext.close();
	}

}