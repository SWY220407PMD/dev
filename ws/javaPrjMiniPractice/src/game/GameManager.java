package game;

import java.util.Scanner;

import util.InputUtil;

public class GameManager {
	
	public void gameStart() {
		//��ȣ�� ���� �ϱ�
		System.out.println("1 : ���ٿ����");
		System.out.println("2 : ������");
		System.out.println("3 : ��");
		System.out.println("4 : ��ġ");
		System.out.println("5 : �ξ�");
		System.out.print("���� ��ȣ ���� : ");
		
//		Scanner sc = new Scanner(System.in);
//		String gameNumStr = sc.nextLine();
//		int gameNum = Integer.parseInt(gameNumStr);
		
		int gameNum = InputUtil.inputInt();
		
		switch(gameNum) {
		case 1: updownGameStart();
			break;
		case 2: //2 game ~~~
			break;
		case 3: //3 game ~~~~
			break;
		default : // error ~~~~ 
		}
	}
	
	private void updownGameStart() {
		System.out.println("1~100 ������ ���ڸ� �ϳ� ������ ~~~");
		//��ǻ�� ���� ���� ����
		
		
		//1.���ٿ� ��, ��� ���
		//2.�Է¹ޱ�
		// 1,2 �� ���ѹݺ� (���� �� ����)
		
		System.out.println("����� �̰���ϴ� ~~~ ^^");
		
		//���� ��� ���� �ʿ��ϴ�?
		//���� �޼ҵ� ȣ��
	}

}//class











