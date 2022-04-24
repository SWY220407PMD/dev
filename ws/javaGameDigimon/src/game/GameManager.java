package game;

import main.Main;
import mob.Digimon;
import mob.partner.GuilMon;
import mob.partner.RenaMon;
import mob.partner.TerrierMon;
import user.User;
import util.GameUtil;

public class GameManager {
	
	public void gameStart() {
		
		
		//����� �̸� �Է¹ޱ�
		System.out.print("����� �̸� : ");
		String userName = Main.sc.nextLine();
		
		//������ �����ϰ� �ϱ�
		showPartnerDigimonInfo();
		int digimonNum = Integer.parseInt(Main.sc.nextLine());
		
		//������ ��ȣ�� �̿��Ͽ� ������ ��ü ����
		Digimon partnerDigimon = createPartnerDigimon(digimonNum);
		
		//�Է¹��� �̸�, ������ ������ ��ü �� �̿��Ͽ� User ��ü ���� ��, static ������ ����
		Main.user = new User(userName, partnerDigimon);
		
		System.out.println("���� ���� �Ϸ�");
		System.out.println("----------");
		Main.user.introduce();
		System.out.println("----------\n\n");
		
		
		while(true) {
			System.out.println("1. ��Ʋ�ϱ�");
			System.out.println("2. ��������");
			int n = Integer.parseInt(Main.sc.nextLine());
			if(n == 1) {
				System.out.println("��Ʋ ����");
				new BattleManager().battleStart();
			}else if(n == 2){
				System.out.println("��������");
				return; //��������
			}
		}
		
		
		
		
		
		
	}
	
	private void showPartnerDigimonInfo() {
		System.out.println("��Ʈ�� ������ ����");
		System.out.println("1. ���");
		System.out.println("2. ������");
		System.out.println("3. �׸����");
	}
	
	private Digimon createPartnerDigimon(int digimonNum) {
		System.out.println("������ ������...");
		int atk = GameUtil.getRandom(10);
		int def = GameUtil.getRandom(10);
		int hp = 100;
		int speed = GameUtil.getRandom(10);
		switch(digimonNum) {
		case 1: 
			return new GuilMon(atk, def, hp, speed);
		case 2: 
			return new RenaMon(atk, def, hp, speed);
		case 3: 
			return new TerrierMon(atk, def, hp, speed);
		default :
			System.err.println("������ ���� ���� !!!!!");
			return null;
		}
	}
	
	

}
