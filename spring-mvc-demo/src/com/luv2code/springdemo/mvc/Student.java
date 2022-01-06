package com.luv2code.springdemo.mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private List<String> operationSystems;
	
	private HashMap<String, String> countryOptions;
	private List<String> oses = Arrays.asList("Android", "Mac OS", "Windows", "Linux");
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IL", "Israel");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public List<String> getOperationSystems() {
		return operationSystems;
	}

	public void setOperationSystems(List<String> operationSystems) {
		this.operationSystems = operationSystems;
	}

	public List<String> getOses() {
		return oses;
	}

	public void setOses(List<String> oses) {
		this.oses = oses;
	}
	
	

}
