package com.callor.controller;

public class Score_01 {

	public static void main(String[] args) {
		
	int intKor = 0;
	int intEng = 0;
	int intMath = 0;
	
	int intSum = 0;
	int intAvg =0;
	
	intKor = 80;
	intEng = 77;
	intMath = 65;
	
	intSum = intKor;
	intSum += intEng;
	intSum += intMath;
	
	intAvg = (intKor + intEng + intMath) / 3;
	intAvg = intSum / 3;
	System.out.println("================");
	System.out.println("국어 : %d\n" + intKor);
	System.out.println("영어 : %d\n" + intEng);
	System.out.println("수학 : %d\n" + intMath);
	System.out.println("----------------");
	System.out.println("총점 : ");
	System.out.println("===================");
	
	/*
	 *  printf()사용하여 출력할때
	 *  %d : 정수(십진수)
	 *  %3d : 자릿수를 3개로 맞추고 값을 오른쪽 정령
	 *  %f : 실수(%3.2f 소수점이하 2째자리까지 표시 ) 	
	 *  %s : 문자열
	 *  \n 
	 *  \t
	 */
	
	}

}
