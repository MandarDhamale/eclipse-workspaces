package com.mandar.cars;

import org.springframework.stereotype.Component;

import com.mandar.interfaces.Car;

@Component
public class Swift implements Car {

	public void specs() {
		
		System.out.println("Hatchback from Suzuki");
		
	}
	
}
