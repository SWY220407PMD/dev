package com.kh.kfc.obj;

import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	//메뉴판 보여주기
	public int showMenu() {
		System.out.println("===========MENU===========");
		System.out.println("1. 햄버거");
		System.out.println("2. 음료");
		System.out.println("3. 사이드");
		
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1: return 1;
		case 2: return 2;
		case 3: return 3;
		default : System.out.println("error !!! (메뉴 선택 중 에러 발생)"); 
		return -1;
		}
		
	}

}//class



















