package com.gohyo.study3.himart;

public class Phone extends Product{
	
	private int quality;
	private String model;
	
	public Phone() {
		this.setInch(5);
		this.setPrice(50);
		this.setPoint(5);
		this.setBrand("Samsung");
		this.quality = 1000;
		this.model = "Galuxy";
	}

	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
