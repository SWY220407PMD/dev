package main;

import java.util.*;

public class Test {
	
	/*
	 * ���׸�
	 * - (�ַ� �÷���) Ÿ�� ������ ���� ���
	 * ��뿹�� : List<String> = new ArrayList<String>(); 
	 * List<String> = new ArrayList<>();
	 */
	
	public void test() {
		
		List<Integer> al = new ArrayList<>();
		
//		al.add("asd"); //���׸� ������ �ȵ�
		al.add(10);
		al.add(20);
		al.add(30);
		
		//����Ʈ�� �ִ� ��� ������ ���� �� ��� 
		
//		int x1 = al.get(0);
//		int x2 = al.get(1);
//		int x3 = al.get(2);
//		
//		int result = x1 + x2 + x3;
//		System.out.println(result);
		
		int result = 0;
//		for(int i = 0 ; i < al.size(); i++)
		for(int elem : al) //���� for�� (�÷���, �迭 ��� ��� ����)
		{
			int temp = elem;
			result += temp;
		}
		System.out.println(result);
		
	}

}//class
















































