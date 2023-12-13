package com.gohyo.study3.poly;

public class PolyMain {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.num=20;
		Child2 c2 = new Child2();
		c2.num=30;
		
		// 상속관계
		Parent p = c1;
		System.out.println(p.num);
		p = c2;
		System.out.println(p.num);
		
	}
}
