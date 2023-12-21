package com.gohyo.study7.ex1.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.gohyo.study7.ex1.server.ServerDAO;
import com.gohyo.study7.ex1.server.ServerDTO;


public class ClientController {

	public void start() throws Exception{
		Scanner sc = new Scanner(System.in);
		// 1. 서버와 소캣연결
		Socket socket = new Socket("localhost",8282);
		System.out.println("서버와 연결됨");
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		File file = new File("C:\\study\\weather.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		br.readLine();
		ServerDTO sdto = new ServerDTO();
		System.out.println("서버로 보낼 값");
		while(br.readLine() != null) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s,"-");
			sdto.setCity(st.nextToken());
			sdto.setGion(Integer.parseInt(st.nextToken()));
			sdto.setWeather(st.nextToken());
			sdto.setHum(Integer.parseInt(st.nextToken()));
			bw.write(s);
			bw.flush();			
		}
		
		ClientView cv = new ClientView();
		ServerDAO dao = new ServerDAO();
		
		System.out.println("메뉴 선택");
		int n = sc.nextInt();
		boolean check = true;
		while(check)
		switch(n) {
			case 1:
			// 1-1 날씨정보출력
			cv.view(dao);
			break;
			case 2:
			// 1-2 날씨정보 검색
			
			break;
			case 3:
			// 1-3 프로그램종료
				check = false;
			break;
		}
		
	}


}
