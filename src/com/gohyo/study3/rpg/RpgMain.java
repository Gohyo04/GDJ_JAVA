package com.gohyo.study3.rpg;

public class RpgMain {
	public static void main(String[] args) {
		
		Worrier w = new Worrier();
		w.setName("winter");
		w.attack();
		
		Archer a = new Archer();
		a.attack();
		
		
	}
}
