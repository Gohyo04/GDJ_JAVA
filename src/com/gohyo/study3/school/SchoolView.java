package com.gohyo.study3.school;

public class SchoolView {
	
	 
	//값이 있다면 이렇게 할것이다를 설계
	public void view(Student[] students) {
		for(int i=0;i<students.length;i++) {
			System.out.println("번호:"+students[i].num +" 이름:"+ students[i].name +" 점수:"+ students[i].jumsu);			
		}
	}
}
