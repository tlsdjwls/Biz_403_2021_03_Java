package com.callor.apps;

public class String_01 {
 
	public static void main(String[] args) {
		//문자 변수 : 알파벳 한글자 만 저장
		// 표현 작은따옴표('')로 감싼다
		// 문자는 알파벳으로 읽히지만 변수에 저장될때는 정수형
		// ASCII 코드 값으로 저장된다
		// 그래서 정수와 사칙연산이 가능하다
		char char1 = 'A';
		// 문자열 변수 : 문자들의 묶음 변수
		String str1 = "대한민국 만세";
		
		System.out.println(char1);
		System.out.printf("%d",(int)char1);
		System.out.println(char1+1);
		
		for(int i = 'A' ; i <= 'Z'; i++) {
			System.out.println((char)i);
		}
		// str1 변수에 담긴 문자열의 길이를 세어서
		// strLength  변수에 담아달라
	   int strLength = str1.length();
	   System.out.println(strLength);
	   
	   System.out.println(str1.length());
	   System.out.println("Republic of Korea".length());
	   //() 있는 것은 메서드
	   // () 없는 것은 변수
	   // 5번에서 6번 까지 잘라서 추출해라
	   
	   str1 = "Republic of Korea";
	   String str2 = str1.substring(5,6);
	   System.out.println(str2);
	   
	   // str1 변수에 담긴 문자열에서
	   // 앞에서부터 12번째 부터 앞에서부터 17번째까지
	   // 추출하여 str2에 저장하라
	   str2 = str1.substring(12,17);
	   System.out.println(str2);
	   
	   // str1 에 담긴 문자열을 한글자씩 잘라서 출력하라
	   for(int i = 0; i <str1.length() ; i++) {
		   str2 = str1.substring(i,i+1);
		   System.out.println(str2);
	   }
	   
	   String[] str3 = str1.split(" ");
	   for(int i = 0 ; i < str3.length ; i++) {
		   System.out.println(str3[i]);
	   }
	   //str1 에 배열을 잘라서 출력하라
	   str3 = str1.split("");
	   for(int i = 0 ; i < str3.length ; i++) {
		   System.out.println(str3[i]);
	   }
	   
	   
	   
	   
	}
}
