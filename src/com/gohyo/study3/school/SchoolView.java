package com.gohyo.study3.school;

public class SchoolView {
	
	public void view(String message) {
		System.out.println(message);
	}
	
	// 학생 1명출력
	public void view(Student student) {
		System.out.println("번호:"+student.num +" 이름:"+ student.name +" 점수:"+ student.jumsu);
	}
	
	//값이 있다면 이렇게 할것이다를 설계
	public void view(Student[] students) {
		for(int i=0;i<students.length;i++) {
			this.view(students[i]);
//			System.out.println("번호:"+students[i].num +" 이름:"+ students[i].name +" 점수:"+ students[i].jumsu);			
		}
	}
}
