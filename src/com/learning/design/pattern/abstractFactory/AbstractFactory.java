package com.learning.design.pattern.abstractFactory;

import com.learning.design.pattern.factory.Shape;

public abstract class AbstractFactory {
	
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}
