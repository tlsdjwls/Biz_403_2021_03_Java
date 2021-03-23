package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		
		
		Random rnd = new Random ();
		// 25 ~ 50 까지 의 수 중에서 1개를 만들어라
		int intMembers = rnd.nextInt(26) + 25;
		int pizzaPcs = 6;
		int pizzaBox = 0;
		pizzaBox = intMembers / pizzaPcs ;
		// if( bYes == false){
		boolean bYes = intMembers % (pizzaBox * pizzaPcs) == 0;
		if( !bYes ) {
			pizzaBox++;
		}
		
		System.out.println("=======================");
		System.out.println("인원수 :" + intMembers);
		System.out.println("피자판수 :" + pizzaBox);
		System.out.println("피자 계수 :" + pizzaPcs);
		System.out.println("=======================");
		
		/*
		 * 25 ~ 50명 인원 있는 각반에 pizza 간식을 지급하려고 한다.
		 * 각 반의 학생들에게 1조각 씩 pizza 를 지급하려고 한다 
		 * 학생수보다 부족하거나 6조각 이상 남지 않도록 pizza를 주문해야한다
		 * 몇 box 의 pizza 를 주문해야 하는지 코드를 남기시오
		 */
			
			
		}
				
	}
	

