package mob;

public abstract class Pocketmon implements PocketmonAction {
	
	//생성자
	public Pocketmon(int hp, int atk, String name) {
		this.hp = hp;
		this.atk = atk;
		this.name = name;
	}
	
	//필드
	private int hp;
	private int atk;
	private String name;
	
	//메소드
	public void bodyAttack() {
		System.out.println(name + "의 몸통 박치기 ~~~");
	}
	
	//getter/setter
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if(this.hp < hp) this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		if(this.atk < atk) this.atk = atk;
	}
	public String getName() {
		return name;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Pocketmon [hp=" + hp + ", atk=" + atk + ", name=" + name + "]";
	}
	
	
	

}
