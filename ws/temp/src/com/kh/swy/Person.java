package com.kh.swy;

public class Person {
	
	public static final String NAME = "swy";
	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	//getter
	public int getAge() {
		return age;
	}
	//setter
	public void setAge(int age) {
		this.age = age;
	}
	
	public void walk() {}

}
