package com.gohyo.study6.ex1;

import java.util.ArrayList;

public class WeatherMain {
	public static void main(String[] args){
		try {
//			new WeatherController().start();
			new WeatherDAO().getWeathers();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
