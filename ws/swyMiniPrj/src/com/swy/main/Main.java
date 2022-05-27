package com.swy.main;

import com.swy.board.Board;
import com.swy.member.Member;
import com.swy.util.MyUtil;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("swy mini prj");
		
		while(true) {
			System.out.println("==================");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. �Խñ� �ۼ�");
			System.out.println("4. �Խñ� ��ȸ");
			System.out.println("5. ȸ�� ���� ����");
			System.out.println("6. ȸ�� Ż��");
			
			int n = MyUtil.scInt();
			
			switch(n) {
			case 1 : new Member().join(); break;
			case 2 : new Member().login(); break;
			case 3 : new Board().write(); break;
			case 4 : new Board().showList(); break;
			case 5 : new Member().edit(); break;
			case 6 : new Member().quit(); break;
			default : System.out.println("�ٽ� �����ϼ���");
			}
		}//while

	}//main

}//class











