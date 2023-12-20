package com.gohyo.study6.ex2;

import java.util.List;

public class StudentView {
	
	public void view(List<StudentDTO> list) {
		for(StudentDTO dto : list) {
			System.out.println(dto.getNum()+". "+dto.getName());
			System.out.println("국어:"+dto.getKor()+" 영어:"+dto.getEng()+" 수학:"+dto.getMath());
			System.out.println("합계:"+dto.getSum()+" 평균:"+dto.getAvg());
			System.out.println("==============================");
		}
	}
}
