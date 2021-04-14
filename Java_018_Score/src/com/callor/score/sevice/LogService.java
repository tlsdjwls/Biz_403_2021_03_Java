package com.callor.score.sevice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogService {

	public static void log(String msg) {
		
	
	FileWriter fileWriter = null;
	PrintWriter out = null;
	
	  try {
		fileWriter = new FileWriter("C:/Temp/score.log",true);
		out = new PrintWriter(fileWriter);
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-nn-dd , hh:mm:ss");
		String today = sd.format(date);
		out.printf("발생일자:%s\n");
		out.println("=".repeat(50));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	}
}
