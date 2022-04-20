package com.kh.kfc.main;

import com.kh.kfc.obj.Menu;
import com.kh.kfc.obj.MenuBeverage;
import com.kh.kfc.obj.MenuHamburger;
import com.kh.kfc.obj.MenuSide;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("KFC 에 오신걸 환영합니다. ");
		
		// 메뉴판 객체 생성
		Menu menu = new Menu();
		MenuHamburger menuHam = new MenuHamburger();
		MenuBeverage menuBev = new MenuBeverage();
		MenuSide menuSide = new MenuSide();
		
		int menuNum = menu.showMenu();
		
		if(menuNum == 1) {
			menuHam.showMenuHam();
		}else if(menuNum == 2) {
			menuBev.showMenuBeverage();
		}else if(menuNum == 3) {
			menuSide.showMenuSide();
		}else {
			System.out.println("숫자 잘못 누름");
		}

	}

}
