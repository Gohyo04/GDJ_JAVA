package com.gohyo.study4;

public class ApiMain {
	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		Test t = new Test();
		
		Object obj = new Object();
		
		boolean equals = obj.equals(obj);
		System.out.println(equals);
		
		String toString = obj.toString();
		System.out.println(toString);
	}
}
