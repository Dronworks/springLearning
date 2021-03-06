package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = appContext.getBean("tennisCoach", Coach.class);
		KickboxCoach kickCoach = appContext.getBean("kickboxCoach", KickboxCoach.class);
		Coach fieldCoach = appContext.getBean("fieldCoach", Coach.class);
		System.out.println(theCoach.getDayliWorkout());
		System.err.println(kickCoach.getDayliWorkout());
		System.out.println(theCoach.getDayliFortune());
		System.out.println(kickCoach.getDayliFortune());
		System.out.println("Field fortune" + fieldCoach.getDayliFortune());
		NewCoach newCoach = appContext.getBean("newCoach", NewCoach.class);
		System.out.println(newCoach.getDayliWorkout());
		System.out.println(newCoach.getDayliFortune());
		appContext.close();
	}

}
