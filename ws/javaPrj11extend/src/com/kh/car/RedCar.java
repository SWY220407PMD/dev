package com.kh.car;

public class RedCar extends Car {
	
	//ȫ�� ������ ������, �޼ҵ� �ۼ�
	
	public RedCar(String color, int speed, int price) {
		super(color, speed, price);
	}
	
	//ȫ�� ���� �޼ҵ�
	public void sayRed() {
		System.out.println("ȫȫȫ");
	}
	
	//�������̵� == Override //�θ�Ŭ������ �޼ҵ带 ������ �ϴ� ��
	//@Override == �������̵� ������̼� : ������� �˷��ַ��� , ��ǻ������ ���� �Ǵ� �ش޶��
	@Override	//�� �̰� �ۼ��ұ�� ??? �˷��ַ���. ��������??? ���,��ǻ��
	public void startCar() {
		System.out.println("ȫ�� �õ� �ɾ���");
	}
	
	@Override
	public void stop() {
		System.out.println("ȫ���� �극��ũ");
	}
	
	@Override
	public void go() {
		System.out.println("ȫ���� �Ǽ�");
	}
	
	
}//class




















