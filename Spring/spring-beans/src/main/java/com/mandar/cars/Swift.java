package com.mandar.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mandar.interfaces.Car;
import com.mandar.interfaces.Engine;


public class Swift implements Car {

	@Autowired
	Engine engine;
	
	public void specs() {
		
		System.out.println("Hatchback from Suzuki with " + engine.specs());
		
	}
	
}
