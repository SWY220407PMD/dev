package com.kh.car;

public class Main {

	public static void main(String[] args) {
		
		/*
		    1. 상속
			정의: 부모클래스의 data, method, constructor 받아옴
			사용법 : extends
			* 모든 클래스의 제일 위의 부모는 Object 클래스이다.
			
			2. 오버라이드
			정의 : 부모클래스의 메소드 재정의(==메소드의 바디 부분을 다시 작성하는것)
			작성법 : 오버라이드 하려는 메소드 위에다가 @Override 라고 적기
			
			3. 다형성
			* 부모클래스 타입으로 자식 클래스 타입의 객체를 받을 수 있다.
			ex) Car c = new RedCar();
			
			4. 바인딩 (뭔지 몰라도 됨. 이런 저런 용어가 있구나 하고 넘기면 됨)
			정적바인딩
			동적바인딩
			
			5. super 
			super는 부모를 가리키는 키워드
			(this 는 자기자신을 가리키는 키워드)
			
			6. getter/setter
			priavate 필드 (==전역변수 == 인스턴스 변수 == 객체변수 == 멤버변수 == 클래스변수)
			접근제한자가 private 인 애들을 편법으로 사용하기 위해서 만드는 메소드
		 */
		
		System.out.println("=====상속=====");
		
		// 다형성 (polymorphism) : 부모클래스가 자식클래스 받아주는거
		// ex ) Car 타입의 변수 에다가 자식 타입의 객체 를 넣는거
		// >> 위와 같은 상황을 보고 다형성을 적용했다.
		
		Car rc = new RedCar("빨강" , 100, 3000);
		rc.startCar();
		System.out.println(rc.getColor());
		System.out.println(rc.getSpeed());
		System.out.println(rc.getPrice());
		
		Car rc2 = new GreenCar("녹색", 200, 4000);
		rc2.startCar();
		
		Car rc3 = new WhatCar("검정", 300, 9900);
		rc3.startCar();
		
		Object

	}

}
