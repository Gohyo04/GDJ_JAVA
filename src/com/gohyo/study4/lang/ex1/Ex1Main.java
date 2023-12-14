package com.gohyo.study4.lang.ex1;

import java.util.Arrays;

public class Ex1Main {
	public static void main(String[] args) {
		WeatherService ws = new WeatherService();
		
		ws.init();
		
		System.out.println(ws.init()[0].getArea().toString()+" "+ws.init()[0].getOndo().toString()+" "+ws.init()[0].getWeather().toString()+" "+ws.init()[0].getHumidity().toString());
	}
}
