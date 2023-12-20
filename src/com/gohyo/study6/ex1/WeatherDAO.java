package com.gohyo.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
	
	// 검색
	public WeatherDTO getDetail(List<WeatherDTO> list, Scanner sc) {
		System.out.println("도시명 ");
		WeatherDTO weatherDTO = new WeatherDTO();
		weatherDTO.setCity(sc.next());
		
		for(WeatherDTO w : list) {
			if(w.getCity().equals(weatherDTO.getCity())) {
				return w;
			}
		}
		return null;
	}
	
	// 추가
	public boolean add(List<WeatherDTO> list, Scanner sc) {
		WeatherDTO dto = new WeatherDTO();
		System.out.println("도시명 : ");
		dto.setCity(sc.next());
		System.out.println("기온 : ");
		dto.setOndo(sc.nextInt());
		System.out.println("날씨정보 : ");
		dto.setwInfo(sc.next());
		System.out.println("습도 : ");
		dto.setHum(sc.nextInt());
		return list.add(dto);
	}
	
	// 삭제
	public boolean delete(List<WeatherDTO> list, Scanner sc) {
		boolean result = false;
		System.out.println("도시명 입력");
		String city = sc.next();
		
		for(WeatherDTO dto : list) {
			if(dto.getCity().equals(city)) {
				result = list.remove(dto);
				break;
			}
		}
		return result;
	}
	
	// 저장
	public boolean save(List<WeatherDTO> ar, Scanner sc) throws Exception{
		// 1. 입력받아서 파일에 작성 (파일명 save.txt)
		// 읽어올파일 객체
		File file = new File("C:\\study\\save.txt");
		// 파일을 만들고 내용을 적을 객체
		FileWriter fw = new FileWriter(file, false);
		// 2. ## 날씨정보
		// 첫줄
		fw.write("## 날씨정보\n");
		// 3. 도시명-기온-날씨정보-습도
		for(WeatherDTO w : ar) {
			fw.write(w.getCity()+"-"+w.getOndo()+"-"+w.getwInfo()+"-"+w.getHum()+"\n");
		}
		fw.flush();
		
		return file.exists();
	}
}


















