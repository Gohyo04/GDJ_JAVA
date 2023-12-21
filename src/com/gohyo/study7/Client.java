package com.gohyo.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public void send() throws Exception{
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("localhost", 8282);
		System.out.println("서버와 접속 성공");
		
		// 입력받기(메세지 보내기위한)
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		// 메세지 받기
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		while(true) {
			System.out.println("서버로 보낼 메세지를 입력하세요");
			String m = sc.next();
			
			os = socket.getOutputStream();	// 0 과 1
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			bw.write(m+"\n\r");
			bw.flush();
			
			if(m.equals("exit") && is.equals(null)) {
				break;
			}
			
			// 클라이언트에게 메세지 전송
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String s = br.readLine();
			System.out.println("서버에서 받은 메세지:"+s);
		}

		bw.close();
		ow.close();
		os.close();
		sc.close();
		
		br.close();
		ir.close();
		is.close();
		
		socket.close();
		System.out.println("클라이언트 종료");
	}
}
