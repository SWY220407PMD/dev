package menu;

import java.util.Scanner;

public class Menu {

	//�޴� �����ֱ�
	public void showMenu() {
		System.out.println("1. ȸ������");
		System.out.println("2. �����ϱ�");
		System.out.println("3. �");
		System.out.println("4. �����");
		System.out.println("5. �������?");
	}
	
	//�޴� ���� �Է� �ޱ�
	public String inputMenu() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

}//class
















