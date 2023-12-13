package com.gohyo.study3.ex;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	boolean check = true;
	// 동작할 메서드생성
	public void start() {
		ExCard card = new ExCard();
		ExCard[] cards = null;
		ExService service = new ExService();
		CardView cardView = new CardView();
		
		// 종료되기전까지 menu로 왔을때 반복할 문구
		while(check) {
			System.out.println("1.목록보기 / 2.상세보기 / 3.목록추가");
			System.out.println("4.목록수정 / 5.목록삭제 / 6.종  료");
			
			// 선택할 번호입력받고
			int n = sc.nextInt();
			
			// 입력받은번호로 해당 case 출력
			switch(n) {
			case 1:
				cardView.view(cards);
				break;
			case 2:
				System.out.println("상세보기");
				cardView.detailView(cards);
				break;
			case 3:
				System.out.println("목록추가");
				cards = service.add(cards);
				break;
			case 4:
				System.out.println("목록수정");
				break;
			case 5:
				System.out.println("목록삭제");
				cards = service.remove(cards);
				break;
			case 6:
				System.out.println("종료");
				// 종료시 check false로 while 반복문 종료
				check = false;
				break;
			}		
		}
	}
}
