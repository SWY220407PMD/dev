package com.kh.kfc.obj;

import java.util.Scanner;

public class MenuBeverage {
	
	Scanner sc = new Scanner(System.in);
	
	public void showMenuBeverage() {
		System.out.println("======음료=====");
		System.out.println("1. 콜라 (1000원)");
		System.out.println("2. 환타 (1500원)");
		System.out.println("3. 우유 (2000원)");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1 : /*~~~*/ break;
		case 2 : /*~~~*/ break;
		case 3 : /*~~~*/ break;
		default : System.out.println("그런 음료 없음");
		}
	}

}
