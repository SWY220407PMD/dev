package person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import mob.Pocketmon;

public class Trainer {
	
	public Trainer(String name) {
		this.name = name;
	}
	
	//필드
	private String name;
	private final Map<String, Pocketmon> pocket = new HashMap<>();
	
	//메소드
	public void addPocketmon(Pocketmon p) {
		pocket.put(p.getName(), p);
	}
	
	public Pocketmon getPocketmon(String name) {
		return pocket.get(name);
	}
	
	public void printAllPocketmonName() {
		Set<String> s = pocket.keySet();
		System.out.println(name + " 의 모든 포켓몬 이름--------");
		
		for(String str : s) {
			System.out.println(str);
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
