package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDomoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach coach = springContext.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(coach.getDayliFortune());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		Coach tennisCoach = springContext.getBean("myCoach", Coach.class);
		System.out.println(tennisCoach.getDayliFortune());
		springContext.close();
	}

}
