package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	@Value("${type}")
	private String type;

	@Override
	public String getFortune() {
		return type + " is in the Air!";
	}

}
