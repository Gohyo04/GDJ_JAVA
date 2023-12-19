package com.gohyo.study4.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StudySimpleFormat {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		
		// 2023년 12월 30일 요일
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String str = sd.format(calendar.getTime());
		System.out.println(str);
		
		// 문자열 -> 날짜
		String d = "2020-12-24";
		// 변경 or 새로등록
		sd.applyPattern("yyyy-MM-dd");
		Date date = null;
		try {
			// 문자열의 형식이 sd.applyPattern or simpleDateFormat에 등록한 포맷(패턴)과 일치해야 한다.
			date = sd.parse(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);
	}
}
