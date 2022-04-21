package com.kh.kfc.main;

import com.kh.kfc.obj.Menu;
import com.kh.kfc.obj.MenuBeverage;
import com.kh.kfc.obj.MenuHamburger;
import com.kh.kfc.obj.MenuSide;

public class Main {
	
	public static int total;
	public static String menuAll = "";
	public static boolean finish = false;

	public static void main(String[] args) {
		
		System.out.println("KFC 에 오신걸 환영합니다. ");
		
		// 메뉴판 객체 생성
		Menu menu = new Menu();
		MenuHamburger menuHam = new MenuHamburger();
		MenuBeverage menuBev = new MenuBeverage();
		MenuSide menuSide = new MenuSide();
		
		//반복문 (여러 메뉴 선택을 위함)
		do {
			//메뉴 선택 (대분류)
			int menuNum = menu.showMenu();
			
			//상세메뉴판 보여주기
			if(menuNum == 1) {
				menuHam.showMenuHam();
			}else if(menuNum == 2) {
				menuBev.showMenuBeverage();
			}else if(menuNum == 3) {
				menuSide.showMenuSide();
			}else {
				System.out.println("숫자 잘못 누름");
			}
			
			//주문 더 할건지?
			menu.more();
			
		}while(!finish);
		
		
		
		//최종 결과 출력
		System.out.println("주문하신 메뉴는 " + Main.menuAll + " 입니다.");
		System.out.println("총 가격은 : " + Main.total + " 원 입니다");

	}

}//class


















