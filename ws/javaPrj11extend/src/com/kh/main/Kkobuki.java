package com.kh.main;

public class Kkobuki {
	
	//생성자(기본생성자 ? 있으면 안됩니다. 왜 ? 불완전한 객체를 만들 수 있으니까)
	public Kkobuki(int l, char t) {
		this.level = l;
		this.type = t;
	}
	
	//데이터
	private final String name = "꼬부기";
	private int level;
	private char type;
	
	//메소드
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public char getType() {
		return this.type;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	//몸통 박치기
	public void bodyAttack() {
		System.out.println(name + " 몸통 박치기 !!!");
	}
	
	//물대포
	public void waterCanon() {
		System.out.println("물대포 ~~~~~");
	}
	
	//거품세례
	public void bubble() {
		System.out.println("거품세례 ~~~ !!!");
	}

}
