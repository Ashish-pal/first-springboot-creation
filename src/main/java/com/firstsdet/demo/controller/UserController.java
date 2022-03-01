package com.firstsdet.demo.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getUserData() {
		return "This is first get user data method";
	}
	
	@PostMapping("/customer/")
	public String createUserData() {
		return "Post User data is creating here";
	}
	
	@PutMapping("/")
	public String putData() {
		return "put user data";
	}
	
	@DeleteMapping("/")
	public String deleteData() {
		return "This is deleting data method here";
	}
}
