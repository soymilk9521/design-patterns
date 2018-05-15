package com.learning.demo;

import com.learning.design.pattern.singleton.SingleObject;

public class _03_creational_SingletonPatternDemo {

	public static void main(String[] args) {
		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();

		// Get the only object available
		SingleObject object = SingleObject.getInstance();

		// show the message
		object.showMessage();

	}

}
