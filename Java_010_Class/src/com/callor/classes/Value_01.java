package com.callor.classes;

import java.util.Random;

import com.sun.org.apache.xml.internal.security.signature.reference.ReferenceNodeSetData;

public class Value_01 {

	
	public static void main(String[] args) {
		
		/*
		 * java keyword 이면서 값인 경우가 있다
		 * true , false 는 boolean 형의 값 
		 * 참과 , 거짓을 나타내는 java 언어의 고유한 값
		 *
		 * 비교 연산문의 결과를 표현하기 위한 독특한 값
		 */
		boolean bYes = true;
		bYes = false;
		
		// 30 : 정수값 , 리터럴
		int num = 30;
		
		/*
		 *  null 값 : 아무것도 아닌값
		 *  -1 입력했을때 코드를 종료하고 싶다
		 *  이 경우는 num1 에 -1 값이 어떤 의미없는 값이기 때문에 
		 *  가능한 코드 
		 *  만약 -1 이 실제값으로 존재하는 필요한 값이라면 이러한 코드는 사용하기
		 *  어려워 진다.
		 *  
		 *  이럴때 사용할수 있는 값을 numll 값이라고 한다.
		 */
		Integer num1 = 0;
		
		if(num1 == -1) {
			//코드 종료
			
		}
		
		num1 = method();
		if(num1 == null) {
			
		
		System.out.println(" 이 3의 배수도 아니고 " + "4의 배수도 아니다");
		}
	   num1 = 0;
	}
	   // 0 ~ 99 까지 중의 난수 1개를 생성하여 
	   // return 하는 method 
		 private static Integer method() {
		 Random rnd = new Random();
		 Integer num = rnd.nextInt(100);
		 if(num % 3 == 0) {
			 return 1;
		 } else if (num % 4 ==0) {
			 return 1;
		 }else {
			 return null;
		 }
		 
		
		  
	}
}
