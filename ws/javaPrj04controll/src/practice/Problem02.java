package practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
//		���� �ϳ� �Է¹ް�,
//		�Է¹��� ������ 7�� ������ "7�ǹ��" ��� ���
		
		//�Է�
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		// �Ǵ�
		if(x % 7 == 0) { // x�� 7�� �������� �� ������ �� 0 �̶�� 7�� ���
			System.out.println("7�� ���");
		}
		

	}

}
