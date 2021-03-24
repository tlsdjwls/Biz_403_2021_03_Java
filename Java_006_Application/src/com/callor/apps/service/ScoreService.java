package com.callor.apps.service;

import java.util.Random;

public class ScoreService {
	/*
	 * main() 메서드가 없는 클래스
	 */
	// 클래스 영역에 선언만 되어있는 변수
	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intTotal;
	float[] floatAvg;

	Random rnd = null;

	// 임의로 makeScore 라는 이름으로 선언한 메서드
	// makeScore () method(메서드)
	// 클래스 영역에 선언된 배열과 변수를 초기화
	public void makeScore() {

		rnd = new Random();
		intKor = new int[10];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];

		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
	} // makeScore() 영역 , end makeScore()

	public void prontScore() {
		System.out.println("빛나라 고교 성적 리스트");
		System.out.println("==========================================");
		System.out.println("국어\t 영어\t 수학\t 총점 \t 평균");
		System.out.println("------------------------------------------");

		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);

			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%3.2f\t", floatAvg[i]);
			System.out.println("=====================================");
		}
	}
}
