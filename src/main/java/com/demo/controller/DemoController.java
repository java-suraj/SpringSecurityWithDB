package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String hello() {
		return "<h1 style='color:red; text-align:center'>Welcome to Spring Security</h1>";
	}
}
