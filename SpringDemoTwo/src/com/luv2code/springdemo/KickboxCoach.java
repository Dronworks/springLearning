package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class KickboxCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public String getDayliWorkout() {
		return "Kick some kids for fun";
	}

	@Override
	public String getDayliFortune() {
		return fortuneService.getFortune();
	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void noJustserFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
