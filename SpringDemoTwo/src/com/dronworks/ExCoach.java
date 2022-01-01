package com.dronworks;

public class ExCoach implements Coach {
	
	private Fortune fortune;
	
	public ExCoach(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getTodaysWorkout() {
		return "Do some excercise";
	}

	@Override
	public String getTodaysFortune() {
		return fortune.getFortune();
	}

}
