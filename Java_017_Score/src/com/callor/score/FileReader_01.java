package com.callor.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {
 
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/service/smplscore.ad";
		
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
			/*
			 * read() method 를 실행하면 어떤 값을 읽어서 int 형의 데이터를 return
			 * 하도록 만들어져 있다
			 * 
			 * 현재 열린 파일에서 1byte를 읽어서 ASCII 코드
			 * 로 return 하는 method
			 */
			for( ; ;) {
			// read method는 
				// fileReader 로 열린 파일에서 
				// 한 byte 씩 데이터를 읽어서 ASCII 코드 값으로 return 한다
			int result = fileReader.read();
			// 정수값이 해당하는 ASCII 코드 를 갖는 문자로 바꾸어서 보여달라
			System.out.printf("%c",result);
			}
	
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
