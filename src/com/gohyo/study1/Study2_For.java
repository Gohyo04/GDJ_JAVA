package com.gohyo.study1;

import java.util.Scanner;

public class Study2_For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		String result = "로그인실패";
		// 아이디와 패스워드를 입력받고
		// 로그인 성공 유무 판단
		
		for(int i=0;i<5;i++) {
			System.out.println("아이디를 입력해주세요 : ");
			 int inputId = sc.nextInt();
			System.out.println("비밀번호를 입력해주세요 : ");
			 int inputPw = sc.nextInt();
			 if(id == inputId && pw == inputPw) {
				 result = "로그인성공";
				 break;
			 }
		}
		System.out.println(result);
	}
}
