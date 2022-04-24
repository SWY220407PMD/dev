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
	
	//현재 배틀 내에서만 사용할 목적으로 아래 2개 변수를 만듦
	//해당 객체의 데이터에 직접 데미지를 적용시켜서 hp를 변경시키고 싶지만,
	//hp 필드가 private 이므로, 값을 마음대로 수정할 수 없음
	private int userHp = userMob.getHp();
	private int enemyHp = enemyMob.getHp();
	
	public void battleStart() {
		
		//각 디지몬 정보 출력
		System.out.println("=========== 디지몬 정보 ===========");
		System.out.println("내 디지몬 : " + userMob.info());
		System.out.println("적 디지몬 : " + enemyMob.info());
		
		
		int status = 0;//1: 유저 승리 , -1: 적 승리
		
		while(true) {
			
			System.out.println("\n\n\n");
			
			//유저 행동 선택
			userAct();
			status = checkBattleEnd();
			if(status != 0) break;
			
			//적 행동 선택
			enemyAct();
			status = checkBattleEnd();
			if(status != 0) break;
		}
		
		System.out.println("\n********** 배틀 종료 **********");
		if(status == 1)
			processUserWin();
		else 
			processUserLose();
			
		System.out.println("******************************\n\n\n\n\n");
		
	}
	
	private void processUserWin() {
		System.out.println("승리 !!!");
		//유저 승리시 지급되어야 할 보상 관련 로직 작성 ~~~ (경험치 등)
	}
	
	private void processUserLose() {
		System.out.println("패배 .... ");
		//유저 패배시 관련 로직 작성 ~~~
	}
	
	private void userAct() {
		System.out.println("========== 당신 (" + userMob.getName() + ") 의 차례 ==========");
		System.out.println("1. 기본공격");
		System.out.println("2. " + userMob.getSkill01());
		System.out.println("3. " + userMob.getSkill02());
		int action = Integer.parseInt(Main.sc.nextLine());
		int damage = 0;
		switch(action) {
		case 1:
			damage = userMob.attack() - enemyMob.getDef()/2; //데미지 계산식은 임의로 작성,,,
			break;
		case 2:
			damage = userMob.skill01() - enemyMob.getDef()/2;
			break;
		case 3:
			damage = userMob.skill02() - enemyMob.getDef()/2;
			break;
		default :
			System.out.println("공격 실패!");
			break;
		}
		
		if(damage < 0) {
			damage = 0;
		}
		
		enemyHp -= damage;
		System.out.println("데미지 : " + damage);
	}
	
	private void enemyAct() {
		System.out.println("\n\n---------- 상대방 (" + enemyMob.getName() + ") 의 차례 ----------");
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
			System.out.println("공격 실패!");
			break;
		}
		
		if(damage < 0) {
			damage = 0;
		}
		
		userHp -= damage;
		System.out.println("데미지 : " + damage);
	}
	
	//리턴값은 1,0,-1 중 하나이다.
	//1 : 유저 승리(==적 몬스터 체력 0)
	//0 : 게임 끝나지 않음 (체력이 0이 된 몬스터가 없음) 
	//-1: 적 승리(==유저 몬스터 체력 0) 
	private int checkBattleEnd() {
		System.out.println("나의 HP : " + userHp);
		System.out.println("적의 HP : " + enemyHp);
		if(enemyHp <= 0)
			return 1;
		else if(userHp <= 0)
			return -1;
		else
			return 0; 
	}
	
	private Digimon createEnemyDigimon() {
		System.out.println("적 몬스터 등장하는중 ...");
		int digimonNum = GameUtil.getRandom(3);
		int atk = GameUtil.getRandom(5);
		int def = GameUtil.getRandom(5);
		int hp = 100;
		int speed = GameUtil.getRandom(5);
		switch(digimonNum) {
		case 1: 
			System.out.println("적 디지몬 길몬 등장 !!!");
			return new GuilMon(atk, def, hp, speed);
		case 2:
			System.out.println("적 디지몬 레나몬 등장 !!!");
			return new RenaMon(atk, def, hp, speed);
		case 3: 
			System.out.println("적 디지몬 테리어몬 등장 !!!");
			return new TerrierMon(atk, def, hp, speed);
		default :
			System.err.println("디지몬 생성 실패 !!!!!");
			return null;
		}
	}
	
}
