package com.learning.design.pattern.iterator;

public class NameRepository implements Container {

	public String[] names = { "Robert", "John", "Julie", "Lora" };

	@Override
	public Iterator getIterator() {
		return new NameIterator(names);
	}

}
