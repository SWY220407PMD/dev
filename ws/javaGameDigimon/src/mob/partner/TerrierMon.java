package mob.partner;

import mob.Digimon;

public class TerrierMon extends Digimon {

	private final String name = "테리어몬";
	private final String skill01 = "불꽃 발사";
	private final String skill02 = "회오리 바람";
	
	public TerrierMon(int atk, int def, int hp, int speed) {
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
