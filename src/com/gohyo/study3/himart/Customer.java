package com.gohyo.study3.himart;

public class Customer extends Product{
	
	private int money;
	private int point;
	
	public Customer() {
		this.money = 2000;
		this.point = 10;
	}
	
	public void buy(Product product) {
		// 물건 값 계산
		this.money = this.money - product.getPrice();
		this.point = this.point + product.getPoint();
		// 최종 가진돈과 포인트 출력
		System.out.println("잔액: "+this.money+"만원 / point:"+this.point);
		
		// type 확인 (a instanceof b = b가 a의 부모인가 true/false)
		System.out.println(product instanceof Tv);
	}
}
