package com.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoMultibranchApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMultibranchApplication.class, args);
	}

	@GetMapping("/")
	public String getGreeting() {
		return "<h2>Hello world - Dev .</h2>";
	}

}
