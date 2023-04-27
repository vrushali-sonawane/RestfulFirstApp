package com.Bikkadit.RestfulFirstApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/WelcomeController")
public class WelcomeController {

	@GetMapping("/welcome")
	public String WelMessage1() {
		String msg="Welcome to BikkadIT";
		return msg;
	}
	
	@GetMapping("/welcome1") //unique url is allowed
	public String WelMessage2() {
		String msg="Welcome To The World of JAVA";
	   return msg;	
	}
	
	
}
