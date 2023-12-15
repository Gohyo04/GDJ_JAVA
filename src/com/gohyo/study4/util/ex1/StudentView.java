package com.gohyo.study4.util.ex1;

import java.util.ArrayList;

public class StudentView {
	
	// 메시지를 출력
	public void view(String message) {
		 
	}
	
	// 학생 한명의 모든 정보를 출력
	public void view(Student s) {
		if(s == null) {
			System.out.println("값이 없습니다.");
		}else {
			System.out.println(s.getNumber()+"."+s.getName());
			System.out.println("국어: "+s.getKorean()+" 영어: "+s.getEnglish()+" 수학: "+s.getMath());
			System.out.println("총점: "+s.getSum()+" 평균: "+s.getAverage());	
		}
	}
	
	// 학생들의 모든 정보를 출력
	public void view(ArrayList<Student> arr) {
		// 향상된 for문
		// for(모든데이터타입명 변수명:collection변수명){}
		for(Student s : arr) {
			System.out.println(s.getNumber()+"."+s.getName());
			System.out.println("국어: "+s.getKorean()+" 영어: "+s.getEnglish()+" 수학: "+s.getMath());
			System.out.println("총점: "+s.getSum()+" 평균: "+s.getAverage());
			System.out.println("=======================");
		}
		
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i).getName());
//		}
	}
}
