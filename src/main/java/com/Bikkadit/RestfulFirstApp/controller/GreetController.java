package com.Bikkadit.RestfulFirstApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GreetController")//for unique url at class level url is declared
public class GreetController {

	@GetMapping("/welcome")
	public String greetMessage() {
		String msg="Good Morning All";
		return msg;
	}
	
	@GetMapping("/greet")
	public String greetMessage2() {
		String msg="Good Evening All";
		return msg;
	}
}
