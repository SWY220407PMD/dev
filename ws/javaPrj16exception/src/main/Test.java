package main;

public class Test {
	
	public void test() throws Exception {
		
		//���ܸ� ���� ���� �߻���Ű��
		
//		try {
//			throw new Exception(); // ������. Exception ��ü��.
//		}catch(Exception e) {
//			System.out.println("���� ����");
//		}
		throw new Exception(); //Throwable Ÿ���� ��ü(����)�� ���� �� ����
	}
	
	public void methodA() throws Exception 
	{
		System.out.println("�޼ҵ� A ȣ��� ...");
		methodB();
		System.out.println("�޼ҵ� A ���� ...");
	}
	
	public void methodB() throws Exception 
	{
		System.out.println("�޼ҵ� B ȣ��� ...");
		methodC();
		System.out.println("�޼ҵ� B ���� ...");
	}
	
	public void methodC() throws Exception 
	{
		System.out.println("�޼ҵ� C ȣ��� ...");
		int x = 1 / 0;
		System.out.println("�޼ҵ� C ���� ...");
	}

}//class






























