package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoreEx_01 {

	
	public static void main(String[] args) {
		// 선언하는 코드와 생성하는 코드를 분리하자!!
		// FileWriter , FileReader : 파일을 Open
		// PrintWriter , BufferedReader : 내용을 쓰고, 읽기
		FileReader fileReader = null;
		BufferedReader buffer = null;

		String fileName = "src/com/callor/score/student.txt";

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
            /*
             * ====================================================
             * while(true) 반복문의 사용
             * 1. 조건없이 무한 반복을 수행하는 코드
             * 2. 무한반복 코드를 수행하는 과정에서
             * if() 조건문을 추가하여 반복을 중단하기
             * 3. 문한복을 조건을 부여하여 탈출구를 만들때 일반적으로 쉽게 구현할수 있는 코드
             * 4. if(0 조건문이 필요하고 때로는 추가되는 코드가 필요하기도 하다
             * 5. 무한반복 코드가 
             */
			// 파일을 무조건 한 라인씩 읽어라
			// while (true) {
				//String reader = buffer.readLine();

				// 파일의 끝에 다다르면 더이상 읽지 마라
				// EOF(EndOf File) 가 되면 reader 변수에 null 값이
				// 담기게 된다 reader에 null값이 담겨 있다 == 다 읽었다
				//if (reader == null)
				//	break;
				// 이후 다른 연산 처리
			  //	 System.out.println(reader);
		   //	}   
			     // ============================================
			    /*
			     * =============================================
			     * while(조건식) 무한반복문 
			     * 1. 무한반복 코드가 중단되는 조건이 한개만 있을경우 사용하는 코드
			     * 2. 조건식을 어떻게 만들것인가 잘 구성을 해야 한다
			     * 3. while(초건식)이 시작되기 전에 
			     * 최초에 조건이 true 가 되도록 만들어야 한다
			     * 4. 적절하게 탈출을 하려면 코드내에서 조건식이 false 되도록 연산을 수행해야 한다.
			     * 5. 코드내에서 조건이 false 가 되더라도 이후의 명령들이 한번씩 실행되고 나서 탈출이
			     *  이루어 진다 
			     *  
			     */
			    // 문자열 변수 reader 를 null 이 아닌 값으로 생성하기
			   String reader = new String(); // "
			   //최초에 while() 문에서 reader!= null 은 true 가 된다
			   // != null 조건문을 실행하기 전에 reader = buffer.readLine() 을 실행하고
			   // Reader 저장된 값이 null인지 비교한다
			   // 1. reader = buffer. readLine() 을 실행하고 
			   // 2. reader 에 저장된 값을 마치 method가 return 하는것처럼 동작한다.
			   // 3. () return 하는 값이 null이 아닌가를 비교한다 
			   // 4. 그 결과가 true 이면 계속 코드 진행
			   // 5. 그 결과가 false 이면 즉시 while 명령이 끝난다.
			   while( (reader = buffer.readLine()) != null) {
				   // reader = buffer.readLine();
				   
				   //students 배열은 자동으로 분해된 문자열 개수만큼
				   // 생성이 되고 각 요소에 값이 저장된다
				  String students[] = reader.split(":");
				  System.out.printf("%s\t%s\n",students[1],students[5]);
				  
			   }
			   // ===============================================
               System.out.println("=".repeat(60));
               buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는동안 문제 발생");
		}

	}
}

