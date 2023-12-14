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
		
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append(123);
		// StringBuffer -> String
		String str = sb.toString();
		System.out.println(str);
		
		// Wrapper 클래스
		int a = 10;
		
		//Integer it = new Integer(a); // deprecated
		Integer it = a; //auto Boxing  primitive type -> reference type
		a = it; 		// auto unBoxing reference type -> primitive type
	}
}
