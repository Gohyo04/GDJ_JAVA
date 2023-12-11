package com.gohyo.study3.study;

public class Test {
	
	public void t1() {
		System.out.println("T1 Method");
		
	}
	
	public int t2(int n1, int n2) {
		int sum = n1 + n2;
		n1 = 30;
		return sum;
	}
	
	// class(복합타입)를 매개변수로
	public Human t3(Human human) {
		if(human.age > 19) {
			System.out.println("성년");
		}else {
			System.out.println("미성년자");
		}
		
		// 1. 새로운번지에 객체생성
		human = new Human();
		// 2. 값추가
		human.age = 500;
		return human;
	}
	
	public int[] t4(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		ar = new int[2];
		return ar;
	}
}
