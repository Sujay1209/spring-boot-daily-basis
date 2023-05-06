package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {
	
	@GetMapping("/getPost")
	public String getPost(@RequestParam String username)
	{
		return "good boy="+ username;
	}
	

}
