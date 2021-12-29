package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FortuneCockieService implements FortuneService {
	
	private List<String> fortunes = new ArrayList<>() {{
		add("Today you will find your love!");
		add("Today you will get some cash!");
		add("Today you will get lucky!");
	}};

	@Override
	public String getFortune() {
		Random rand = new Random();
	    return fortunes.get(rand.nextInt(fortunes.size()));
	}

}
