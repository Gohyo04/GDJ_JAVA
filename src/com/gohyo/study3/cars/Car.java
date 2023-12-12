package com.gohyo.study3.cars;

public class Car {
	
	String company;
	String name;
	String color;
	int price;
	Engine engine;
	
	public Car() {
		this(new Engine());
	}
	
	public Car(Engine engine) {
		this.company = "Kia";
		this.name = "K5";
		this.color = "Green";
		this.price = 3000;
		this.engine = engine;
	}
	
//	{
//		//초기화 블럭 (Instance block)
//		this.company="Benz";
//	}
//	
//	// 기본생성자, 디폴트생성자, 빈생성자
//	public Car() {
//		//생성자 내에서 다른 생성자를 호출할 경우
//		this("Black");
//	}
//	
//	public Car(String color) {
//		this("K5",color);
//	}
//	
//	public Car(String name, String color) {
//		this.company = "Kia";
//		this.name = name;
//		this.fuel = "Gas";
//		this.color = color;
//		this.price = 3000;
//		this.cc = 2000;
//	}
//	
//	public void info() {
//		System.out.println("Company: "+this.company);
//		System.out.println("Name: "+this.name);
//		System.out.println("Fuel: "+this.fuel);
//		System.out.println("Color: "+this.color);
//		System.out.println("Price: "+this.price);
//		System.out.println("CC: "+this.cc);
//		System.out.println();
//	}
}
