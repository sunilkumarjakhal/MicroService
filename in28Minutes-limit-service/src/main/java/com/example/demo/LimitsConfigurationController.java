package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.LimitsConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	//configuring a fallback method  
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfigurations")  
	public LimitsConfiguration retriveLimitsFromConfiguration() {
		//throw new RuntimeException("Not Available");
		return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
		
	}
	//defining the fallback method  
	public LimitsConfiguration fallbackRetrieveConfigurations()  
	{  
	//returning the default configuration     
	return new LimitsConfiguration(123, 12);   
	}  

}
