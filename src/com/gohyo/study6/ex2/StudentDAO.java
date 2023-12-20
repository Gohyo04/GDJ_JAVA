package com.gohyo.study6.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	// 추가
	public ArrayList<StudentDTO> getStudent() throws Exception{
		// 파일 가져온다
		File file = new File("C:\\study\\student.txt");
		// 파일을 읽는다
		FileReader fr = new FileReader(file);
		// 파일 내용을 한줄씩 가져온다 
		BufferedReader br = new BufferedReader(fr);
		// 첫줄 설명 빼기
		br.readLine();
		ArrayList<StudentDTO> sdtos = new ArrayList<>();
		
		//1. 파일의 내용을 한줄씩 읽어오기
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			//2. 한줄의 내용을 파싱 ( str -> br.readLne()을  - 을 기준으로 문자열 쪼개기 )
			StringTokenizer st = new StringTokenizer(str,"-");
			//3. 파싱한 토큰을 DTO에 생성하고 멤버변수에 대입
			StudentDTO sdto = new StudentDTO();
			sdto.setName(st.nextToken());
			sdto.setNum(Integer.parseInt(st.nextToken()));
			sdto.setKor(Integer.parseInt(st.nextToken()));
			sdto.setEng(Integer.parseInt(st.nextToken()));
			sdto.setMath(Integer.parseInt(st.nextToken()));
			sdto.setSum(Integer.parseInt(st.nextToken()));
			sdto.setAvg(Double.parseDouble(st.nextToken()));
			//4. DTO를 List에 추가
			//set 한 sdto 객체를 배열에 대입
			sdtos.add(sdto);
		}
		// 안쪽부터 닫아준다.
		br.close();
		fr.close();
		//5. List에 return
		return sdtos;
	}
	
	// 검색
	public StudentDTO search(ArrayList<StudentDTO> ar, Scanner sc) {
		StudentDTO dto = new StudentDTO();
		String str = sc.next();
		for(StudentDTO studentDTO : ar) {
			if(studentDTO.getName().equals(str)) {
				return studentDTO;
			}
		}
		return null;
	}
}
