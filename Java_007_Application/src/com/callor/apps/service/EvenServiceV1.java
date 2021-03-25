package com.callor.apps.service;

import java.util.Random;
    // 클래스 선언문 (시작하는 곳)
public class EvenServiceV1 {
	
	int[] intNum;// 여기서는 선언만 하고 
    // int[] Nums = new int[100]; // 이렇게 하지않는다
	/*
	 * 클래스 선언하면
	 */
	// 생성자 method 
	// 클래스 를 선언하면 자동으로 만들어지는 mathod
	// 별도의 코드가 필요없으면 만들지 않아도 된다
	// new EventServiceV1() 코드에서 호출되는 mathod
	public EvenServiceV1() {// 생성은 생성자에서
		intNum = new int[100];

	}
	/*
	 *  1시간에 90KM 를 갈수있는 속도로 달려라
	 *  90KM/h 속도로 달려라
	 */

	public void makNums() {
		Random rnd = new Random();
		// intNums 배열 개수만큼 코드를 반복실행하라
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}

	}
        /*
         * 짝수(Even) 홀수(Odd)
         * 짝수값을 구하는 관계로 Even 을 사용
         */
	public void printEven() {
		for(int i = 0 ; i < intNum.length ; i++) {
			if(intNum[i] % 2 == 0) {
                   System.out.println(intNum[i]);
                   System.out.println();

					
				}

			}
		}
	 public void sumEven() {
		 System.out.println("======================");
		 System.out.println("짝수들의 리스트");
		 System.out.println("----------------------");
		 int intSum = 0;
		 for(int i = 0 ; i <intNum.length; i++) {
			 if(intNum[i] % 2 == 0) {
				 intSum += intNum[i];
			 }
		 }
		 System.out.println("=====================");
		 System.out.println("총합 :" + intSum);
		 System.out.println("======================");
	 }
	}

