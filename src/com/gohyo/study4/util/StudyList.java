package com.gohyo.study4.util;

import java.util.ArrayList;

public class StudyList {
	public static void main(String[] args) {
		// 배열과 비슷
		// 선언시 따로 갯수를 선언하지 않음
		ArrayList arr = new ArrayList();
		// 추가 add (list의 마지막index에 추가)
		arr.add("first"); // 다형성
		arr.add("second");
		arr.add(3);  // int -> Integer (auto-boxing)
		arr.add('a');  // char -> Character (auto-boxing)
		System.out.println(arr.size());
		arr.add(1,4);  // index 1번에 4를 넣는다 (기존 1번부터 뒤로밀림)
		arr.set(0, '1');	// 수정 0번을 '1'로 변경
		
		// 삭제
		// index로 지우기
		arr.remove(1);
		// 특정값 1개만 지우기
		arr.remove("second");
		// 배열안의 모든 요소 지우기
		arr.clear();
		System.out.println(arr.size());
		for(int i=0;i<arr.size();i++) {
			// get
			System.out.println(arr.get(i));
		}
	}
}
