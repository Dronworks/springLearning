package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldCoach implements Coach {
	
	@Autowired
	@Qualifier("RESTFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDayliWorkout() {
		return "Do some field investigation";
	}

	@Override
	public String getDayliFortune() {
		return fortuneService.getFortune();
	}

}
