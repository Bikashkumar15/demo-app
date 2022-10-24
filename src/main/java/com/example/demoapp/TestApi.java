package com.example.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
	
	@GetMapping("/student")
	public String getTestingApi() {
		
	return "Success";
	}
	

}
