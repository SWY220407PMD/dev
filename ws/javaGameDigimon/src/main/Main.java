package main;

import java.util.Scanner;

import game.GameManager;
import user.User;

/* ���� ��ȹ ����Ѱ� ,,,

0. �г��� �Է�
1. ������ �����ֱ� , ������ ����
2. ��Ʋ�� ����
3. �������� �� ������ (�߻��� ���� ����)
4. ��Ʋ ����
5. �� ���� �����ֱ�
6. �ൿ ���� (�ο��/��������)
�������� -> 3������
7. (�ο�� ���� ��) ��Ʋ ����
���� �ൿ ����(����,��ų,���ϱ�)
��ǻ�� ���� �ൿ ����
��Ʋ ����ñ��� �ݺ�

 */

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	public static User user;

	public static void main(String[] args) {
		
		System.out.println("������RPG");
		System.out.println("=======================");
		
		GameManager gm = new GameManager();
		gm.gameStart();
		
	}

}
