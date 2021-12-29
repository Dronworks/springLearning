package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDayliPractice() {
		return "Play for 30 minutes";
	}

	@Override
	public String getDayliFortune() {
		return this.fortuneService.getFortune();
	}

}
