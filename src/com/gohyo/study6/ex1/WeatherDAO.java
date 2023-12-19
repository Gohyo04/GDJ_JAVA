package com.gohyo.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WeatherDAO {
	// DAO : Data Access Object ( 데이터 접근 클래스 )
	
	// getWeathers
	// file 에서 내용을 읽어오는 역할
	public ArrayList<WeatherDTO> getWeather() throws Exception{
		File file = new File("C:\\study\\weather.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<WeatherDTO> wlist = new ArrayList<>();
		
		br.readLine();
		while(true) {
			// 1. 파일의 내용을 한줄씩 읽어오기
			String str = br.readLine();
			// 2. 한줄의 내용을 파싱
			if(str == null) {
				break;
			}
			StringTokenizer st = new StringTokenizer(str,"-");
			// 3. 파싱한 토큰을 DTO에 생성하고 멤버변수에 대입
			WeatherDTO wdto = new WeatherDTO();
			wdto.setCity(st.nextToken());
			wdto.setOndo(Integer.parseInt(st.nextToken()));
			wdto.setwInfo(st.nextToken());
			wdto.setHum(Integer.parseInt(st.nextToken()));
			
			// 4. DTO를 List에 추가
			wlist.add(wdto);
			
		}
		br.close();
		fr.close();
		
		// 5. List에 return
		return wlist;
	}
}
