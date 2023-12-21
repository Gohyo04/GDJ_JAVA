package com.gohyo.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherDAO {
	private static int count;
	
	static {
		WeatherDAO.count = 0;
	}
	// DAO : Data Access Object ( 데이터 접근 클래스 )
	
	// getWeathers
	// file 에서 내용을 읽어오는 역할
	public ArrayList<WeatherDTO> getWeathers() throws Exception {
		
		
		ArrayList<WeatherDTO> ar = new ArrayList<>();
		File file = new File("c:\\study\\weather");
		String [] names = file.list();
		//long [] name=new long [names.length];
		//for, while
		long max=0;
		
		String[] a = {"3.txt","1.txt","5.txt"};
		
		Arrays.sort(a);
		for(String n:a) {
			System.out.println(n);
		}
		
		for(int i=0;i<names.length;i++) {
			//split, StringTo, subString, indexOf, lastIndexOf
//			String [] r = names[i].split(".");
//			name[i]=r[0];
//			StringTokenizer st = new StringTokenizer(names[i], ".");
//			name[i]=st.nextToken();
			long n= Long.parseLong(names[i].substring(0, names[i].lastIndexOf(".")));
			max=Math.max(max, n);
		}
		

		
//	
//		
//		file = new File(file, max+".txt");
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//		br.readLine();
//		while(true) {
//			String s = br.readLine();
//			if(s ==null) {
//				break;
//			}
//			
//			//파싱 - split, StringTokenizer
//			
//			System.out.println(s);
//			StringTokenizer st = new StringTokenizer(s, "-");
//			//서울-12-맑음-60
//			WeatherDTO weatherDTO = new WeatherDTO();
//			
//			weatherDTO.setCity(st.nextToken());
//			weatherDTO.setGion(Integer.parseInt(st.nextToken()));
//			weatherDTO.setInfo(st.nextToken());
//			weatherDTO.setHum(Integer.parseInt(st.nextToken()));
//			
//			ar.add(weatherDTO);
//			
//		}
//		
//		br.close();
//		fr.close();
//		
		
		return ar;
		
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
		// 20231220 + count
		WeatherDAO.count++;
		Calendar calendar = Calendar.getInstance();
//		String day = String.valueOf(calendar.get(calendar.YEAR))+calendar.get(calendar.MONTH)+calendar.get(calendar.DATE);
//		// 1. 입력받아서 파일에 작성 (파일명 save.txt)
//		// 읽어올파일 객체
		String fileName = calendar.getTimeInMillis()+""+WeatherDAO.count+".txt";
		String route = "C:\\study\\weather";
		String fullRoute = route+"\\"+fileName;
		// 위로 설정한 경로에 파일 생성
		File file = new File(fullRoute);
		File fileList = new File(route);
		
		String[] fileArr = fileList.list();
		ArrayList<Integer> numArr = new ArrayList<>();
		for(String s : fileArr) {
//			int n = Integer.parseInt(s.substring(0, s.length()-4));
//			numArr.add(n);
		}
//		Collections.sort(numArr);
//		for(int i=0;i<numArr.size()-1;i++) {
//			System.out.println(numArr.get(i));
//			String str = route+"\\"+numArr.get(i)+"txt";
//			File deleteFile = new File(str);
//			deleteFile.delete();
//		}
		
		
//		System.out.println(a);
//		for(String s : arr) {
//			System.out.println(s.substring(s.length()-4, s.length()));
//			
//		}
		
		FileWriter fw = new FileWriter(file,false);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		// 파일을 만들고 내용을 적을 객체
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


















