package com.gohyo.study1;

import java.util.Scanner;

public class Study4_For {
	public static void main(String[] args) {
		
		// 1. 로그인 처리
		// 	 1. 로그인  2. 종료
		//   -id, pw
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int id = 1234;
		int pw = 5678;
		while(flag) {
			System.out.println(("1. 로그인, 2. 종료"));
			int n = sc.nextInt();
			if(n == 1) {
				System.out.println("로그인");
				System.out.println("아이디를 입력하세요 : ");
				int userId = sc.nextInt();
				System.out.println("비밀번호를 입력하세요 : ");
				int userPw = sc.nextInt();
				if(id == userId && pw == userPw) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				flag = false;
				System.out.println("종료");
			}
		}
		
		int g = 0;
		int lv = 1;
		// 2. MMORPG
		// 레벨은 1부터 시작
		// 1마리 잡을때, 레벨업할때마다 표시
		// 골드 0 
		if(flag == true) {
			for(lv=1;lv<=15;lv++) {
				for(int target=1;target<=(lv-1)*3;target++) {
					// 1 -> 2  3마리 
					// 2 -> 3  6마리
					// 3 -> 4  9마리
					// ...
					// 14 -> 15  42마리
					System.out.println(target+"마리 잡았다");
				}
				System.out.println("레벨 : "+lv);
				// 레벨이 5랩 달성시 1000G
				// 레벨이 10렙 달성시 2000G
				// 레벨이 15렙 달성시 3000G
				if(lv % 5 == 0) {
					g += 1000 * (lv/5);
					System.out.println("골드 : "+g);
				}
			}
			// 최종 레벨과 골드를 출력 게임 종료
			System.out.println("최종레벨 : "+ (lv-1)+" 최종골드 : "+g);
		}
	}
}
