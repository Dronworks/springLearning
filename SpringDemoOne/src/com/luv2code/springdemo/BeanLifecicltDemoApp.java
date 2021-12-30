package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecicltDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContext =
				new ClassPathXmlApplicationContext("beanLifecicle-applicationContext.xml");
		Coach theCoach = springContext.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDayliFortune());
		springContext.close();
	}

}
