package com.callor.apps;


import com.callor.apps.service.ScoreServiceV5;

public class App_5 {

	 public static void main(String[] args) {
		
		 ScoreServiceV5 ssV5 = new ScoreServiceV5(10);
		 /*
		  * ssV5.makeScores(); 명령이 실행되면
		  * Score..V5 클래스의 ssV5.makeScores() method 의 코드가
		  * 실행된다
		  * 코드가 모두 정상 종료되거나
		  * 아니면 중간에 return 명령문을 만나면 
		  * System.out.println("입력__"); 명령문이 이어서 실행된다
		  */
		 ssV5.makeScores();
		 System.out.println("입력업무 중단!!!");
		  
	
		 System.out.println(ScoreServiceV5.dLine());
	}
        
		}	 
		 
	 

