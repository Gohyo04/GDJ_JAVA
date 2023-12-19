package com.gohyo.study6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class StudyFile {
	
	public void f4() throws Exception {
		File file = new File("C:\\study\\test2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String s = br.readLine();
			if(s == null) {
				break;
			}else if(!s.equals("")) {	// isEmpty, length
				System.out.println(s);				
			}
		}
		
		
		// 연결된 순서의 역순으로 헤제
		br.close();
		fr.close();
	}
	
	public void f3() throws Exception {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\study\\test2.txt");
		
		//FileWriter(객체(경로),true(뒤에 이어쓰기)/false(덮어쓰기));
		// 파일이없으면 생성
		FileWriter fw = new FileWriter(file, true);
		while(true) {
			String message = sc.next();	// exit 입력시 종료
			if(message.toUpperCase().equals("EXIT")) {
				break;
			}
			fw.write(message+"\r");
			// buffer 채우기(밀어내기)
			fw.flush();
		}
		// 자원 연결 헤제
		fw.close();
		sc.close();
	}
	
	public void f2() throws Exception{
		File file = new File("c:\\study");
		
		String[] ar = file.list();
		
		File[] files = file.listFiles();
		
		for(String s : ar) {
			file = new File("C:\\study\\"+s);
			System.out.println(s+" : "+file.length());
		}
	}
	
	public void f1() throws Exception{
		File file = new File("C:\\study\\Test.java");
		
		// 확장자가 있으면 file, 없으면 directory
		file = new File("C:\\study\\test","sub1");
		
		if(!file.exists()) {
			// directory 만들기 mkdir <-> mkdirs
			file.mkdirs();
		}
		
		// C:\\study\\test\\sub1
		file = new File(file, "t1.txt");
		
		file.createNewFile();
		
		// 존재여부 exist()
		System.out.println(file.exists());
		// 디렉토리(folder) 인지 아닌지
		System.out.println(file.isDirectory());
		// 파일 인지 아닌지
		System.out.println(file.isFile());
		// 파일 크기(byte)
		System.out.println(file.length());
		
		file = new File("C:\\study\\test\\sub1");
		
		// 지우기 ( 안에 다른파일이없을때 )
		file.delete();
	}
}
