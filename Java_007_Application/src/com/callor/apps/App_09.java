package com.callor.apps;

import com.callor.apps.service.ScoreServiceV2;

public class App_09 {
    
	public static void main(String[] args) {
		
		//for(int i = 0)
		// int members = 5
		// method의 괄호() 안에 선언된 변수
		// 매개변수 , parameter 변수라고 한다
		
		// 5는 ssv2 객체를 만들때 생성자에게 전달(보내는) 값
		//(args) 아규먼트 값 : argument
		ScoreServiceV2 ssV2 = new ScoreServiceV2( 5 );
		ssV2.makScor();
		ssV2.printScor();
	}
}
