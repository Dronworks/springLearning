package com.luv2code.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=3, message="minimum size is 3")
	private String lastName;
	
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

}
