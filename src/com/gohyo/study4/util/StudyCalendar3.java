package com.gohyo.study4.util;

import java.util.Calendar;
import java.util.UUID;

public class StudyCalendar3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023,11, 31);
		
		System.out.println(calendar.getTime());
		
		int d = calendar.get(Calendar.DATE);
		System.out.println(d);
		d = d+3;
		calendar.set(Calendar.DATE, d);
		System.out.println(calendar.getTime());
		
		calendar.set(2023, 11, 31);
//		calendar.roll(Calendar.DATE, 3);	// 날짜만 3일 지남
		calendar.add(Calendar.DATE, 3);		// 날짜를 포함한 넘어간 년,월 까지 바꿔준다.
		System.out.println(calendar.getTime());
		
		// Universal Unique Id (UUID)
		String str = UUID.randomUUID().toString();
		System.out.println(str);
	}
}
