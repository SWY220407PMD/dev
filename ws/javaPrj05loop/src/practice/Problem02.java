package practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// ���� 1�� �Է¹޾� ī��Ʈ�ٿ� �ϱ�
		
		// �Է�
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		// �Է°� ~ 1 (1�� �����ϸ鼭)
		
		//ī��Ʈ�ٿ�
		for(int x = input;x > 0;x = x-1) {
			System.out.println(x);
		}

	}

}
