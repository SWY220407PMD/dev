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
		
		
		//사용자 이름 입력받기
		System.out.print("사용자 이름 : ");
		String userName = Main.sc.nextLine();
		
		//디지몬 선택하게 하기
		showPartnerDigimonInfo();
		int digimonNum = Integer.parseInt(Main.sc.nextLine());
		
		//선택한 번호를 이용하여 디지몬 객체 생성
		Digimon partnerDigimon = createPartnerDigimon(digimonNum);
		
		//입력받은 이름, 생성된 디지몬 객체 를 이용하여 User 객체 생성 후, static 변수에 저장
		Main.user = new User(userName, partnerDigimon);
		
		System.out.println("유저 생성 완료");
		System.out.println("----------");
		Main.user.introduce();
		System.out.println("----------\n\n");
		
		
		while(true) {
			System.out.println("1. 배틀하기");
			System.out.println("2. 게임종료");
			int n = Integer.parseInt(Main.sc.nextLine());
			if(n == 1) {
				System.out.println("배틀 시작");
				new BattleManager().battleStart();
			}else if(n == 2){
				System.out.println("게임종료");
				return; //게임종료
			}
		}
		
		
		
		
		
		
	}
	
	private void showPartnerDigimonInfo() {
		System.out.println("파트너 디지몬 선택");
		System.out.println("1. 길몬");
		System.out.println("2. 레나몬");
		System.out.println("3. 테리어몬");
	}
	
	private Digimon createPartnerDigimon(int digimonNum) {
		System.out.println("디지몬 생성중...");
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
			System.err.println("디지몬 생성 실패 !!!!!");
			return null;
		}
	}
	
	

}
