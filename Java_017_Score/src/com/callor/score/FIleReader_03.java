package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleReader_03 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/service/smplscore.ad";
		
		// 파일을 읽기 위해서 open 하는 클래스 
		// OS 에게 파일을 읽을수 있도록 허락해달라 요청하기
		
		FileReader fileReader = null;
		
		//FileReader가 open 해 놓은 파일에서 
		// 데이터를 읽어서 buffer 라고 하는 
		// 임시 기억장소에 저장해 놓는다
		
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			// 파일에 저장된 데이터의 라인수를 알때는 for() 를 이용하여
			// 읽을수 있는데
			// 라인수를 알수 없을때는 ???
			for(int i = 0; i < 30 ; i++) {
	       /*
	        * buffer = new BufferedReader(fileReader); method 를 실행하면서
	        * buffer 에 저장된 데이터를 한 라인씩 읽어서
	        * String 데이터로 return 한다
	        * 매번 호출될 때마다 자동으로 다음 라인을 읽어서
	        * String 데이터로 변환한다.
	        * 
	        * 만약 ,, 메서드를 데이터 개수만큼 반복하면 모든 데이터를
	        * 읽을 수 있다
	        * 하지만 이방법은  데이터의 개수를 알아야만 실행할수있다.
	        * 데이터의 개수를 정확히 할 수 없을때는 어쩔수 없이 무한반복을
	        * 
	        * 			
	        */
			while(true) {
			String str = buffer.readLine();
			if(str == null) {
				return;
			}
			System.out.println(str);
			
			}
			//System.out.println(buffer.readLine());
			//System.out.println(buffer.readLine());
			//System.out.println(buffer.readLine());
			}
	       buffer.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
