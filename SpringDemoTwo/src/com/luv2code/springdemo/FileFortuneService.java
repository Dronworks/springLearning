package com.luv2code.springdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> fortunes;
	{
		try (Stream<String> lines = Files.lines(Paths.get("src\\fortunes.txt"))) {
			fortunes = lines.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}		
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		return fortunes.get(random.nextInt(fortunes.size()));
	}

}
