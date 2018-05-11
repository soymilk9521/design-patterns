package com.learning.demo;

import com.learning.design.pattern.frontController.FrontController;

public class FrontControllerPatternDemo {

	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}

}
