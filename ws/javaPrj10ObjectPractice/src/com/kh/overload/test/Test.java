package com.kh.overload.test;

public class Test {
	
	/*
	 * ������
	 * 
	 * [����������] Ŭ������(..){��ü�� �����Ǵ� ����, �����ϰ���� ����}
	 * 
	 * ��ü�� �����Ϸ��� �����ڸ� ȣ���ؾ� �Ѵ�.
	 */
	
	//������ (�⺻ ������)
	public Test() {
		System.out.println("�⺻ ������ ȣ���...");
		this.name = "�ɿ���";
	}
	
	//������ (�ٵ� ����,,, �Ű������� �����,,,)
	public Test(String s) {
		System.out.println("���ڿ� �ϳ� ���޹޴� ������ ȣ���...");
		if(s.equals("zzz")) {
			System.out.println("�̸� ����� ������ ..");
		}
		this.name = s;
	}
	
	//data
	public String name;
	
	public void hi() {
		System.out.println("hi");
	}
	
	public void hi(String name) {
		System.out.println("hi " + name);
	}
	

}//class


















