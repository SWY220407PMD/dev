package mob;

public class Pairi extends Pocketmon {

	private static final String name = "파이리";
	
	public Pairi(int hp, int atk) {
		super(hp, atk, name);
	}
	
	@Override
	public void skill() {
		System.out.println("파이어볼 ~ !");
	}
	
	

}
