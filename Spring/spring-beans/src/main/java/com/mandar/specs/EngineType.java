package com.mandar.specs;

import org.springframework.stereotype.Component;

import com.mandar.interfaces.Engine;

public class EngineType implements Engine {

	String type;

	public EngineType() {
		super();
		type = "unkonwn";
	}

	public EngineType(String type) {
		super();
		this.type = type;
	}

	@Override
	public String specs() {
		return type;
	}

}
