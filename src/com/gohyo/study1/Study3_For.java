package com.gohyo.study1;

import java.util.Scanner;

public class Study3_For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//구구단
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i +" * "+ j +" = "+i*j);
//			}
//		}
		// 0~59분
		// 0~59초
		// 1분 5초
		// 분, 초 입력
		boolean flag = false;
		int m = sc.nextInt();
		int s = sc.nextInt();
		for(int i=0;i<60;i++) {
			for(int j=0;j<60;j++) {
				System.out.println(i+"분 :"+j+"초");
				if(s == j && i == m) {
					flag = true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}
		
	}
}
