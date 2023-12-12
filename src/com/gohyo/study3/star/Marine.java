package com.gohyo.study3.star;

public class Marine {
	
	int hp = 100;
	Gun gun;
	
	//생성자
	// 접근지정자 메서드명([매개변수선언]){}	-> 메서드명 == 클래스명과 동일하게
	public Marine() {
		System.out.println("생성자");
		this.hp = 200;
		this.gun = new Gun();
	}
	
	public void move() {
		System.out.println("이동");
	}
}
