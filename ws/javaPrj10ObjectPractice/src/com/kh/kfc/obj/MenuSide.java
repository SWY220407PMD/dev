package com.kh.kfc.obj;

import java.util.Scanner;

public class MenuSide {
	
	Scanner sc = new Scanner(System.in);
	
	public void showMenuSide() {
		System.out.println("=======���̵�=======");
		System.out.println("1. ����Ƣ�� (3000��)");
		System.out.println("2. �߲���Ƣ�� (2000��)");
		System.out.println("3. ġ�ƽ (1000��)");
		//�Ҷ�� ���� �ऩ�ϵ帳�ϴ� ~ ^^
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1 : /*~~~*/ break;
		case 2 : /*~~~*/ break;
		case 3 : /*~~~*/ break;
		default : System.out.println("�׷� ���̵� ����");
		}
	}

}
