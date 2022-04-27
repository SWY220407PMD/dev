package main;

public class WhatCar implements /* Car, */ ElectronicCar {

	@Override
	public String startCar() {
		return "왓차 시동 걸었음";
	}

	@Override
	public void go() {
		System.out.println("왓차, 전기로 앞으로 가는중...");
	}

	@Override
	public int stop() {
		return 300;
	}

	@Override
	public void charge() {
		System.out.println("왓차(전기차), 충전중....");
	}
	
	

}
