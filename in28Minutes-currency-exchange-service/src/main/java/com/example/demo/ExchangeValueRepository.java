package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	
	ExchangeValue findByFromAndTo(String from ,String  to);

}
