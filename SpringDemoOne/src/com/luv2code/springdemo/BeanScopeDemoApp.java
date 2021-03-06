package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContext =
				new ClassPathXmlApplicationContext("beanscope-applicationContext2.xml");
		Coach theCoach = springContext.getBean("myCoach", Coach.class);
		Coach alphaCoach = springContext.getBean("myCoach", Coach.class);
		boolean result = (theCoach == alphaCoach);
		System.out.println("Are same: " + result);
		System.out.println("The coach memory" + theCoach);
		System.out.println("Alpha coach memory" + alphaCoach);
		springContext.close();
	}

}
