package com.callor.controller;

import java.util.Random;

public class Comtroller_11 {

	public static void main(String[] args) {

		Random rnd = new Random();

		for (int i = 0; i < 5; i++) {
			int num1 = rnd.nextInt(100) + 1;
			if (num1 % 3 == 0) {
				System.out.println(num1 + " 3의 배수 ");
			} else {
				System.out.println(num1 + " 3의 배수가아님 ");

			}
        // 0~(100 - 1)
		rnd.nextInt(100);
		// 0 ~ 79
		rnd.nextInt(80);
		// 0 ~ 9
		rnd.nextInt(10);
		
		
		// for(int i = 0 ; i < 5 ; i++){
		// num = rndNum + 1;
		// num = rnd.nextInt(100) + 1;
		}
	}
}
