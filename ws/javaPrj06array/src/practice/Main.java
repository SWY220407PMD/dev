package practice;

public class Main {

	public static void main(String[] args) {
		
		// ���̰� 10�� �迭 ����,
		// �� ��ҿ� 0 ���� 9 ������ ���ڸ� ä���ֱ�
		
		int[] a = new int[10];
		
		// �� ��ҿ� �� �Ҵ�
		for(int i = 0; i <= 9; i++) {
			a[i] = (i+1)*10;
		}
		
		//�� ����� �� ���
		for(int i = 0; i <= 9; i++) { // 0 ~ 9
			System.out.println(a[i]);
		}
		
		

	}//main

}//class














