package com.learning.design.pattern.iterator;

public class NameIterator implements Iterator {
	private String[] names = null;

	public NameIterator(String[] names) {
		this.names = names;
	}

	int index;

	@Override
	public boolean hasNext() {

		if (index < names.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {

		if (this.hasNext()) {
			return names[index++];
		}
		return null;
	}

}
