package com.kh.main;

public class Pikachu {
	
	//�ƹ��� �����ڵ� ������, JVM(��ǻ��)�� �⺻�����ڸ� �������
	
	//������0
//	public Pikachu() {
//		
//	}
	
	//������1
	public Pikachu(int num, char ch) {
		this.level = num;
		this.type = ch; //E == ����Ÿ��
	}
	
	//������2
//	public Pikachu(int num, char ch, String msg) {
//		this.level = num;
//		this.type = ch;
//		System.out.println(msg);
//	}
	
	
	//������
	private int level;
	private char type; //E,W,F Ÿ��(����,��,��)

	
	//����(�޼ҵ�)
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level){
		this.level = level;
	}
	
	public char getType() {
		return this.type;
	}
	
	public void setType() {
		this.type = type;
	}
	
	
	
	//�����ġ��
	public void bodyAttack() {
		System.out.println("���� ��ġ�� !!!");
	}
	
	//�鸸��Ʈ
	public void millionVolt() {
		System.out.println("�鸸��Ʈ ~~~ !!!");
	}
	
	//�����Ʈ
	public void thunderVolt() {
		System.out.println("�����Ʈ~~~!!!");
	}
	
	

}
