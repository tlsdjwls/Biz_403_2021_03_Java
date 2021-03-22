package com.callor.arrays;

import java.util.Random;

public class array_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		// 정수값 100개를 저장할 변수를 선언하라

		int[] intKors = new int[100];

		for (int i = 0; i < 100; i++) {
			// intKors[0~99] rnd.nextInt(100) + 1
		intKors[i] = rnd.nextInt(100) + 1;
			// 정수형 "배열" 100개를 선언하라
		}
		int intSum = 0;
		for (int i = 0; i < 100; i++) {
			// intSum += intKors[0~99}
			intSum += intKors[i];
		}
		for(int i = 0 ; i < 100 ; i++) {
		System.out.printf(" 학생 %d : %d\n "
				,i , intKors[i]);
		}
	}

}
