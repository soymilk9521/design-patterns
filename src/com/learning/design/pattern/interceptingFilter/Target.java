package com.learning.design.pattern.interceptingFilter;

public class Target {
	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}
}
