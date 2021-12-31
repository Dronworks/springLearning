package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("dBFortuneService")
public class DBFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Some DB fortune";
	}

}
