package mob;

public class Digimon {
	
	private final String skill01 = "�θ�Ŭ������ ��ų01,,,�� ���ڴ� �������� ������...";
	private final String skill02 = "�θ�Ŭ������ ��ų02,,,�� ���ڴ� �������� ������...";
	
	protected String name = "�θ�Ŭ������ name...�̰͵� ������ �ȵ�...�̰� ���´ٸ�, �ڽ�Ŭ�������� name �ʵ� �ȸ������";//���, ������, �׸���� ��
	protected int atk;	 		//���ݷ�
	protected int def;	 		//����
	protected int hp;			//ü��
	protected int speed;		//��ø�� (�������� �Ǵ� ����)
	protected int level;		//����
	protected int exp;			//����ġ
	
	public Digimon(int atk, int def, int hp, int speed) {
		this.atk = atk;
		this.def = def;
		this.hp = hp;
		this.speed = speed;
	}

	//�⺻����
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
