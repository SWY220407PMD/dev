package practice;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		//������ �Է¹ް�, 1���� �Է¹����� ���� ����ϴ� ���α׷��� ���弼��
		//(��, ¦���� ������� �ʴ´�.)
		
		//�Է�
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		//�ݺ��� (1 ~ �Է°� , 1�� �����ϸ鼭)
		for(int x=1 ; x<=input ; x=x+1) { 
			if(x % 2 == 0){ //¦��
				continue;
			}
			System.out.println(x);
		}
		

	}

}
