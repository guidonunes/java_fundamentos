package com.in28minutes.microservices.limits_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.in28minutes.microservices.limits_services.configuration.Configuration;

@SpringBootApplication
@EnableConfigurationProperties(Configuration.class)
public class LimitsServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServicesApplication.class, args);
	}

}
