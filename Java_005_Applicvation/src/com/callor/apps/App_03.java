package com.callor.apps;

import java.util.Random;

public class App_03 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intScores = new int[10];
		float floatAvg = 0;
		for(int i = 0 ; i < 10 ; i++) {
		floatAvg = (float) intScores[i] / 10;
		 intScores[i] = rnd.nextInt(51) + 50;
		
		System.out.println("========================");
		System.out.printf("총점 : %d 평균: %d3.2d\n", intScores[i],floatAvg);
		System.out.println("========================");
		/*
		 * 정수 배열 intScores 10개 선언 Random 클래스로 50~100 까지 정수를
		 * intScomrs에 저장 
		 * intScores에 점수의 총점 , 평균 
		 * 
		 */
		}
		
		
		}
		
		
		
	}

