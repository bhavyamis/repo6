package com.javainuse.springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/greetings")

public class RestController {
    @GetMapping("/greet")
	public String greet() {
		return "Hello ! war Deployment Successful";
	}
}
