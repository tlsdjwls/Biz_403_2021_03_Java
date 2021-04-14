package com.callor.score;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter_02 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/test1.txt";
		/*
		 *  printWriter 클래스만으로 도 파일에 데이터를 기록할수 있다
		 *  그럼에도 불구하고 FileWriter 를 사용하는 이유는 FileWriter 생성자의 두번째
		 *  파라메터 때문이다 newFileWriter(파일이름,bAppend)
		 *  
		 *  FileWriter 객체의 두번째 파라메터를 true 로 설정하면 파일을 Append Mode 로 open 한다
		 *  
		 *  두번째 파라메터가 없거나 false 로 설정하면 (값을 설정하지 않으면 기본값으로 false이다)
		 *  1. 기록하고자 하는 파일이 없으면 만들기
		 *  2. 기록하고자 하는 파일이 있으면 기존 파일을 삭제하고 다시 만들기
		 *  3. 항상 새로운 내용만 기록
		 *  
		 *  두번째 파라메터가 true 이면
		 *  1. 기록하고자 하는 파일이 없으면 만들기 
		 *  2. 기록하고자 하는 파일이 있으면
		 *  Append Mode 로 열기
		 *  3. 새로운 내용을 print() 하면 기존내용의 끝에 계속 
		 *  이어서 기록
		 */
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			for(int i = 0 ; i < 10 ; i++) {
				out.printf("%05d\n",i+1);
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
