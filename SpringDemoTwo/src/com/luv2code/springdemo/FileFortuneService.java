package com.luv2code.springdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> fortunes;
	
	private Random random = new Random();
	
	public FileFortuneService() {
		System.out.println("Building file fortune");
	}
	
	@PostConstruct
	private void fillFortunes() {
		System.out.println("Filling fortunes");
		try (Stream<String> lines = Files.lines(Paths.get("src\\fortunes.txt"))) {
			fortunes = lines.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		return fortunes.get(random.nextInt(fortunes.size()));
	}

}
