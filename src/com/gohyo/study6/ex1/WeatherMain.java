package com.gohyo.study6.ex1;

import java.util.ArrayList;

public class WeatherMain {
	public static void main(String[] args) throws Exception{
		WeatherDAO wdao = new WeatherDAO();
		
		ArrayList<WeatherDTO> arr = wdao.getWeather();
		for(WeatherDTO w : arr) {
			System.out.println(w.getCity());
			System.out.println(w.getOndo());
			System.out.println(w.getwInfo());
			System.out.println(w.getHum());
			System.out.println("============");
		}
	}
}
