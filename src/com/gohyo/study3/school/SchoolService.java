package com.gohyo.study3.school;

import java.util.Arrays;
import java.util.Scanner;

public class SchoolService {

	// addStudent
	// 이름, 번호, 점수를 입력받아서 기존 배열에 추가한 효과
	public Student[] addStudent(Student[] students) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		Student[] arr = students;
		System.out.println(Arrays.toString(arr));
		System.out.println("이름 : ");
		student.name = sc.next();
		System.out.println("번호 : ");
		student.num = sc.nextInt();
		System.out.println("점수 : ");
		student.jumsu = sc.nextDouble();
		//students[students.length+1] = student;
		
		arr[students.length+1] = student;
		return arr;
	}
	
	// findByNum
	// 학생번호를 입력받아서, 일치하는 학생이 있는지 검색
	// 해당학생을 리턴 없으면 null 리턴
	public Student findByNum(Student[] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 번호를 입력하세요 : ");
		int num = sc.nextInt();
		for(int i=0;i<students.length;i++) {
			if(students[i].num == num) {
				return students[i];
			}
		}
		return null;
	}
	
	
	//학생수를 입력받아서 수만큼정보를 입력
	public Student[]  makeStudents(){
		Scanner sc = new Scanner(System.in);
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
			student.jumsu = sc.nextDouble();
			students[i] = student;
		}
		return students;
	}
}
