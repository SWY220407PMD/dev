package com.kh.kfc.obj;

import java.util.Scanner;

public class MenuHamburger {
	
	Scanner sc = new Scanner(System.in);
	
	//햄버거 메뉴 보여주기
	public void showMenuHam() {
		System.out.println("======햄버거========");
		System.out.println("1. 불고기 버거 (5000원)");
		System.out.println("2. 타워 버거 (8000원)");
		System.out.println("3. 징거 버거 (7000원)");
		
		int menu = Integer.parseInt(sc.nextLine());//String -> int
		
		switch(menu) {
		case 1 : /*~~~*/ break;
		case 2 : /*~~~*/ break;
		case 3 : /*~~~*/ break;
		default : System.out.println("그런 햄버거 없음");
		}
		
	}

}//class




















