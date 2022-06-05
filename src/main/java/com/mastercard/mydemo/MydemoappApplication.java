package com.mastercard.mydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MydemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydemoappApplication.class, args);
	}

	@GetMapping("/message")
	public String messgae(){
		return "Welocme to Docker Demo";
	}

}
