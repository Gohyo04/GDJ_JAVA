package com.gohyo.study3.study;

import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {
		Test test = new Test();
		
		test.t1();
		int n = 10;
		test.t2(n, 5);
		// 값자체를 바꾸는것이라서 stack에서 휘발되면 값이 바뀐다.
		System.out.println(n);
		
		Human human = new Human();
		human.age = 20;
		test.t3(human);		// 인자값(argument)
		// 번지의 값을 바꾸는것이라서 stack에서 휘발되더라도 값은 유지된다.
		System.out.println(human.age);
		
		int[] ar = new int[3];
		ar[0] = 3;
		ar[1] = 2;
		ar[2] = 6;
		ar = test.t4(ar);
	}
}
