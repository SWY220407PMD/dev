package practice;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		/*
		 * 	2���� 29�ϱ��� �ִ� �ظ� �����̶�� �Ѵ�.
			� �ذ� �ԷµǸ� �� �ذ� �������� �ƴ��� �Ǻ��Ͻÿ�.
			���� �Ǵ� ����
			����1) ��(year)�� 4�� ����̸鼭 100�� ����� �ƴϸ� ����.
			����2) 400�� ����̸� ����.
			�� �� ���� �� �ϳ��� ������ �����̴�.
		 */
		
		//�� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		//���� �Ǵ� 
		//����1) ��(year)�� 4�� ����̸鼭 100�� ����� �ƴϸ� ����.
		//����2) 400�� ����̸� ����.
		if( (year%4==0 && year%100!=0)  ||  (year%400==0) ) {
			System.out.println("����~~~");
		}
		
	}

}



















