package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		if(theCode == null) {
			return false;
		}
		boolean result = false;
		for (String tempPrefix : coursePrefix) {
            result = theCode.startsWith(tempPrefix);
            
            // if we found a match then break out of the loop
            if (result) {
                break;
            }
        }		
		return result;
	}

	

}
