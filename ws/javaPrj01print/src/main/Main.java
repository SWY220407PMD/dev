package main;

public class Main {

	public static void main(String[] args) {
		
		//�̽������� ����
		
		//1. ��¹��� �̿��ؼ� �Ʒ��� ���� ������ּ��� 
		// "�ȳ�!"
		
		System.out.println("\"�ȳ�!\""); // "�ȳ�!"
		System.out.println("��\n��");	// �ٹٲ�
		System.out.println("��\r��");	// �ٹٲ�
		System.out.println("��\t��");    // ���� 4 ĭ (tab Ű�� �����Ͱ� ����)
		
		// print vs println : �ٹٲ�
		
		test();
		
	}
	
	// printf
	public static void test() {
		System.out.println("===== printf test =====");
		System.out.printf("%s", "abc");
		System.out.println(); //�ٹٲ�
		System.out.printf("%d", 10);
		System.out.println(); //�ٹٲ�
		System.out.printf("%c", 'a');
	}

}//class












