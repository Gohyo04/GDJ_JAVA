package com.gohyo.study4.lang;

public class StringStudy2 {
	public static void main(String[] args) {
		String name = "wtintetrtestt";
		
		boolean s = true;
		int cnt = 0;
		int n = -1;
		while(s) {
			n = name.indexOf('t',n+1);
			if(n != -1) {
			System.out.println(n);
			}else {				
				break;
			}
			cnt++;
		}
		System.out.println();
		System.out.println(cnt);
	}
}
