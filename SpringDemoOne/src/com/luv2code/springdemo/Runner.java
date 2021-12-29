package com.luv2code.springdemo;

public class Runner {

	public static void main(String[] args) {
		
		Coach coach = new RunnerCoach(new HappyFortuneService());
		System.out.println(coach.getDayliPractice());
		
	}
	
}
