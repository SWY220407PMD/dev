package updown.main;

import java.util.Random;
import java.util.Scanner;

public class GameManagerUpDown {
	
	public final String gameName = "���ٿ�";
	
	public void gameStart() {
		System.out.println(gameName + " ���� ����~~~");
		
		// ��ǻ�Ͱ� ���� ���� �ϳ� �����ϰ� �ϰ�
		// ���� �ϳ� �Է¹ް�
		// ���ٿ� ������ְ�
		// Ʋ���� ���⋚���� �õ� �ϰ��ϰ�
		// ���߸� "�����Դϴ�" ��� ���ֱ�
		
		//��������
		int r = new Random().nextInt(50);
		
		//�Է�
		Scanner sc = new Scanner(System.in);
		
		//�ݺ�
		//���ٿ� �Ǵ�
		while(true) {
			int input = sc.nextInt();
			if(input < r) {
				System.out.println("UP");
			}else if(input > r){
				System.out.println("DOWN");
			}else {
				System.out.println("�����Դϴ�~~~");
				break;
			}
		}
		
	}//gameStart

}















