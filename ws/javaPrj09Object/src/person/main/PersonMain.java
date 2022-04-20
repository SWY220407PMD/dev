package person.main;

import person.obj.Person;

public class PersonMain {
	
	public static void main(String[] args) {
		
		System.out.println("PersonMain 클래스의 main 메소드 호출됨 ...");
		System.out.println("====================================");
		
		// Person 클래스를 이용해서, 객체를 생성
		// 생성한 객체를 앞으로 사용할거임. 그러니까,,, 사용하기 위해서,,, 어딘가에 담아두겠습니다.
		Person p1 = new Person(); //클래스도 타입이 될 수 있음
		
		System.out.println("객체 잘 만들어졌나 확인 ::: " + p1);
		
		//객체를 가지고 여러가지 ~~~
		p1.walk();
		p1.say();
		p1.eat();
		
		//p1.name 값 넣기
		p1.name = "심원용";
		System.out.println("p1.name ::: " + p1.name);
		
		//다른 값 넣기
		p1.name = "심원용";
		p1.age = 20;
		p1.height = 183.7;
		p1.weight = 80.7;
		p1.gender = 'M'; //Male , Female
		p1.skin = "황";
		p1.birth = "01-01";
		p1.location = "역삼역 3번 출구 100m 직진";
		
		p1.introduce();

	}//main

}//class























