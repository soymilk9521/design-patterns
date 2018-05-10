package com.learning.demo;

import com.learning.design.pattern.mediator.User;

public class MediatorPatternDemo {
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
