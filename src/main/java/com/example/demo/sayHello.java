package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayHello {
	@RequestMapping("/h")
	public String HelloWorld() {
		return "Hi";
	}

}
