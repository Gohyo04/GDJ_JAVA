package com.gohyo.study3.rpg;

public class Magiction extends Character{

	private int mp;
	
	
	
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public void info() {
		super.superInfo();
//		System.out.println(this.getName());
//		System.out.println(this.getHp());
		System.out.println(this.getMp());
	}
	
	public void t1() {
		System.out.println("Test 메서드입니다.");
	}

	@Override
	public void attack() {
		System.out.println("마법공격");
	}
}
