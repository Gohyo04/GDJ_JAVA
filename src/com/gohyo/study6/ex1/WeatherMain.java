package com.gohyo.study6.ex1;

public class WeatherMain {
	public static void main(String[] args) throws Exception{
		WeatherDAO wdao = new WeatherDAO();
		wdao.getWeather();
	}
}
