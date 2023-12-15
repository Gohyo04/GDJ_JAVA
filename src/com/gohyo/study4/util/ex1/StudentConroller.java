package com.gohyo.study4.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentConroller {
	private Scanner sc;
	private StudentService studentService;
	private StudentView studentView;
	
	public StudentConroller() {
		this.sc = new Scanner(System.in);
		this.studentService = new StudentService();
		this.studentView = new StudentView(); 
	}
	
	public void start() {
		boolean check = true;
		// 학생정보 초기화
		ArrayList<Student> ar =  this.studentService.init();
		
		while(check) {
			System.out.println("1. 학생정보출력");
			System.out.println("2. 학생정보검색");	// 이름으로 검색
			System.out.println("3. 학생정보추가");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 프로그램종료");
			int select = this.sc.nextInt();
			if(select == 1) {
				studentView.view(ar);
			}else if(select == 2) {
				studentView.view(studentService.findByName(ar));
			}else if(select == 3) {
				
			}else if(select == 4) {
				
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
