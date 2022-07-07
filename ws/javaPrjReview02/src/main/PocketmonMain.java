package main;

import java.util.HashMap;

import mob.Kkobuki;
import mob.Pairi;
import mob.Pikachu;
import mob.Pocketmon;
import person.Trainer;

public class PocketmonMain {

	public static void main(String[] args) {
		
		System.out.println("=====포켓몬=====");
		
		Pocketmon p1 = new Pikachu(100, 30);
		Pocketmon p2 = new Pairi(100, 25);
		Pocketmon p3 = new Kkobuki(100, 20);
		Pocketmon[] pArr = new Pocketmon[3];
		pArr[0] = p1;
		pArr[1] = p2;
		pArr[2] = p3;

		Trainer t = new Trainer("심원용");
		t.addPocketmon(p1);
		t.addPocketmon(p2);
		t.addPocketmon(p3);
		
		t.printAllPocketmonName();
		
	}//main

}//class



































