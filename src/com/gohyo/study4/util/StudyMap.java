package com.gohyo.study4.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudyMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("k1", 1);
		map.put("k2", 2);
		System.out.println(map);
		
		Integer n = map.get("k2");
		
		System.out.println(n);
		
		Set<String> k = map.keySet();
		
		Iterator<String> keys = k.iterator();
		
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println("Key : "+key);
			System.out.println(map.get(key));
		}
	}
}
