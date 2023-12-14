package com.gohyo.study4.lang;

import java.util.Scanner;

public class StringStudy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String
		String str = new String();
// 				||
		String str2 = "";
		
		String name = "Winter";
		String name2 = "Winter";
		
		System.out.println(name == name2);
		String name0 = sc.next();
		System.out.println(name0.equals(name));
		
		for(int i=0;i<name.length();i++) {			
			System.out.println(name.charAt(i));
		}
		
		String n = "abc";
		String n2 = "123";
		n = n+n2;
	}
}
