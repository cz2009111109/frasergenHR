package com.frasergen.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frasergen.entity.User;

@CrossOrigin
@RestController
@RequestMapping("")
public class Hello {
	
	@RequestMapping("/hello")
	public @ResponseBody String Hello() {
		return "hello world";
	}
	
	@CrossOrigin
	@PostMapping("/login")
	@ResponseBody
	public  User  loginPost(String name, String password) {
		User user=new User();
		System.out.println(name);
		System.out.println(password);
		user.setName(name);
		user.setPassword(password);
		return user;
		
	}
	
	
}
