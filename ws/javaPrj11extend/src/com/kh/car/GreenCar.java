package com.kh.car;

public class GreenCar extends Car {
	
	public GreenCar(String color, int speed, int price) {
		
	}
	
	//���� ���� �޼ҵ�
	public void sayGreen() {
		System.out.println("Knock Knock");
	}
	
	@Override
	public void startCar() {
		System.out.println("���� �õ� �ɾ���");
	}

}
