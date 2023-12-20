package com.gohyo.study6.ex2;

import java.util.List;
import java.util.Scanner;

public class StudentController {
	private StudentView studentView;
	private StudentDAO studentDAO;
	private Scanner sc;
	
	public StudentController(StudentDAO dao, StudentView view, Scanner sc) throws Exception{
		this.studentDAO = dao;
		this.studentView = view;
		this.sc = sc;
	}
		List<StudentDTO> dtos = studentDAO.getStudent();
		
	public void start() {
		boolean check = true;
		while(check) {
			System.out.println("1. 학생정보출력");
			System.out.println("2. 학생정보검색");	// 이름
			System.out.println("3. 학생정보추가");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 학생정보저장");
			System.out.println("6. 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				studentView.view(dtos);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				check = false;
				break;
			}
		}
	}
}
