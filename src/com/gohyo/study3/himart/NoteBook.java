package com.gohyo.study3.himart;

public class NoteBook extends Product{
	
	private String cpu;

	public NoteBook() {
		this.setInch(15);
		this.setPrice(100);
		this.setPoint(10);
		this.setBrand("Samsung");
		this.cpu = "i7";
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
}
