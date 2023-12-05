package com.gohyo.study1;

import java.util.Scanner;

public class Study4_For {
	public static void main(String[] args) {
		// 서든 FPS
		// 총알 : 30발 * 3
		
		// 1. 단발모드
		// 2. 점사모드
		Scanner sc = new Scanner(System.in);
		for(int j=0;j<3;j++) {
			System.out.println("모드선택 : ");
			int mode = sc.nextInt();
			if(mode == 1) {
				for(int i=0;i<30;i++) {
					System.out.println("탕");
				}
			}else if(mode == 2){
				for(int i=0;i<10;i++) {
					System.out.println("탕탕탕");
				}
			}
		}
		System.out.println("끝");
	}
}
