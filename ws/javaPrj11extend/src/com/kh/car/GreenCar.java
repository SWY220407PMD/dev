package com.kh.car;

public class GreenCar extends Car {
	
	public GreenCar(String color, int speed, int price) {
		
	}
	
	//녹차 고유 메소드
	public void sayGreen() {
		System.out.println("Knock Knock");
	}
	
	@Override
	public void startCar() {
		System.out.println("녹차 시동 걸었음");
	}

}
