package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {

		// ���� �ϳ��� �Է¹ް�
		// �Է¹��� ������
		// Ȧ���� Ȧ�� ��� ���
		// ¦���� ¦�� ��� ���
		
		//Ȧ , ¦ �Ǵ�
		
		//�Է� �غ�
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		//���ǹ�
		if(x%2 == 1) {
			System.out.println("Ȧ��");
		}
		else if(x%2 == 0) {
			if(x == 0) {
				System.out.println("zero");
			}else {
				System.out.println("¦��");
			}
		}
		
		
		
	}

}
