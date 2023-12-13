package com.gohyo.study3.himart;

public class Tv extends Product{
	
	private String color;

	public Tv() {
		this.setInch(100);
		this.setPrice(1000);
		this.setPoint(25);
		this.setBrand("Samsung");
		this.color = "Black";
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
