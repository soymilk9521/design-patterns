package com.learning.demo;

import com.learning.design.pattern.observer.BinaryObserver;
import com.learning.design.pattern.observer.HexaObserver;
import com.learning.design.pattern.observer.OctalObserver;
import com.learning.design.pattern.observer.Subject;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
