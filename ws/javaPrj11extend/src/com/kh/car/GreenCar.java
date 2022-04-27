package com.kh.car;

public class GreenCar extends Car {
	
	public GreenCar(String color, int speed, int price) {
		
	}
	
	//³ìÂ÷ °íÀ¯ ¸Ş¼Òµå
	public void sayGreen() {
		System.out.println("Knock Knock");
	}
	
	@Override
	public void startCar() {
		System.out.println("³ìÂ÷ ½Ãµ¿ °É¾úÀ½");
	}
	
	@Override
	public void stop() {
		System.out.println("³ìÂ÷ÀÇ ºê·¹ÀÌÅ©");
	}
	
	@Override
	public void go() {
		System.out.println("³ìÂ÷ÀÇ ¾Ç¼¿");
	}

}//class
