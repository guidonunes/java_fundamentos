package com.in28minutes.microservices.limits_services.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.microservices.limits_services.bean.Limits;
import com.in28minutes.microservices.limits_services.configuration.Configuration;


@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
//		return new Limits(1,1000);
		
	}

}
