package com.learning.design.pattern.prototype;

public class ClonePersonTest {
	public static void main(String[] args) {
		Person p = new Person(23, "zhang");
		Person p1 = p; // 复制引用
		p1.setName("abc");
		System.out.println(p.getName());
		System.out.println(p1.getName());
		System.out.println("----------------------------");
		try {
			Person p2 = (Person) p.clone(); // 复制对象
			String result = p.getName() == p2.getName() ? "clone是浅拷贝的" : "clone是深拷贝的";
			System.out.println(result);
			p2.setName("def");
			System.out.println(p.getName());
			System.out.println(p2.getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
