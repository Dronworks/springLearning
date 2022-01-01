package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach theCoach = appContext.getBean("swimCoach", SwimCoach.class);
		System.out.println(theCoach.getDayliWorkout());
		System.out.println(theCoach.getDayliFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		appContext.close();
	}

}
