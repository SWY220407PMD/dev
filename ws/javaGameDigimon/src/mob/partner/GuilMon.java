package mob.partner;

import mob.Digimon;

public class GuilMon extends Digimon {
	
	private final String name = "길몬";
	private final String skill01 = "들이받기";
	private final String skill02 = "파이어볼";
	
	public GuilMon(int atk, int def, int hp, int speed) {
		super(atk, def, hp, speed);
	}
	
	public int attack() {
		System.out.println(name + "기본공격!");
		return super.attack();
	}
	
	public int skill01() {
		System.out.println(skill01 + " !!!");
		return super.skill01(); 
	}
	
	public int skill02() {
		System.out.println(skill02 + " !!!");
		return super.skill02();
	}

	
	
	////////////////////////////////////
	//getter
	public String getName() {
		return name;
	}
	
	public String getSkill01() {
		return skill01;
	}

	public String getSkill02() {
		return skill02;
	}

}
