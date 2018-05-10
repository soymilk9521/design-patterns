package com.learning.demo;

import com.learning.design.pattern.compositeEntity.Client;

public class CompositeEntityPatternDemo {
	public static void main(String[] args) {

		Client client = new Client();
		client.setData("Test", "Data");
		client.printData();
		
		System.out.println();
		
		client.setData("Second Test", "Data1");
		client.printData();
	}
}
