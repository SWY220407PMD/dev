package mob;

public class Pikachu extends Pocketmon {
	
	private static final String name = "피카츄";
	
	public Pikachu(int hp, int atk) {
		super(hp, atk, name);
	}
	
	@Override
	public void skill() {
		System.out.println("백만볼트 ~ !");
	}
	
	
	
	
	
	

}
