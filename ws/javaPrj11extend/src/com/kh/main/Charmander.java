package com.kh.main;

public class Charmander {
	
	//»ı¼ºÀÚ
	public Charmander(int level, char type) {
		this.level = level;
		this.type = type;
	}
	
	//µ¥ÀÌÅÍ
	private int level;
	private char type;
	
	//¸Ş¼Òµå
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
	
	//¸öÅë ¹ÚÄ¡±â
	public void bodyAttack() {
		System.out.println("¸öÅë ¹ÚÄ¡±â !!!");
	}
	
	//Àü±¤¼®È­
	public void speedAttack() {
		System.out.println("Àü±¤¼®È­ !!!");
	}
	
	//ºÒ²É¼¼·Ê
	public void fire() {
		System.out.println("ºÒ²É¼¼·Ê ~~~ !!!");
	}
	
	

}
