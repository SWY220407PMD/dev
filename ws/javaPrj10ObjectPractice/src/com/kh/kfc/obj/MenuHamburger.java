package com.kh.kfc.obj;

import java.util.Scanner;

public class MenuHamburger {
	
	Scanner sc = new Scanner(System.in);
	
	//�ܹ��� �޴� �����ֱ�
	public void showMenuHam() {
		System.out.println("======�ܹ���========");
		System.out.println("1. �Ұ��� ���� (5000��)");
		System.out.println("2. Ÿ�� ���� (8000��)");
		System.out.println("3. ¡�� ���� (7000��)");
		
		int menu = Integer.parseInt(sc.nextLine());//String -> int
		
		switch(menu) {
		case 1 : /*~~~*/ break;
		case 2 : /*~~~*/ break;
		case 3 : /*~~~*/ break;
		default : System.out.println("�׷� �ܹ��� ����");
		}
		
	}

}//class



















