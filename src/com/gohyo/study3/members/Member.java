package com.gohyo.study3.members;

public class Member {
	// 비만관리 회원프로그램
	private String name;
	private double weight;
	private double height;
	private int age;
	
	public Member() {}
	
	// 데이터입력
	public void setName(String name) {
		this.name = name;
	}
	// 데이터조회
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		if(weight >= 0.0 && weight < 300) {
			this.weight = weight;			
		}else {
			this.weight = 0.0;
		}
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
