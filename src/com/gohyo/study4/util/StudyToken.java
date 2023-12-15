package com.gohyo.study4.util;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.gohyo.study4.lang.ex1.WeatherService;

public class StudyToken {
	public static void main(String[] args) {
		String str = "서울-10-비-80-부산-25-맑음-50-대구-82-눈-12-제주-25-태풍-75";
		
		StringTokenizer token = new StringTokenizer(str,"-");
		int cnt = token.countTokens();
		System.out.println(cnt);
		
		WeatherService data = new WeatherService();
		ArrayList<WeatherService> ar= new ArrayList<>();
		
		while(token.hasMoreTokens()) {
			String value = token.nextToken();
			System.out.println(value);
		}
	}
}
