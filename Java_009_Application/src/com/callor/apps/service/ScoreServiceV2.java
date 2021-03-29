package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	Scanner scan;
	 public ScoreServiceV2() {
	 scan = new Scanner(System.in);
			
	 }	
	 // 
	 public void makeScores() {
		 /*
		  * method return type 이 void 가 아닌경우에는
		  * method 가 return 한 값을 
		  * 변수에 저장받기 를 할수 있다
		  * 이때 변수는 method 의 return type 과 같은
		  * type(형) 이여야 한다
		  */
		 System.out.println("국어 점수입력");
		 Integer intKor =this.inputScores();
		 System.out.println("영어 점수입력");
		 Integer intEng =this.inputScores();
		 System.out.println("수학 점수입력");
		 Integer intMath =this.inputScores();
		 System.out.println("====================================================");
		 System.out.printf("국어점수 :  %d",intKor);
		 System.out.printf("영어점수 :  %d",intEng);
		 System.out.printf("수학점수 :  %d",intMath);
		 
	    }
	    
	
	
	public Integer inputScores() {
		 Integer score = 0;
		while(true) {
			System.out.println("점수를 입력하세요(0~100)");
			
			if(score < 0 || score > 100) {
				System.out.println("점수는 0 ~ 100 까지만 입력하세요");
				continue;
			}
			break;
		}
		return score;
	 }
}