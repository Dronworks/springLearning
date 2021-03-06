package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach Setting email: " + emailAddress);
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach Setting team: " + team);
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Building CrictetCoach");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Setting fortune");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDayliPractice() {
		return "Play cricket for an hour";
	}

	@Override
	public String getDayliFortune() {
		return "Cricket fortune: " + fortuneService.getFortune();
	}

}
