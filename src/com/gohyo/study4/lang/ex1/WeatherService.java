package com.gohyo.study4.lang.ex1;

import java.util.Arrays;

public class WeatherService {
	// 날씨정보출력하는 1출력, 2추가, 3특정도시
	private String datas;
	
	public WeatherService() {
		this.datas="서울-10-비-80-부산-25-맑음-50,대구-82-눈-12,제주.25,태풍.75";
	}
	
	
	public String getDatas() {
		return datas;
	}
	public void setDatas(String datas) {
		this.datas = datas;
	}



	//init
	public WeatherInfo[] init() {
		// 문자열의 ,과 . 을 - 로 변경
		datas = datas.replace(',', '-');
		datas = datas.replace('.', '-');
		
		// 문자열을 - 로 나눠서 배열로 변경
		String[] arr = datas.split("-");
		// arr2의 index를 표현할 cnt
		int cnt = 0;
		// 객체를 담을 배열 arr2
		WeatherInfo[] arr2 = new WeatherInfo[arr.length/4];
		// 도시정보가 4개 단위로 나눠져있기때문에 4간격으로 도는 for문 
		for(int i=0;i<arr.length;i+=4) {
			WeatherInfo info = new WeatherInfo();
			info.setArea(arr[i]);
			info.setOndo(arr[i+1]);
			info.setWeather(arr[i+2]);
			info.setHumidity(arr[i+3]);
			
			// info객체가 완성되면 arr[cnt]번째에 저장
			arr2[cnt] = info;
			
			cnt++;
		}
		//WeatherInfo[] 타입의 변수를 반환
		return arr2;
	}
}
