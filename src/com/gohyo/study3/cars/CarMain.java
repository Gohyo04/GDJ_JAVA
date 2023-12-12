package com.gohyo.study3.cars;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Car car = new Car();
		// engine도 같이 죽는다(engine과 car의 lifecycle이 같다)
		car = null;
		
		
		Engine engine = new Engine();
		Car car2 = new Car(engine);
		// engine은 살아있다.(engine과 car의 lifecycle이 다르다)
		car = null;
		
//		car.info();
//		
//		Car car2 = new Car();
//		car2.color = "White";
//		car2.info();
//		
//		Car car3 = new Car("Red");
//		car3.info();
//		
//		Car car4 = new Car("K7", "Blue");
//		car4.info();
	}
}
