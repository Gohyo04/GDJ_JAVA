package com.gohyo.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;		

public class Server {

	public void s() throws Exception{
		System.out.println("클라이언트가 접속하기를 기다리는 중");
		ServerSocket ss = new ServerSocket(8282);
		Socket sc = ss.accept();
		System.out.println("Client 연결 성공");
		
		while(true) {
			InputStream is = sc.getInputStream();	// 0 과 1
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			String s = br.readLine();
			System.out.println("클라이언트에서 받은 메세지 : "+s);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("클라이언트로 보낼 메세지 : ");
			String n = scan.next();
			OutputStream os = sc.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ow);
			
			bw.write(n+"\n\r");
			bw.flush();
			if(n.equals("exit") || s.equals("exit")) {
				br.close();
				ir.close();
				is.close();
				sc.close();
				
				bw.close();
				ow.close();
				os.close();
				scan.close();
				break;
			}	
		}
		System.out.println("서버 프로그램 종료");
	}
}
