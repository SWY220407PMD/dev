package mob;

public class Kkobuki extends Pocketmon {

	private static final String name = "꼬부기";

	public Kkobuki(int hp, int atk) {
		super(hp, atk, name);
	}

	@Override
	public void skill() {
		System.out.println("물대포 ~~~ !");
	} 
	
	

}
