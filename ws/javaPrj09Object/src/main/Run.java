package main;

import java.util.Scanner;

import practice.MyClass01;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("Run Ŭ������ main �޼ҵ� ȣ���...");
		System.out.println("============================");
		
		//��ü ���� (MyClass01 Ŭ���� ������ �̿��ؼ� ��ü)
		MyClass01 mc01 = new MyClass01();
		MyClass01 mc011 = new MyClass01();  //swy
		//��ü�� �޼ҵ� ȣ�� (MyClass01 Ŭ���� ������ myMethod01 ȣ��)
		mc01 = mc011; //swy
		mc01.myMethod01();
		mc01.myMethod02();
		
		
		
		
		
		
		//<��ü����>
		
		//�ؾ
		/*
		 * class : �ؾ Ʋ
		 * ��ü(== Object == instance) : �ؾ
		 */
		
		//���赵
		/*
		 * class : ���赵
		 * ��ü : ���赵�� �̿��ؼ� ������� ��ǰ
		 */
		
		// ī�� �Ƹ�����Ʈ
		// ö�� ����
		
		/*
		 * <��ü����>
		 * [ī���� ����]
		 * - �г���
		 * - �ñ� : 9õ��
		 * - �ֹ��޴� ���
		 * - ��� ���
		 * 
		 * [�ֹ� ����]
		 * - �г���
		 * - �ñ� : ����
		 * - ���� ���� ���
		 * - ���� �ǳ״� ���
		 * 
		 */
		
		/*
		 * <��������>
		 * 1. �մ��� ����
		 * 2. �ֹ� ����
		 * 2-1 (�ֹ�����ϰ� ����, �Ʒ� ���� �������� ����)
		 * 3. ���
		 * 3-1 (�ܾ׺���, �մ��� �θ���,, ����,,,�׷��� �Ʒ� ���� ���� ���� , ������ �ֹ������� ���)
		 * 4. ���� ����
		 * 5. ���� �ǳ�
		 * 
		 */
		
	}//main

}//class































