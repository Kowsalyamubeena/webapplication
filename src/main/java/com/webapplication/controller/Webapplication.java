package com.webapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webapplication {
	@GetMapping(path="/get")
	public String get()
	{
		return "Hello world";
	}
	


}
