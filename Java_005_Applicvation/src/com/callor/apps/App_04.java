package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
        
		Random rnd = new Random ();
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
		
		
	   
		
		
		
	   }
	}


