package com.gohyo.study6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StudyIo {
	
	public void input() {
		// 키보드입력
		
		// byte 처리
		InputStream is = System.in;
		
		// byte -> 문자
		InputStreamReader ir = new InputStreamReader(is);
		
		// 문자 -> 문자열
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String str = br.readLine();
			System.out.println(str);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
