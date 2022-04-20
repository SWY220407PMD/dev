package person.main;

import person.obj.Person;

public class PersonArrayMain {

	public static void main(String[] args) {
		
		// 객체 배열
		// class 를 만든 이유
		// 객체 여러개 생성
		// 여러개의 객체를 배열로 관리
		
		System.out.println("PersonArrayMain 클래스의 main 메소드 호출됨...");
		System.out.println("=========================================");
		
		//////////////////////// 배열을 이용해서 생성
		//5개의 객체(Person 타입) 를 관리할 예정
		Person[] pArr = new Person[5];
		
		for(int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
		}
		
//		pArr[0] = new Person();
//		pArr[1] = new Person();
//		pArr[2] = new Person();
//		pArr[3] = new Person();
//		pArr[4] = new Person();
		
		pArr[0].name = "피원";
		pArr[1].name = "피투";
		pArr[2].name = "피삼";
		pArr[3].name = "피넷";
		pArr[4].name = "피오";
		
		pArr[0].introduce();
		pArr[1].introduce();
		pArr[2].introduce();
		pArr[3].introduce();
		pArr[4].introduce();
		
		////////////////////////// 배열 없이 그냥 만듦
//		Person p1 = new Person();
//		Person p2 = new Person();
//		Person p3 = new Person();
//		Person p4 = new Person();
//		Person p5 = new Person();
//		
//		p1.name = "피원";
//		p2.name = "피투";
//		p3.name = "피삼";
//		p4.name = "피넷";
//		p5.name = "피오";
//		
//		p1.introduce();
//		p2.introduce();
//		p3.introduce();
//		p4.introduce();
//		p5.introduce();
		

	}//main

}//class






















