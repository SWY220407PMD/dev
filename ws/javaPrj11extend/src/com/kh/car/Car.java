package com.kh.car;

public class Car {
	
	//기본생성자
	public Car() {
		
	}
	
	//생성자
	public Car(String color, int speed, int price) {
		this.color = color;
		this.speed = speed;
		this.price = price;
	}
	
	//data
	private String color = "부모색상";	//차량색상
	private int speed = -1;			//속도
	private int price = -1;			//가격
	
	
	//시동걸기
	public void startCar() {
		System.out.println("Car 시동 걸었음");
	}
	
	//브레이크 밟기
	public void stop() {
		System.out.println("Car 브레이크 밟음");
	}
	
	//악셀 밟기
	public void go() {
		System.out.println("Car 악셀 밟음");
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
























