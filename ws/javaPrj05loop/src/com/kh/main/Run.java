package com.kh.main;

public class Run {

	public static void main(String[] args) {
		
		// �ݺ��� (for, while, do-while)
		// continue , break
		// continue : �ݺ����� ó������ ���ư�
		// break : �ݺ����� �ڻ쳿
		
		// hi ��� 10�� ����ϴ� ���α׷��� �ۼ��ϼ���
		
		/*
		 * while ����
		 * while(���ǽ�){�����ҳ���}
		 * 
		 * ���ǽ��� true �� ��쿡��, �߰�ȣ ��� ���� ������ ����
		 * ������ ���� �� ������ ������, ó������ ���ư�
		 */
		
		//while
//		int cnt = 0; //�ʱ��
//		while(cnt < 10) { //���ǽ�
//			System.out.println("hi");
//			cnt = cnt+1; //������
//		}
		
		/*
		 * for ����
		 * for(�ʱ��;���ǽ�;������){�����ҳ���}
		 */
		
		//for
//		for(int i = 0; i < 10; i=i+1) {
//			System.out.println("hi");
//		}
		
		
		/*
		 * do while ����
		 * do{������ ����}while(���ǽ�);
		 * 
		 * �ϴ� ����, �� ���� �˻�
		 * (�ѹ��� ������ ����)
		 */
		//do - while
		
		int x = 3; //�ʱ��
		do {
			System.out.println("Hi");
			x = x+1; //������
		}while(x < 10);//���ǽ�
	}

}












