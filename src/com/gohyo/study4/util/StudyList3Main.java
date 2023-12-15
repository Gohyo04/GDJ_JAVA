package com.gohyo.study4.util;

import java.util.ArrayList;
import java.util.Iterator;

public class StudyList3Main {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		StudyList3 list = new StudyList3();
		list.add(arr);
		
		for (Integer i : arr) {
			System.out.println(i);
		}
	}
}
