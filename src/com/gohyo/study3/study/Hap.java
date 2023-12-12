package com.gohyo.study3.study;

public class Hap {
	
	// 메서드 오버로딩 <-> 오버라이딩
	// 같은 이름의 메서드를 여러개 만드는것
	// 1. 매개변수의 갯수나, 타입의 조합이 다르면 가능
	
	public void h1(int n1) {
		System.out.println(n1);
	}
	
	public void h1(int n1, int n2) {
		int result = n1+n2;
		System.out.println(result);
	}
	
	public void h1(int n1, float n2) {
		System.out.println(n1+n2);
	}
	
	public void h1(float n1, float n2) {
		System.out.println(n1+n2);
	}
}
