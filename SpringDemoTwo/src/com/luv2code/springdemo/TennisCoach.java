package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("BUILTINK!");
	}
	
	@Override
	public String getDayliWorkout() {
		return "Practice your backend volley";
	}

	@Override
	public String getDayliFortune() {
		return fortuneService.getFortune();
	}
	
	@PreDestroy
	private void preDestroy() {
		System.out.println("BEING DESTROYED...");
	}
	
	@PostConstruct
	private void init() {
		System.out.println("YEY IM BUILT!");		
	}

}
