package com.gohyo.study4.util;

import java.util.ArrayList;

public class StudyList2 {
	public static void main(String[] args) {
		// E 변수
		// E = object
		ArrayList<Object> ar = new ArrayList<Object>();
		ArrayList<Object> ar2 = new ArrayList<>();
		ArrayList<String> ar3 = new ArrayList<>();
		ArrayList<Integer> ar4 = new ArrayList<>();
		
		ar3.add("a");
		String str = ar3.get(0);
		
		ar4.add(33);
		
		ar.add(1);
		ar.add("second");
		ar.add(false);
		ar.add(4.23);
		
		//----------------------------
		// 타입의 안정성
		int n = (Integer)ar.get(0);
		String str2 = (String)ar.get(1);
		boolean c = (Boolean)ar.get(2);
	}
}
