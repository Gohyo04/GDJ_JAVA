package com.gohyo.study6.ex2;

import java.util.ArrayList;

public class StudentMain {
	public static void main(String[] args) throws Exception{
		StudentDAO dao = new StudentDAO();
		
		dao.getStudent();
		ArrayList<StudentDTO> list = dao.getStudent();
		for(StudentDTO dto : list) {
			System.out.println(dto.getNum()+". "+dto.getName());
			System.out.println("국어:"+dto.getKor()+" 영어:"+dto.getEng()+" 수학:"+dto.getMath());
			System.out.println("합계:"+dto.getSum()+" 평균:"+dto.getAvg());
			System.out.println("==============================");
		}
	}
}
