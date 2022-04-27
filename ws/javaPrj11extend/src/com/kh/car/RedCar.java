package com.kh.car;

public class RedCar extends Car {
	
	//홍차 고유의 데이터, 메소드 작성
	
	public RedCar(String color, int speed, int price) {
		super(color, speed, price);
	}
	
	//홍자 고유 메소드
	public void sayRed() {
		System.out.println("홍홍홍");
	}
	
	//오버라이딩 == Override //부모클래스의 메소드를 재정의 하는 것
	//@Override == 오버라이드 어노테이션 : 사람한테 알려주려고 , 컴퓨터한테 에러 판단 해달라고
	@Override	//왜 이걸 작성할까요 ??? 알려주려고. 누구한테??? 사람,컴퓨터
	public void startCar() {
		System.out.println("홍차 시동 걸었음");
	}
	
	@Override
	public void stop() {
		System.out.println("홍차의 브레이크");
	}
	
	@Override
	public void go() {
		System.out.println("홍차의 악셀");
	}
	
	
}//class




















