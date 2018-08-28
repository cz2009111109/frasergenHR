package com.frasergen;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

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
		SpringApplication app =new SpringApplication(FrasergenHrApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
