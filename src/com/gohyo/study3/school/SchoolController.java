package com.gohyo.study3.school;

import java.util.Scanner;

public class SchoolController {
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		// 학생수를 입력받는 메서드가있는 service 객체생성
		SchoolService schoolService = new SchoolService();
		// 생성된 student객체를 담아줄 배열선언(초기화)
		Student[] students = null;
		
		// 학생정보를 출력하는 메서드가있는 view 
		SchoolView schoolView = new SchoolView();
		
		while(check) {
			System.out.println("1. 학생정보입력 : ");
			System.out.println("2. 학생정보출력 : ");
			System.out.println("3. 학생정보검색 : ");
			System.out.println("4. 학생정보추가 : ");
			System.out.println("5. 학생정보종료 : ");
			
			
			
			int select = sc.nextInt();
			switch(select) {
			case 1:
				// makeStudents로 객체를 생성하고 Student 타입의 배열에 객체를 담는다.
				students = schoolService.makeStudents();
				break;
			case 2:
				schoolView.view(students);
				break;
			case 3:
				Student s = schoolService.findByNum(students);
				if(s != null) {
					schoolView.view(s);
				}else {
					schoolView.view("없는 학생입니다.");
				}
				break;
			case 4:
				students = schoolService.addStudent(students);
				break;
			default:
				System.out.println("프로그램종료");
				check = false;
				break;
			}
		}
	}
}
