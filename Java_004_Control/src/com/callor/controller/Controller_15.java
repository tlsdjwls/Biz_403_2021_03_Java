package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		
		Random rnd = new Random ();
		int intKor1= rnd.nextInt(100);
		int intKor2= rnd.nextInt(100);
		int intKor3= rnd.nextInt(100);
		int intKor4= rnd.nextInt(100);
		int intKor5= rnd.nextInt(100);
		
		int intSum = 0;
		
		intSum =  intKor1;
		intSum += intKor2;
		intSum += intKor3;
		intSum += intKor4;
		intSum += intKor5;
		
		float floatAvg = (float)intSum /5;
		
		System.out.println("===============");
		System.out.printf("학생 1 : %3d점\n",intKor1);
		System.out.printf("학생 2 : %3d점\n",intKor2);
		System.out.printf("학생 3 : %3d점\n",intKor3);
		System.out.printf("학생 4 : %3d점\n",intKor4);
		System.out.printf("학생 5 : %3d점\n",intKor5);
		
		/*
		 * num 변수하고 intKor 이름하고 합하여
		 * intKor1~ intKor5
		 */
		
		
		
		}
	}


