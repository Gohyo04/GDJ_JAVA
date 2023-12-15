package com.gohyo.study4.util.ex1;

import java.util.ArrayList;
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
	
	//init
	//info 파싱
	public ArrayList<Student> init() {
		StringTokenizer st = new StringTokenizer(this.info,"-");
		ArrayList<Student> students = new ArrayList<Student>();
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
			if(s.contains(s.get(i).getName())) {
				return s.get(i);
			}
		}
		return null;
	}
	
	
	// 학생정보추가 studentAdd
	
	// 학생정보삭제 studentDelete -> 이름으로 검색 후 삭제
}
