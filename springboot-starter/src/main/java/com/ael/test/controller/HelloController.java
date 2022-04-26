package com.ael.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String hello() {
		return "Hello from Spring";
	}
	
	
	@GetMapping("/{name}")
	public String helloWithName(@PathVariable("name") String name) {
		return "Hello Celloscope from " + name + ".";
	}

}
