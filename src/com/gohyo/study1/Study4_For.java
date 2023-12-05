package com.gohyo.study1;

import java.util.Scanner;

public class Study4_For {
	public static void main(String[] args) {
		
		// 1. 로그인 처리
		// 	 1. 로그인  2. 종료
		//   -id, pw
		Scanner sc = new Scanner(System.in);
		int login = sc.nextInt();
		if(login == 1) {
			
		}else if(login == 2){
			System.out.println("종료");
		}
		
		System.out.println("로그인");
		int g = 0;
		int lv = 1;
		// 2. MMORPG
		// 레벨은 1부터 시작
		// 1마리 잡을때, 레벨업할때마다 표시
		// 골드 0 
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
