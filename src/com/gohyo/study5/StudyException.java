package com.gohyo.study5;

import java.util.Scanner;

public class StudyException {
	
	public void t2() throws Exception{
		// 유치원생 3살
		// 0 ~ 99
		int n1 = 39;
		int n2 = 60;
		int r1 = n1 + n2;
		int r2 = n1 - n2;
		
		if(r1 > 99) {
			throw new MyException("세자리 숫자는 모른다");
		}
		
		if(r2 < 0) {
			throw new MyException("음수는 모른다");
		}
		System.out.println(n1+n2);
		System.out.println(n1-n2);			
	}
	
	
	public void t1() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
//		throw new InputMismatchException();
		int num2 = 9;
		
		System.out.println(num2 / num);
//		throw new ArithmeticException();
		
		StudyException2 se2 = new StudyException2();
		
		se2.t2();
	}
}
