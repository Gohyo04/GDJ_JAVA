package com.gohyo.study4.util.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {

	private String info;
	
	public StudentService() {
		// 이름-번호-국어-영어-수학 // 총점-평균
		this.info = "winter-1-50-60-80";
		this.info = this.info+"-iu-2-85-94-74";
		this.info = this.info+"-karina-3-78-78-98";
	}
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> students = new ArrayList<Student>();
	
	//init
	//info 파싱
	public ArrayList<Student> init() {
		StringTokenizer st = new StringTokenizer(this.info,"-");
		while(st.hasMoreTokens()) {
			Student student = new Student();
			student.setName(st.nextToken());
			student.setNumber(Integer.parseInt(st.nextToken()));
			int kr = Integer.parseInt(st.nextToken());
			student.setKorean(kr);
			int en = Integer.parseInt(st.nextToken());
			student.setEnglish(en);
			int ma = Integer.parseInt(st.nextToken());
			student.setMath(ma);
			int sum = kr + en + ma;
			student.setSum(sum);
			double aver = sum / 3.0;
			student.setAverage(aver);
			students.add(student);
		}
		return students;
	}
	
	// 학생정보검색 findByName	-> 이름으로 검색
	public Student findByName(ArrayList<Student> s) {
		System.out.println("찾을사람: ");
		String name = sc.next();
		for(int i=0;i<s.size();i++) {
			if(name.contains(s.get(i).getName())) {
				return s.get(i);
			}
		}
		return null;
	}
	
	
	// 학생정보추가 studentAdd
	public ArrayList<Student> studentAdd() {
		Student student = new Student();
		System.out.println("번호 : ");
		student.setNumber(sc.nextInt());
		System.out.println("이름 : ");
		student.setName(sc.next());
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		student.setKorean(kor);
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		student.setEnglish(eng);
		System.out.println("수학 : ");
		int math = sc.nextInt();
		student.setMath(math);
		student.setSum(math + eng + kor);
		student.setAverage(student.getSum()/3.0);
		students.add(student);
		return students;
	}
	
	// 학생정보삭제 studentDelete -> 이름으로 검색 후 삭제
	public void studentDelete() {
		System.out.println("삭제할 학생 : ");
		String del = sc.next();
		int c = 0;
		for(int i=0;i<students.size();i++) {
			if(del.contains(students.get(i).getName())) {
				students.remove(i);
				c = 1;
			}
			if(c != 1 && students.size() == i+1) {
				System.out.println("없는학생입니다.");
			}
		}
	}
}
