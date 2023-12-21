package com.gohyo.study7.ex1.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerController {
	
	public void start() throws Exception{
		
		// 1. client와 연결준비
		ServerSocket ss = new ServerSocket();
		Socket socket = ss.accept(); 
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		// 클라이언트에 받은 값
		String str = br.readLine();
		
	}
}
