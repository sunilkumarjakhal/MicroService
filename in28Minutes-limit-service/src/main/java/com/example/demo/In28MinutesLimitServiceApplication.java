package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix  
public class In28MinutesLimitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(In28MinutesLimitServiceApplication.class, args);
	}

}
