package main;

import vo.Person;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("½É¿ø¿ë", 20, 183.7 , 'M');
		
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
//		System.out.println(p.getHeight());
//		System.out.println(p.getGender());
		p.info();
		
		System.out.println("============");
		System.out.println(p);

	}

}
