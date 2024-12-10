package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbSecureProtocolHttpHttpsApplication {
	
	@GetMapping("/")
	public String defaultPage() {
		return " Default Https Page";
	}
	
	@GetMapping("/access")
	public String testProtocol() {
		return " Able to access HTTPS Protocol";
	}

	public static void main(String[] args) {
		SpringApplication.run(SbSecureProtocolHttpHttpsApplication.class, args);
	}

}
