package com.gohyo.study3.rpg;

public class RpgMain {
	public static void main(String[] args) {
		Magiction magiction = new Magiction();
		magiction.name = "winter";
		magiction.hp = 200;
		magiction.mp = 100;
		
		Magiction magiction2 = new Magiction();
		magiction2.name = "iu";
		
		magiction.info();
		System.out.println(magiction);
		magiction2.info();
		System.out.println(magiction2);
	}
}
