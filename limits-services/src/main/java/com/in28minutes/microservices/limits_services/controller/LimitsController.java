package com.in28minutes.microservices.limits_services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.microservices.limits_services.bean.Limits;


@RestController
public class LimitsController {
	
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(1,1000);
		
	}

}
