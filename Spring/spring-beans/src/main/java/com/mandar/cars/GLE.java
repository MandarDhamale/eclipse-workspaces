package com.mandar.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mandar.interfaces.Car;
import com.mandar.interfaces.Engine;


public class GLE implements Car {

	@Autowired
	Engine engine;
	
//	public GLE(Engine engine) {
//		super();
//		this.engine = engine;
//		engine.type = "V6";
//	}

	
//	@Autowired
//	@Qualifier("v8")
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
	
	
	
	@Override
	public void specs() {
		
//		Engine engine = new Engine();
//		engine.type = "V16"; this is how I would need to use it if I don't use autowired
		
		System.out.println("SUV from Mercedes with engine "  + engine.specs());
		
	}


}
