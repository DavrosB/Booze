package com.qa.exercises.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
//	MAP URLs to Methods
//	Endpoint - they get a resource in return
//	Request -> Response
	
//	http://localhost:8080/someURL  enter into browser to test
	
	@GetMapping("/someURL")
		public String thisMethod() {
		
		return "Whatever Linus";
	}

}
