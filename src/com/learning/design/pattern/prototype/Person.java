package com.learning.design.pattern.prototype;

public class Person implements Cloneable {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

}
