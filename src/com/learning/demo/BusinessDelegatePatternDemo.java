package com.learning.demo;

import com.learning.design.pattern.businessDelegate.BusinessDelegate;
import com.learning.design.pattern.businessDelegate.Client;

public class BusinessDelegatePatternDemo {
	public static void main(String[] args) {

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
}
