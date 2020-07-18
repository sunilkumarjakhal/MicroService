package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class In28MinutesNetflixZuulApiGatewayServerApplication {
	
	// URL : localhost:8765/currency-conversion-service/currency-convertor-feign/from/USD/to/INR/quantity/1000

	public static void main(String[] args) {
		SpringApplication.run(In28MinutesNetflixZuulApiGatewayServerApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
