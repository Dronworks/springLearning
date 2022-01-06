package com.luv2code.springdemo;

public class RunnerCoach implements Coach {

	private FortuneService fortuneService;
	
	public RunnerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDayliPractice() {
		return "Run 5k";
	}
	
	@Override
	public String getDayliFortune() {
		return this.fortuneService.getFortune();
	}

}
