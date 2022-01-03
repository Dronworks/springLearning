package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processFormV2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String theName = request.getParameter("studentname");
		theName = theName.toUpperCase();
		theName = "YO Mama! " + theName;
		model.addAttribute("result", theName);
		return "helloworld";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

}
