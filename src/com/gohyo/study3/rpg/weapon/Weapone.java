package com.gohyo.study3.rpg.weapon;

public interface Weapone {
	
	// 상수
	final int level = 1;
	
	// 추상메서드
	public abstract void attack();
	
	// 접근지정자는 public만 가능 
	// -> public, abstract를 생략해도 자동으로 넣어준다.
//	void damage();
//	
//	public int inchant();
//	
//	abstract String go();
}
