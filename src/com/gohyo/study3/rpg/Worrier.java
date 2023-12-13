package com.gohyo.study3.rpg;

import com.gohyo.study3.rpg.weapon.Weapone;

public class Worrier extends Character{
	
	private Weapone weapone;
	
	public Weapone getWeapone() {
		return weapone;
	}

	public void setWeapone(Weapone weapone) {
		this.weapone = weapone;
	}

	public Worrier() {
		super();
	}
	
	public void attack() {
		System.out.println("칼 휘두르기");
	}
}
