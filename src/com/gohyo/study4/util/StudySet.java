package com.gohyo.study4.util;

import java.util.HashSet;
import java.util.Iterator;

public class StudySet {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		
		hs.add("test");
		hs.add("second");
		hs.add("third");
		hs.add("test");	// 중복데이터는 넣지않는다
		
		System.out.println(hs.size());
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			String v = it.next();
			System.out.println(v);
		}
		
		System.out.println(hs.iterator());
	}
}
