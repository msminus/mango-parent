package com.mango.spring.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootdemoApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam(name = "user", defaultValue = "Java") String user) {
		
		return "Hello World"+ " "+user;
		
	}

}
