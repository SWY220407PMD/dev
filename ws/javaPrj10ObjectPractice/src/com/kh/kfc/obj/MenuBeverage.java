package com.kh.kfc.obj;

import java.util.Scanner;

public class MenuBeverage {
	
	Scanner sc = new Scanner(System.in);
	
	public void showMenuBeverage() {
		System.out.println("======����=====");
		System.out.println("1. �ݶ� (1000��)");
		System.out.println("2. ȯŸ (1500��)");
		System.out.println("3. ���� (2000��)");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1 : /*~~~*/ break;
		case 2 : /*~~~*/ break;
		case 3 : /*~~~*/ break;
		default : System.out.println("�׷� ���� ����");
		}
	}

}