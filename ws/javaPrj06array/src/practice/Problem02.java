package practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1~23 �� ���� ����
		int[] memo = new int[24]; //0~23
		
		//�������� n�� �⼮ �θ�����
		int n = sc.nextInt();
		

		//n�� �ݺ�
		for(int i = 0 ; i < n; i++) {
			//�������� �θ� �⼮��ȣ Ȯ��
			int x = sc.nextInt();
			//x�� ĭ�� ���� üũ
			memo[x] = 1;
		}
		
		for(int i = 1; i <=23; ++i) {
			if(memo[i] == 1) {
				System.out.println(i);
				break;// @@@@@@@@@@@@@@@@@ (�̰� ���Ծ��׿� �̤�)
			}
		}
		
		//������� ���½ð��� ���Ͻó���??
		//>> �����ֽ��ϴ� ..... ��������
		
		
	}


}
