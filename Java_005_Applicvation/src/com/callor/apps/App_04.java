package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
        
		Random rnd = new Random ();
		// 5학금의 인원수를 저장할 배열
		int intClass1 = rnd.nextInt(10) + 50;
		int intClass2 = rnd.nextInt(10) + 50;
		int intClass3 = rnd.nextInt(10) + 50;
		int intClass4 = rnd.nextInt(10) + 50;
		int intClass5 = rnd.nextInt(10) + 50;
		
		int intTotal = 0;
		
		System.out.println("======================");
		System.out.println("인원수\t피자주문\t전체");
		System.out.println("----------------------");
		int pizzaBox = intClass1 / 6;
		if(intClass1 % (pizzaBox * 6) > 0) {
		pizzaBox++;	
		}intTotal += pizzaBox;
		System.out.println(intClass1 + "\t");
		System.out.println(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);
	    
        //5학급의 인원수를 저장할 배열
		int[] intClasses = new int[5];
		for (int i = 0 ; i  < 5 ; i++) {
			// @@ : 시작값을 지정하는 형태
			// 50~ 59 중에 임의의 수를 지정하는형태
			
			//학급별 주문수량을 계산하는 부분과
			// 리스트를 출력하는 부분을 분리하자
			// 1. 계산더ㅣㄴ 주문수량을 담아둘 장소를 생성
			// 2. 저장된 주문수량을 사용하여 출력
			
			// 학급별 주문수량을 계산하여 저장할 배열
			
			int[] intOrders = new int[5];
			int pizzaPcs = 0;
			
			for(int i = 0 ; i < 5 ; i++) {
				
				int order = intClasses[i] / pizzaPcs;
				// 인원수 대비 피자 조각수를 비교하여 부족할 경우 1box 추가하기
				if( intClasses[i] % (order * pizzaPcs) > 0);
				order++;
				intOrders[i] = order;
				}
			System.out.println("피자 주문서");
			System.out.println("==================");
			System.out.println("순번\t인원\tBOX\t조각");
			System.out.println("------------------");
		
			for(int i = 0; i < 5 ; i++ ) {
				System.out.println((i + 1) + "\t");
				System.out.println(intClasses[i] + "\t");
				System.out.println(intOrders[i] + "\t");
				System.out.println(intOrders[i] + "\t");
				System.out.println(intOrders[i] * pizzaPcs);
			    
			
		}
	   
		}
		
		
	   }
	
	}


