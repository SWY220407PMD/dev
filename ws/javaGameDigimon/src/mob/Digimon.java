package mob;

public class Digimon {
	
	private final String skill01 = "부모클래스의 스킬01,,,이 글자는 나올일이 없겠지...";
	private final String skill02 = "부모클래스의 스킬02,,,이 글자는 나올일이 없겠지...";
	
	protected String name = "부모클래스의 name...이것도 나오면 안됨...이게 나온다면, 자식클래스에서 name 필드 안만든거임";//길몬, 레나몬, 테리어몬 등
	protected int atk;	 		//공격력
	protected int def;	 		//방어력
	protected int hp;			//체력
	protected int speed;		//민첩성 (선제공격 판단 목적)
	protected int level;		//레벨
	protected int exp;			//경험치
	
	public Digimon(int atk, int def, int hp, int speed) {
		this.atk = atk;
		this.def = def;
		this.hp = hp;
		this.speed = speed;
	}

	//기본공격
	/* abstract */
	
	public int attack() {
		return atk;
	}
	
	public int skill01() {
		return atk + 1;
	}
	
	public int skill02() {
		return atk * 2;
	}
	
	

	public String info() {
		return "Digimon [atk=" + atk + ", def=" + def + "]";
	}

	public String getName() {
		return name;
	}

	public int getAtk() {
		return atk;
	}

	public int getDef() {
		return def;
	}

	public int getHp() {
		return hp;
	}

	public int getSpeed() {
		return speed;
	}

	public int getLevel() {
		return level;
	}

	public int getExp() {
		return exp;
	}
	
	////////////////////////////////////
	//getter
	public String getSkill01() {
		return skill01;
	}

	public String getSkill02() {
		return skill02;
	}
	
	

}
