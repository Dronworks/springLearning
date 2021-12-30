package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class BaseballCoach implements Coach, DisposableBean {
	
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

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying: " + this);
	}

}
