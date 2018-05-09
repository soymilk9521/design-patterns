package com.learning.demo;

import com.learning.design.pattern.bridge.Circle;
import com.learning.design.pattern.bridge.GreenCircle;
import com.learning.design.pattern.bridge.RedCircle;
import com.learning.design.pattern.bridge.Shape;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
