package com.mandar.cars;

import org.springframework.stereotype.Component;

import com.mandar.interfaces.Car;

@Component
public class GLE implements Car {

	@Override
	public void specs() {
		
		System.out.println("SUV from Mercedes");
		
	}

}
