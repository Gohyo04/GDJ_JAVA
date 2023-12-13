package com.gohyo.study3.rpg;

import com.gohyo.study3.rpg.weapon.Axe;
import com.gohyo.study3.rpg.weapon.Bow;

public class RpgMain {
	public static void main(String[] args) {
		
		Worrier w = new Worrier();
		w.setName("winter");
		w.attack();
		
		Archer a = new Archer();
		a.attack();
		
		Magiction m = new Magiction();
		
		Character c1 = m;
		Character c2 = a;
		
		Axe axe = new Axe();
		w.setWeapone(axe);
		
		Bow bow = new Bow();
		w.setWeapone(bow);
	}
}
