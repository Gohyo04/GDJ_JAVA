package com.gohyo.study7.ex1.client;

import com.gohyo.study7.ex1.server.ServerDAO;

public class ClientView {
	
	ServerDAO sdao = new ServerDAO();
	// 날씨 정보 출력 메서드
	public void view(ServerDAO dao) throws Exception{
		System.out.println(dao.getWeathers().getCity());
	}
}
