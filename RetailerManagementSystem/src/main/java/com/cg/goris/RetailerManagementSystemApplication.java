package com.cg.goris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RetailerManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailerManagementSystemApplication.class, args);
	}
	
	// allows to send request from 1 ms to another ms
//	@Bean
//	public RestTemplate restTemplate() {
//	    return new RestTemplate();
//	}

}
