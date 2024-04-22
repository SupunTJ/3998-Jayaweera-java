package com.jst.javaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class JavaProjectApplication {

	@GetMapping
	public String hello(){
		return "Hello Jayaweera";
	}
	public static void main(String[] args) {
		SpringApplication.run(JavaProjectApplication.class, args);
	}

}
