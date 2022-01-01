package com.dronworks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExConfig {

	@Bean
	public Fortune getFortune() {
		return new StupidFortune();
	}
	
	@Bean
	public ExCoach getCoach() {
		return new ExCoach(getFortune());
	}
	
}
