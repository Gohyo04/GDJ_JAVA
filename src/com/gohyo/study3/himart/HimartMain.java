package com.gohyo.study3.himart;

public class HimartMain {

	public static void main(String[] args) {
		NoteBook notebook = new NoteBook();
		Phone phone = new Phone();
		Tv tv = new Tv();
		
		Customer customer = new Customer();
		customer.buy(tv);
		
		Product[] products = new Product[3];
		products[0] = tv;
	}
}
