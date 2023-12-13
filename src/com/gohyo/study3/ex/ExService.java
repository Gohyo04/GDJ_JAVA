package com.gohyo.study3.ex;

import java.util.Scanner;

public class ExService {
	
		// 추가
		Scanner sc = new Scanner(System.in);
		public ExCard[] add(ExCard[] cards) {
			ExCard card = new ExCard();
			System.out.println("번호: ");
			card.setNum(sc.nextInt());
			System.out.println("회사명: ");
			card.setCompany(sc.next());
			System.out.println("이름: ");
			card.setName(sc.next());
			System.out.println("직책: ");
			card.setGrade(sc.next());
			System.out.println("전화번호: ");
			card.setTel(sc.next());
			System.out.println("이메일: ");
			card.setEmail(sc.next());
			System.out.println("주소: ");
			card.setAddr(sc.next());
			if(cards == null) {
				ExCard[] newCards = new ExCard[1];
				newCards[0] = card;
				return newCards;
			}else{
				ExCard[] newCards = new ExCard[cards.length+1];
				for(int i=0;i<cards.length;i++) {
					newCards[i] = cards[i];
				}
				newCards[cards.length] = card;
				return newCards;
			}
		}
	
		// 삭제
		public ExCard[] remove(ExCard[] cards) {
			System.out.println("삭제 할 번호: ");
			int n = sc.nextInt();
			ExCard[] arr = new ExCard[cards.length-1];
			
			int cnt = 0;
			for(int i=0;i<cards.length;i++) {
				if(cards[i].getNum() != n) {
					arr[cnt] = cards[i];
					cnt++;
				}
			}
		return arr;
	}
}
