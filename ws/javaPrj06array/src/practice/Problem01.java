package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
		//�ڵ�� 1403
		
		Scanner sc = new Scanner(System.in);
		
		// �迭 2�� ����ϱ� 
		// k ���� ���ڸ� �Է¹ް� 2�� ���
		
		// 0. k �Է¹ޱ�
		int k = sc.nextInt();
		
		
		// 1. k���� ���ڸ� ���� �� �ִ� �޸��� �غ�
		int[] memo = new int[k];
		
		
		// 2. (���ڸ� ���, �޸��忡 ����) * k 
		for(int i = 0; i<k; i++) { //i : 0 ~ k-1
			memo[i] = sc.nextInt();
		}
		
		
		// 3. �޸����� i��° ��� �б� (��, i : 0~k-1)
		for(int i = 0; i<k; i++) {
			System.out.println(memo[i]);
		}
		
		for(int i = 0; i<k; i++) {
			System.out.println(memo[i]);
		}
		
		
		
		
		
		
		
	}

}
