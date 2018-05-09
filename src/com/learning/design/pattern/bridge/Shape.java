package com.learning.design.pattern.bridge;

public abstract class Shape {
	
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
