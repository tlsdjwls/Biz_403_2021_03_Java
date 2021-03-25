package com.callor.apps;

import java.util.Random;

public class App_01 {
 
	public static void main(String[] args) {
	int num1 = 0;
	int num2 = 0;
			
		Random rnd = new Random();
			
		num1=2;
		
			
		

	// 11 이 소수인것을 판별해달라
		boolean notPrime = false; // flag 변수
   for(int index = 2 ; index < num1 ; index++) {
	   if(num1 % index == 0) {
		   
		   notPrime = true; // flag 변수의 setting
		   break;
	   }
	   
	// for() 반복문이 모두 완료되었거나 
	// 중간에 break 만나서 중단되었거나   
   }
   // setting 되었거나 그렇지 않을 경우를 판단하여 결과를 출력하기
   if( notPrime) { 
	   System.out.println(num1 + "는 소수가 아님");
	   }else {
		   System.out.println(num1 + "는 소수"); 
	   }
   System.out.println("==================================");  
        num2=9;
        int num =0;
        for(num = 2; num ; index < num ; index++) {
        	
        }
     /*
      * for() 반복문에서 사용할num(index변수) 를 
      * for() 반복문 시작전에 선언을 하고 실행을 하면
      * for() 반복문이 종료된 후에 num 값을 읽을 수 있다.
      * 
      * 이때 
      * 1. 만약 중간에 break를 만나서 for() 가 중단되거나
      * 2. break 없이 for() 반복문이 모두 완료되거나
      * 할텐데 1 과 2의 경우에 num 변수의 상태가 다르다
      * 
      *보통은 num 변수의 값은 조건문에 최대값과 같다
      *1번의 경우 num 값은 num2 보다 항상 작다
      *2번의 경우 num 값은 num2 보다 크거나 같다
      * if(num==num2) 라는 비교문을 사용하는 것보단
      * if(num <num2) 조건문을 사용하는 것이 논리적인 문제를 최소화할수있다
      */      
    if(num == num2) {
    	System.out.println(num2+"소수이다");
    	
    }else {
    	System.out.println(num2+"소수가 아님");
    	
    }// 논리적인 오류를 최소화 하기 위하여 
     // 비교연산자를 1개만 사용하여 검사할 수 있는 코드를 사용하는 것이 좋다
        if(num < num2) {
        	System.out.println(num2+"소수이다");
        	
        }else {
        	System.out.println(num2+"소수가 아님");
       
        
        }
   
}	 //main
} // cless
			
		
	
	
	
	
	
	
		
	
			
			  
		  


		
		
	
	

