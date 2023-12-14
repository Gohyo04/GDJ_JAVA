package com.gohyo.study4.lang.ex2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ex2Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 입력"); // 991225-1234567
		String inInfo = sc.next();
		
		String[] arr = inInfo.split("-");
		int genN = Integer.parseInt(arr[1].substring(0,1));
		LocalDate tt = LocalDate.now();
		int yearN = Integer.parseInt(arr[0].substring(0, 2));
		boolean loop = true;
		while(loop) {
			System.out.println("1. 성별");
			System.out.println("2. 나이");
			System.out.println("3. 계절");
			System.out.println("4. 타당성");
			System.out.println("5. 종료");
			int n = sc.nextInt();
			if(n == 1) {
				// 1. 남자여자 구별
				switch(genN) {
				case 1:
				case 3:
					System.out.println("남자");
					break;
				case 2:
				case 4:
					System.out.println("여자");
					break;
				}
			}else if(n == 2) {
				// 2. 대략 나이
				int age = 0;
				System.out.println("태어난해 : "+yearN);
				if(1900+yearN >= 1923) {
					age = Integer.parseInt(String.valueOf(tt.getYear())) - (1900+yearN);
				}else if(1900+yearN < 1923){
					age = Integer.parseInt(String.valueOf(tt.getYear())) - (2000+yearN);
				}
				System.out.println("나이 : "+age);
			}else if(n == 3) {
				// 3. 태어난 계절
				int month = Integer.parseInt(arr[0].substring(2, 4));
				System.out.println("달: "+ month);
				if(month >= 3 && month <= 5) {
					System.out.println("봄");			
				}else if(month >= 6 && month <= 8) {
					System.out.println("여름");			
				}else if(month >= 9 && month <= 11) {			
					System.out.println("가을");
				}else{			
					System.out.println("겨울");
				}
			}else if(n == 4) {
				// 4. 주민번호의 타탕성
				// 9 9 1 2 2 5 - 1 2 3 4 5 6 7
				//*2 3 4 5 6 7   8 9 2 3 4 5
				// 총합구하기
				// ex) 122(총합)을 11로 나눈 나머지
				// 11에서 나머지를 뺀 결과를 체크용 번호와 비교
				// 만약에 나머지가 2자리라면 
				// 그 나머지를 10으로 나눈 나머지를 구한다
				// 그 나머지를 체크번호와 일치하는지 확인
				//이름, 주민
				int cnt = 2;
				int sum = 0;
				String str = arr[0] + arr[1];
				int checkN = Integer.parseInt(str.substring(str.length()-1));
				for(int i=0;i<str.length()-1;i++) {
					sum += Integer.parseInt(str.substring(i,i+1)) * cnt;
					cnt++;
					if(cnt > 9) {
						cnt = 2;
					}
				}
				int verifi = 11 - (sum % 11);
				if(verifi > 9) {
					verifi = verifi % 10;
				}
				if(verifi == checkN) {
					System.out.println("알맞는 주민번호");
				}else {
					System.out.println("잘못된 주민번호");
				}
			}else {
				System.out.println("종료");
				loop = false;
			}
		}
	}
}
