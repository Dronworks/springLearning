package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachSpringApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext springContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = springContext.getBean("myCoach", Coach.class);
		Coach oldCoach = springContext.getBean("myCoachOld", Coach.class);
		System.out.println(coach.getDayliPractice());
		System.out.println(oldCoach.getDayliPractice());
		springContext.close();
		
	}

}
