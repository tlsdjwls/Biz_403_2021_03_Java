package com.callor.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_02 {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat dateForm
		= new SimpleDateFormat();
		SimpleDateFormat timeForm 
		= new SimpleDateFormat();
		
		String curDate = dateForm.format(date);
		String curTime = timeForm.format(date);
		System.out.printf("오늘 날짜 : %s, 현재시각 : %s",curDate,curTime);
		
	}
}
