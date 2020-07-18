package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class In28MinutesSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(In28MinutesSpringCloudConfigServerApplication.class, args);
	}

}
