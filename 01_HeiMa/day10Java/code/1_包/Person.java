package com.heima;
public class Person {
	private String name;
	private int age;

	public Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	protected void speak() {
		System.out.println(name+","+age);
	}
}
