package com.learning.demo;

import com.learning.design.pattern.serviceLocator.Service;
import com.learning.design.pattern.serviceLocator.ServiceLocator;

public class ServiceLocatorPatternDemo {

	public static void main(String[] args) {
		Service service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
		service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();

	}

}
