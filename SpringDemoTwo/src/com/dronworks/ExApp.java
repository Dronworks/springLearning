package com.dronworks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ExConfig.class);
		ExCoach coach = context.getBean("getCoach", ExCoach.class);
		System.out.println(coach.getTodaysFortune());
		System.out.println(coach.getTodaysWorkout());
		context.close();
	}

}
