package chap02var;

public class VarTest {
	
	/*
	 * ���� ��� ��Ģ
	 * - Ŭ���� �̸��� �빮�ڷ� ����
	 * - �޼ҵ� �̸�, ������ �� �ҹ��ڷ� ����
	 * - ���Ⱑ �ִ� ���� �ܾ��� ���, ���� ��� �ٿ����� �����ܾ��� ������ �빮�ڷ� ����
	 * - ������� �̸��� ��� �빮�ڷ� �ۼ�			   //ex) PI
	 * - ������� �̸��� �������� �ܾ��� ���, '_' �� ���  //ex) MAX_SIZE
	 * 
	 * - PascalCase //�빮�ڷ� ����, ���� ��� �빮��
	 * - camelCase // �ҹ��ڷ� ����, ���� ��� �빮��
	 * - Ŭ������ �� PascalCase
	 * - �޼ҵ�, ������ �� camelCase
	 */

	public void test() {
		int x = 10;
		System.out.println(x);
	}
	
	public void test2() {
		//������ ����
		byte b = 127;	//1 byte
		short s = 1;	//2 byte
		int i = 10;		//4 byte
		long l = 999;	//8 byte
		
		System.out.println("byte b : " + b);
		System.out.println("short s : " + s);
		System.out.println("int i : " + i);
		System.out.println("long l : " + l);
		
	}
	
	public void test3() {
		//�Ǽ��� ����
		float f = 3.14f;		//4 byte
		double d = 1.23456789;	//8 byte
		
		System.out.println("float f : " + f);
		System.out.println("double d : " + d);
	}
	
	
	public void test4() {
		//���� ����
		boolean b = true;	//1 byte
		System.out.println(b);
	}
	
	public void test5() {
		//����
		char ch = 'A';
		System.out.println((int)ch); //��ǻ�ʹ� ���ڸ� ���ڷ� ����Ѵ�.
		
	}
	
	public void test6() {
		//���ڿ� (==���� �迭)
		String str = "�ɿ���";
		System.out.println(str);
		
		final double PI = 3.14;
		System.out.println(PI);
		
	}
	
	//��� (== �׻� ���� ���� ������ ��)
	public void test7() {
		final double PI = 3.14; //pi == ��� (final�� �ٿ����ϱ�)
		//3.14 �� �̿��ؼ� ����ϴ� ���α׷� ~~~~~ (���ǳ��� ���ϰų� �� �׷��� ,,,,,)
		
//		pi = 3.41; //����� �ٽ� ���� �Ҵ��� �� ����
	}
	
	
	
	
	
	
	
	
	
}//class































