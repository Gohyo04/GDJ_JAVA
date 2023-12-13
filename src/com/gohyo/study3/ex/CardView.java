package com.gohyo.study3.ex;

import java.util.Scanner;

public class CardView {
	Scanner sc = new Scanner(System.in);
	public void view(ExCard[] cards) {
		if(cards == null) {
			System.out.println("명함이 없습니다.");
		}else {
			for(int i=0;i<cards.length;i++) {
				System.out.println("번호: "+cards[i].getNum()+" / 회사명: "+cards[i].getCompany()+" / 이름: "+cards[i].getName());
			}			
		}
	}
	
	public void detailView(ExCard[] cards) {
		System.out.println("조회할 번호: ");
		int searchNum = sc.nextInt();
		for(int i=0;i<cards.length;i++) {
			if(searchNum == cards[i].getNum()) {
				System.out.println("번호: "+cards[i].getNum() +" / 회사명: "+cards[i].getCompany()+" / 이름: "+cards[i].getName());
				System.out.println("직책: "+cards[i].getGrade()+" / 전화번호: "+cards[i].getTel()+" / 이메일: "+cards[i].getEmail());
				System.out.println("주소: "+cards[i].getAddr()+"\n");
				break;
			}
		}
		
		System.out.println("조회할 명함이 없습니다.");
		
		
		
	}
}
