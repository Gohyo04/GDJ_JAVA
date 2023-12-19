package com.gohyo.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class WeatherDAO {
	// DAO : Data Access Object ( 데이터 접근 클래스 )
	
	// getWeathers
	// file 에서 내용을 읽어오는 역할
	public ArrayList<WeatherDTO> getWeather() throws Exception{
		File file = new File("C:\\study\\weather.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<WeatherDTO> wlist = new ArrayList<>();
		
		while(true) {
			// 1. 파일의 내용을 한줄씩 읽어오기
			String str = br.readLine();
			if(str == null) {
				break;
			}else if(!str.contains("##")){
				// 2. 한줄의 내용을 파싱
				String[] strArr = str.split("-");
				System.out.println(Arrays.toString(strArr));
				// 3. 파싱한 토큰을 DTO에 생성하고 멤버변수에 대입
				int cnt = 0;
				WeatherDTO wdto = new WeatherDTO();
				wdto.setCity(strArr[cnt]);
				wdto.setOndo(strArr[cnt+1]);
				wdto.setwInfo(strArr[cnt+2]);
				wdto.setWater(strArr[cnt+3]);
				// 4. DTO를 List에 추가
				wlist.add(wdto);
			}
		}
		// 5. List에 return
		return wlist;
	}
}
