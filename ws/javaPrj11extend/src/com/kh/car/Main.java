package com.kh.car;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*
		    1. ���
			����: �θ�Ŭ������ data, method �޾ƿ�
			//�θ�ü�� �����ؾ� �ڽİ�ü�� ������ �� ����
			���� : extends
			* ��� Ŭ������ ���� ���� �θ�� Object Ŭ�����̴�.
			
			2. �������̵�
			���� : �θ�Ŭ������ �޼ҵ� ������(==�޼ҵ��� �ٵ� �κ��� �ٽ� �ۼ��ϴ°�)
			�ۼ��� : �������̵� �Ϸ��� �޼ҵ� �����ٰ� @Override ��� ����
			
			3. ������
			* �θ�Ŭ���� Ÿ������ �ڽ� Ŭ���� Ÿ���� ��ü�� ���� �� �ִ�.
			ex) Car c = new RedCar();
			
			4. ���ε� (���� ���� ��. �̷� ���� �� �ֱ��� �ϰ� �ѱ�� ��)
			�������ε�
			�������ε�
			
			5. super 
			super�� �θ� ����Ű�� Ű����
			(this �� �ڱ��ڽ��� ����Ű�� Ű����)
			
			6. getter/setter
			priavate �ʵ� (==�������� == �ν��Ͻ� ���� == ��ü���� == ������� == Ŭ��������)
			���������ڰ� private �� �ֵ��� ������� ����ϱ� ���ؼ� ����� �޼ҵ�
		 */
		
		System.out.println("=====���=====");
		
		// ������ (polymorphism) : �θ�Ŭ������ �ڽ�Ŭ���� �޾��ִ°�
		// ex ) Car Ÿ���� ���� ���ٰ� �ڽ� Ÿ���� ��ü �� �ִ°�
		// >> ���� ���� ��Ȳ�� ���� �������� �����ߴ�.
		
		Car rc = new RedCar("����" , 100, 3000);
		rc.startCar();
		
		Car rc2 = new GreenCar("���", 200, 4000);
		rc2.startCar();
		
		Car rc3 = new WhatCar("����", 300, 9900);
		rc3.startCar();
		
		rc.startCar();
		rc.go();
		rc2.go();
		rc3.go();
		
//		new Car(); //�߻�Ŭ������ ��üȭ �Ұ���
		
		
		
		//��ü �� (instanceof)
		//A instanceof B : A�� B Ÿ���� �´��� Ȯ���Ͽ� boolean Ÿ���� �����͸� ����
//		if(rc instanceof Object) {
//			System.out.println("��������");
//		}else {
//			System.out.println("�����ƴ�");
//		}
		
		
		
		
		
		
		
	}//main

}//class
















