package com.kh.kfc.obj;

import java.util.Scanner;

public class MenuSide {
	
	Scanner sc = new Scanner(System.in);
	
	public void showMenuSide() {
		System.out.println("=======사이드=======");
		System.out.println("1. 감자튀김 (3000원)");
		System.out.println("2. 닭껍질튀김 (2000원)");
		System.out.println("3. 치즈스틱 (1000원)");
		//소라님 생일 축ㄹ하드립니다 ~ ^^
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1 : /*~~~*/ break;
		case 2 : /*~~~*/ break;
		case 3 : /*~~~*/ break;
		default : System.out.println("그런 사이드 없음");
		}
	}

}
