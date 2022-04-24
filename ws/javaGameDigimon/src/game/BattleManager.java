package game;

import main.Main;
import mob.Digimon;
import mob.partner.GuilMon;
import mob.partner.RenaMon;
import mob.partner.TerrierMon;
import util.GameUtil;

public class BattleManager {
	
	private Digimon userMob = Main.user.getDigimon();
	private Digimon enemyMob = createEnemyDigimon();
	
	//���� ��Ʋ �������� ����� �������� �Ʒ� 2�� ������ ����
	//�ش� ��ü�� �����Ϳ� ���� �������� ������Ѽ� hp�� �����Ű�� ������,
	//hp �ʵ尡 private �̹Ƿ�, ���� ������� ������ �� ����
	private int userHp = userMob.getHp();
	private int enemyHp = enemyMob.getHp();
	
	public void battleStart() {
		
		//�� ������ ���� ���
		System.out.println("=========== ������ ���� ===========");
		System.out.println("�� ������ : " + userMob.info());
		System.out.println("�� ������ : " + enemyMob.info());
		
		
		int status = 0;//1: ���� �¸� , -1: �� �¸�
		
		while(true) {
			
			System.out.println("\n\n\n");
			
			//���� �ൿ ����
			userAct();
			status = checkBattleEnd();
			if(status != 0) break;
			
			//�� �ൿ ����
			enemyAct();
			status = checkBattleEnd();
			if(status != 0) break;
		}
		
		System.out.println("\n********** ��Ʋ ���� **********");
		if(status == 1)
			processUserWin();
		else 
			processUserLose();
			
		System.out.println("******************************\n\n\n\n\n");
		
	}
	
	private void processUserWin() {
		System.out.println("�¸� !!!");
		//���� �¸��� ���޵Ǿ�� �� ���� ���� ���� �ۼ� ~~~ (����ġ ��)
	}
	
	private void processUserLose() {
		System.out.println("�й� .... ");
		//���� �й�� ���� ���� �ۼ� ~~~
	}
	
	private void userAct() {
		System.out.println("========== ��� (" + userMob.getName() + ") �� ���� ==========");
		System.out.println("1. �⺻����");
		System.out.println("2. " + userMob.getSkill01());
		System.out.println("3. " + userMob.getSkill02());
		int action = Integer.parseInt(Main.sc.nextLine());
		int damage = 0;
		switch(action) {
		case 1:
			damage = userMob.attack() - enemyMob.getDef()/2; //������ ������ ���Ƿ� �ۼ�,,,
			break;
		case 2:
			damage = userMob.skill01() - enemyMob.getDef()/2;
			break;
		case 3:
			damage = userMob.skill02() - enemyMob.getDef()/2;
			break;
		default :
			System.out.println("���� ����!");
			break;
		}
		
		if(damage < 0) {
			damage = 0;
		}
		
		enemyHp -= damage;
		System.out.println("������ : " + damage);
	}
	
	private void enemyAct() {
		System.out.println("\n\n---------- ���� (" + enemyMob.getName() + ") �� ���� ----------");
		int action = GameUtil.getRandom(3);
		int damage = 0;
		switch(action) {
		case 1:
			damage = enemyMob.attack() - userMob.getDef()/2;
			break;
		case 2:
			damage = enemyMob.skill01() - userMob.getDef()/2;
			break;
		case 3:
			damage = enemyMob.skill02() - userMob.getDef()/2;
			break;
		default :
			System.out.println("���� ����!");
			break;
		}
		
		if(damage < 0) {
			damage = 0;
		}
		
		userHp -= damage;
		System.out.println("������ : " + damage);
	}
	
	//���ϰ��� 1,0,-1 �� �ϳ��̴�.
	//1 : ���� �¸�(==�� ���� ü�� 0)
	//0 : ���� ������ ���� (ü���� 0�� �� ���Ͱ� ����) 
	//-1: �� �¸�(==���� ���� ü�� 0) 
	private int checkBattleEnd() {
		System.out.println("���� HP : " + userHp);
		System.out.println("���� HP : " + enemyHp);
		if(enemyHp <= 0)
			return 1;
		else if(userHp <= 0)
			return -1;
		else
			return 0; 
	}
	
	private Digimon createEnemyDigimon() {
		System.out.println("�� ���� �����ϴ��� ...");
		int digimonNum = GameUtil.getRandom(3);
		int atk = GameUtil.getRandom(5);
		int def = GameUtil.getRandom(5);
		int hp = 100;
		int speed = GameUtil.getRandom(5);
		switch(digimonNum) {
		case 1: 
			System.out.println("�� ������ ��� ���� !!!");
			return new GuilMon(atk, def, hp, speed);
		case 2:
			System.out.println("�� ������ ������ ���� !!!");
			return new RenaMon(atk, def, hp, speed);
		case 3: 
			System.out.println("�� ������ �׸���� ���� !!!");
			return new TerrierMon(atk, def, hp, speed);
		default :
			System.err.println("������ ���� ���� !!!!!");
			return null;
		}
	}
	
}
