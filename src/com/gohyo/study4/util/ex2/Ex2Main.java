package com.gohyo.study4.util.ex2;

import java.util.Arrays;
import java.util.Random;

public class Ex2Main {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(10);	// 0 ~ 10 미만
		System.out.println(num);
		
		StudySetInfo ssi = new StudySetInfo();
		System.out.println(Arrays.toString(ssi.ex0()));
		System.out.println(ssi.ex1());
		System.out.println(ssi.ex2());
	}
}
