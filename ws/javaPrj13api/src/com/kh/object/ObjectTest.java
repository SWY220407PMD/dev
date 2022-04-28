package com.kh.object;

import vo.Person;

public class ObjectTest {
	
	public void test() {
		// getClass
		// � type ���� �˷���
		String s = "abc";
		System.out.println(s.getClass());
		
		Person p = new Person("�ɿ���", 1, 1, 1, 'M');
		System.out.println(p.getClass());
	}
	
	public void test2() {
		//hashCode
		// ��ü�� ID��(�ּҰ��� �ؽ��� ������ ������)�� ������ ���
		// ���ڿ��� ��쿣 ó������� ���� �ٸ� (���� ���ڿ��� ���� �ؽ��ڵ带 ����)
		Person p = new Person("�ɿ���", 1, 1, 1, 'M');
		System.out.println(p.hashCode());
		
		Person p2 = new Person("�ɿ���", 1, 1, 1, 'M');
		System.out.println(p2.hashCode());
		
		String s1 = "���ڿ�1";
		System.out.println(s1.hashCode());
		
		String s2 = new String("���ڿ�1");
		System.out.println(s2.hashCode());
	}
	
	public void test3() {
		//toString
		// toString �� Object �� �ۼ��Ǿ�����
		// ��ü�� �⺻������ ȣ���ϴ� �޼ҵ�
		// ���� �ش� ��ü�� �� Ȯ���� ���� ���
		Person p = new Person("�ɿ���", 1, 1, 1, 'M');
		System.out.println(p.toString());
		System.out.println(p);
		
		
	}

}//class




























