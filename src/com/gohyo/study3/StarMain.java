package com.gohyo.study3;

public class StarMain {
	public static void main(String[] args) {
		// 변수선언	  = 객체 생성
		// 클래스명 변수명 = new 클래스명();
		Marine marine = new Marine();
		
		//멤버사용
		//변수명.멤버변수명
		//변수명.멤버메서드명();
		marine.hp = 50;
		marine.move();
		
		Marine marine2 = new Marine();
		
		marine2 = marine;
		
		
	}
}
