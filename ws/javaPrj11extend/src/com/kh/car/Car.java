package com.kh.car;

/*
 * �߻�Ŭ����
 * - abstract Ű���带 �ٿ��ָ� ��
 * - 0 �� �̻��� �߻�޼ҵ带 ������ ����
 * - ��üȭ �Ұ���
 */
public abstract class Car {
	
	public Car() {
		
	}
	
	//������
	public Car(String color, int speed, int price) {
		this.color = color;
		this.speed = speed;
		this.price = price;
	}
	
	//data
	private String color = "�θ����";	//��������
	private int speed = -1;			//�ӵ�
	private int price = -1;			//����
	
	
	/*
	 * �߻� �޼ҵ�
	 * - abstract Ű���带 �ٿ��ָ� ��
	 * - �޼ҵ� �ٵ� �������� ����
	 */
	//�õ��ɱ�
	public abstract void startCar();
	
	//�극��ũ ���
	public void stop() {
		System.out.println("Car �극��ũ ����");
	}
	
	//�Ǽ� ���
	public void go() {
		System.out.println("Car �Ǽ� ����");
	}
	
	
	
	//getter / sette 
	public String getColor() {
		System.out.print("Car Class getter called...");
		return this.color;
	}
	
	public int getSpeed() {
		System.out.print("Car Class getter called...");
		return this.speed;
	}
	
	public int getPrice() {
		System.out.print("Car Class getter called...");
		return this.price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}//class
























