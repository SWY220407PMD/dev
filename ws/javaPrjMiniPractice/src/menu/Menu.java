package menu;

import java.util.Scanner;

public class Menu {

	//메뉴 보여주기
	public void showMenu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 게임하기");
		System.out.println("3. 어떤");
		System.out.println("4. 기능을");
		System.out.println("5. 넣을까요?");
	}
	
	//메뉴 선택 입력 받기
	public String inputMenu() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

}//class
















