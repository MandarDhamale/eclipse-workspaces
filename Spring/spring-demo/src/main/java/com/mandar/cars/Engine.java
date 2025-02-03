package com.mandar.cars;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	String type = "V8";
	
	public String specs() {
		return "V8";
	}
	
}
