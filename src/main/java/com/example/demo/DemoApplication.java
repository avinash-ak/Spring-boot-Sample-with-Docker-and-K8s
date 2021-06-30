package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {
	
	@RestController
	class SampleController {
		@GetMapping("/k8s")
		String hello() {
			return "spring boot with k8s";
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

