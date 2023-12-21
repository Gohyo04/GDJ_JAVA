package com.gohyo.study7.ex1.server;

public class ServerMain {
	public static void main(String[] args) {
		try {
			new ServerController().start();			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
