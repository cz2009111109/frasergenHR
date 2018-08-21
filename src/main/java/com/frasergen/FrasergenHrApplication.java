package com.frasergen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice
//@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages=("com.frasergen.controller"))
public class FrasergenHrApplication {
	
//	@RequestMapping("/test")
//	String home() {
//		return "hello home";
//	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(FrasergenHrApplication.class, args);
	}
}
