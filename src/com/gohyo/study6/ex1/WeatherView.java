package com.gohyo.study6.ex1;

import java.util.List;

public class WeatherView {
	
	public void view(List<WeatherDTO> ar) {
		System.out.println("도시명\t기온\t날씨\t습도");
		System.out.println("==============================");
		
		for(WeatherDTO w : ar) {
			System.out.print(w.getCity()+"\t");
			System.out.print(w.getOndo()+"\t");
			System.out.print(w.getwInfo()+"\t");
			System.out.println(w.getHum()+"%");
			System.out.println("==============================");
		}
	}
	// 하나만 출력
	public void view(WeatherDTO w) {
		if(w == null) {
			System.out.println("찾지 못했다");
			return;
		}
		System.out.println("도시명\t기온\t날씨\t습도");
		System.out.print(w.getCity()+"\t");
		System.out.print(w.getOndo()+"\t");
		System.out.print(w.getwInfo()+"\t");
		System.out.println(w.getHum()+"%");
		System.out.println("==============================");
	}
}
