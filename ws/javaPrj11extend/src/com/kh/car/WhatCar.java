package com.kh.car;

public class WhatCar extends Car {

	public WhatCar(String color, int speed, int price) {
			
	}
	
	//���� ���� �޼ҵ�
	public void sayWhat() {
		System.out.println("��");
	}
	
	@Override
	public void startCar() {
		System.out.println("���� �õ� �ɾ���");
	}
	
}
