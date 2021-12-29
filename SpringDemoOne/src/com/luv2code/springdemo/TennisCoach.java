package com.luv2code.springdemo;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach() {
	}

	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDayliPractice() {
		return "Play with some chicks";
	}
	
	@Override
	public String getDayliFortune() {
		return this.fortuneService.getFortune();
	}

}
