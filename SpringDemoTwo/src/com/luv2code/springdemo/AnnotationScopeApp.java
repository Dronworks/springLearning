package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach second = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach == second);
		System.out.println(coach);
		System.out.println(second);
		context.close();
	}

}
