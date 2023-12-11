package com.gohyo.study3.school;

import java.util.Scanner;

public class SchoolService {

	Scanner sc = new Scanner(System.in);
	//학생수를 입력받아서 수만큼정보를 입력
	public Student[]  makeStudents(){
		System.out.println("학생 수를 입력하세요 : ");
		int cnt = sc.nextInt();
		
		// 학생들을 담을 배열생성
		Student[] students = new Student[cnt];
		
		for(int i=0;i<cnt;i++) {
			// 반복문이 돌때마다 학생 객체 생성
			Student student = new Student();
			System.out.println("학생"+(i+1)+" 이름 : ");
			student.name = sc.next();
			System.out.println("학생"+(i+1)+" 번호 : ");
			student.num = sc.nextInt();
			System.out.println("학생"+(i+1)+" 점수 : ");
			student.jumsu = sc.nextInt();
			students[i] = student;
		}
		return students;
	}
}
