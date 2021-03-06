package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachSpringApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext springContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = springContext.getBean("myCoach", Coach.class);
		System.out.println(coach.getDayliPractice());
		System.out.println(coach.getDayliFortune());
		Coach coach2 = springContext.getBean("myCoach2", Coach.class);
		System.out.println(coach2.getDayliPractice());
		System.out.println(coach2.getDayliFortune());
		springContext.close();
		
	}

}
