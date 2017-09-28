package com.baidu;
import com.heima.Person;
public class Student extends Person {
	public Student(){}

	public Student(String name,int age) {
		super(name,age);
	}

	public void print() {
		speak();
	}
}
