package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== ���� ó�� =====");
		
		//����(�ʹ� ũ��Ƽ������ ���� ����) == ����
		
		/*
		 * <����>
		 * ������ ����
		 * ��Ÿ�� ����
		 * 
		 * ���� �߻���Ű��
		 * throw
		 */
		
		Test t = new Test();
		try 
		{
			t.methodA();
		} 
		catch (Exception e) 
		{
//			e.printStackTrace(); //�����۾��� ���� �޼��� ���
			System.out.println("���� �޼ҵ忡�� Exception catch");
		}
		
		
//		try {
//			t.test();
//		} catch (Exception e) {
//			System.out.println("���θ޼ҵ忡�� Exception �� catch ��");
//		}
		
//		System.out.println("�ȳ��ϼ���");
//		
//		try {
//			int x = 1 / 0;
//			String str = null;
//			String strSub = str.substring(2, 5);
//			System.out.println(strSub);
//		}catch(ArithmeticException ae) {
//			System.out.println("AE �����");
//		}catch(Exception e) {
//			System.out.println("���� �����");
//		}
//		
//		
//		System.out.println("���̹���");
		

	}//main

}//class


























