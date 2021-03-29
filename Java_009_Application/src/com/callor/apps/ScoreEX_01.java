package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEX_01 {

	public static void main(String[] args) {
		// ScoreVO 클래스에 디자인된 코드를 보면 변수들이 있고
		// total, avg , method 가 있다.
		// scorevo 클래스를 사용하여 만들어진 
		int 홍길동_kor = 80;
		int 홍길동_eng = 100;
		int 홍길동_math = 90;
		
		int 홍길동_total = 홍길동_kor+홍길동_eng+홍길동_math;
		
		int 이몽룡_kor = 99;
		int 이몽룡_eng = 88;
		int 이몽룡_math = 77;
		
		//* 객체 지향
		ScoreVO 홍길동 = new ScoreVO();
		
		홍길동.num = 1;
		홍길동.name = "홍길동";
		홍길동.kor = 90;
		홍길동.eng = 80;
		홍길동.math = 100;
		System.out.println("홍길동 총점 :" 
				+ 홍길동.getTotal());
				System.out.println("홍길동 평균 :" 
				+ 홍길동.getAvg());
				
		
		ScoreVO 이몽룡 = new ScoreVO();
		이몽룡.num = 2;
		이몽룡.name = "이몽룡";
		이몽룡.kor = 54;
		이몽룡.eng = 68;
		이몽룡.math = 100;
		System.out.println("이몽룡 총점 :"+ 
				이몽룡.getTotal());
				System.out.println("이몽룡 총점 :"+ 
						이몽룡.getAvg());
				
				
		
		
	}
}
