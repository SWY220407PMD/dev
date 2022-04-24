package user;

import mob.Digimon;

public class User {
	
	private String name;
	private Digimon digimon;
	
	public User(String name, Digimon digimon) {
		this.name = name;
		this.digimon = digimon;
	}
	
	public Digimon getDigimon() {
		return digimon;
	}
	
	public void introduce() {
		System.out.println("name ::: " + name);
		System.out.println("digimon ::: " + digimon.getName());
	}
	
}
