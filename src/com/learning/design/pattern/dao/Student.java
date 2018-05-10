package com.learning.design.pattern.dao;

public class Student {
	private Integer rollNo;
	private String name;

	public Student(String name, Integer rollNo) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
