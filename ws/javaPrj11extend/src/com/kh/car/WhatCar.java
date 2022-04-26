package com.kh.car;

public class WhatCar extends Car {

	public WhatCar(String color, int speed, int price) {
			
	}
	
	//왓차 고유 메소드
	public void sayWhat() {
		System.out.println("뭐");
	}
	
	@Override
	public void startCar() {
		System.out.println("왓차 시동 걸었음");
	}
	
}
