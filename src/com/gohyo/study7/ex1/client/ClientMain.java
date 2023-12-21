package com.gohyo.study7.ex1.client;

public class ClientMain {
	public static void main(String[] args) {
		try {
			new ClientController().start();			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
