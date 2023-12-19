package com.gohyo.study5;

import java.util.ArrayList;
import java.util.Scanner;

public class Study5Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		try {
			int num = sc.nextInt();
//			throw new InputMismatchException();		// Exception이 생기면 자동으로 만들어짐 
		
		
		System.out.println("정상 진행");
		
		String str = null;
//		Error
//		int a;
//		System.out.println(a);
//		System.out.println(str.toString());

		Test t = new Test();
		
		int[] arr = new int[2];
		
		arr[3] = 10;		
		
		int a = 10;
		a = a/0;
		
		ArrayList<Integer> ar = null;
		t.t1(ar);
		}catch(Throwable e) {
			System.out.println("Exception 발생");
			e.printStackTrace();
		}finally {
			// 예외가 발생하건 하지않건 실행할 구문
		}
		System.out.println("종료 합니다.");
	}
}
