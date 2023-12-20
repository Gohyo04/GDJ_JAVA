package com.gohyo.study6.ex1;

import java.util.List;
import java.util.Scanner;

public class WeatherController {
	private WeatherDAO weatherDAO;
	private WeatherView weatherView;
	private Scanner sc;
	
	// 주입 -> Injection
	// 1. 기본 생성자에서 객체생성
	public WeatherController(){
		this.weatherDAO = new WeatherDAO();
		this.weatherView = new WeatherView();
		this.sc = new Scanner(System.in);
	}
	
	// 2. 기본생성자의 매개변수로 주입
	public WeatherController(WeatherDAO w){
		this.weatherDAO = w;
	}
	
	// 3. setter 에서 주입
	public void setWeatherDAO(WeatherDAO weatherDAO) {
		this.weatherDAO = weatherDAO;
	}

	public void start() throws Exception{
		// 한번
		List<WeatherDTO> ar = weatherDAO.getWeather();
		
		boolean check = true;
		while(check) {
			System.out.println("1. 날씨정보출력");
			System.out.println("2. 날씨정보검색");
			System.out.println("3. 날씨정보추가");
			System.out.println("4. 날씨정보삭제");
			System.out.println("5. 날씨정보저장");
			System.out.println("6. 종료");
			try {
				int select = sc.nextInt();
				if(select == 1) {
					this.weatherView.view(ar);
				}else if(select == 2){
					WeatherDTO w = weatherDAO.getDetail(ar, sc);
					weatherView.view(w);
				}else if(select == 3){
					boolean flag = weatherDAO.add(ar, sc);
					if(flag) {
						System.out.println("추가되었습니다.");
					}
				}else if(select == 4) {
					boolean flag = weatherDAO.delete(ar, sc);
					if(flag) {
						System.out.println("삭제");
					}
				}else if(select == 5) {
					boolean ch = weatherDAO.save(ar, sc);
					if(ch) {
						System.out.println("txt저장");
					}
				}else {
					System.out.println("종료");
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못입력했습니다.");
//				 위에서 잘못 입력한것을 한번 빼주는 용도
				System.out.println(sc.next());
			}
		}
	}
}
















