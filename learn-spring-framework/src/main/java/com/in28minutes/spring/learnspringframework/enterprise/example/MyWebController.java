package com.in28minutes.spring.learnspringframework.enterprise.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MyWebController {
	
	public long returnValueFromBusinessService() {
		return 200;
	}
	
}

class BusinessService {
	private DataService dataService;
	
	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
		
		
		
	}
}

class DataService {
	public List<Integer> getData() {
		return Arrays.asList(10, 20, 30, 40);
		
	}
}
