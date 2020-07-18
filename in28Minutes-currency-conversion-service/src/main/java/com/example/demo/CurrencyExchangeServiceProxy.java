package com.example.demo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.bean.CurrencyConversion;

//@FeignClient(name="currency-exchange-service", url="localhost:8000") // use for without load balancing and simple service calling instead of rest template

// next 2 is use for load balancing and its direct call service without zuul api gateway
//@FeignClient(name="currency-exchange-service")
//@RibbonClient(name="currency-exchange-service")

// Here request go throw api gateway between 2 microservice
@RibbonClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-api-gateway-server")

public interface CurrencyExchangeServiceProxy {
	
	// for direct call
	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	
	// call throw zuul gateway
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue
		(@PathVariable("from") String from, @PathVariable("to") String to);
}