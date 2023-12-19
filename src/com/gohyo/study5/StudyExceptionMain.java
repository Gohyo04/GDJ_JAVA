package com.gohyo.study5;

import java.util.InputMismatchException;

public class StudyExceptionMain {
	public static void main(String[] args) {
		StudyException se = new StudyException();
		
		try {
			se.t2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
