package com.mandar.specs;

import org.springframework.stereotype.Component;

import com.mandar.interfaces.Engine;

@Component
public class V8 implements Engine {

	@Override
	public String specs() {
		return "V8";
	}
	
	
	
	
}
