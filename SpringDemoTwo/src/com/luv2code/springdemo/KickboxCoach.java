package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class KickboxCoach implements Coach {

	@Override
	public String getDayliWorkout() {
		return "Kick some kids for fun";
	}

}
