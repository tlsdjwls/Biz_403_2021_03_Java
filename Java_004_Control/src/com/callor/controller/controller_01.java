package com.callor.controller;

public class controller_01 {

	public static void main(String[] args) {
        
		
		// 0 ~ 99 + 1 => 1 ~ 100
		for(int i = 0 ; i < 100 ; i++) {
		
			// 1-1 1~100
		int num = i + 1 ;
		// 2. 3배수이면
		if(num % 3 ==0) {
			System.out.println(num);
		    System.out.println(",");
		}
        if(num % 4 == 0) {
        	System.out.println(num);
        	
        }
	    // 3의 배수의 합, 4의 배수의 합
        // 합의 구하기 위해
        //변수를 선언을 한다
		int intSum3 = 0;
		int intSum4 = 0;
		for(int index = 0 ; index < 20; index++) {
			int num1 = index + 1;
			
			int intSum5 = 0;
			
			// num값이 3의 배수이면
			// num값을 intSum3 변수에 누적하라
			// 누적하라 : intSum3 변수에 담긴값과 num값(새로운값)을 덧셈하여
			//다시 intSum3 변수에 저장하라
			if(num1 % 3 == 0) {
				intSum3 += num1;
			/*
			 * 여기서 else if 를 사용하면 3의 배수이면서 4의 배수인경우
			 * 3의 배수에는 합산(누적) 이 되지만
			 * 4의 배수에는 누락이 된다.
			 */
					
				
			} if (num1 % 4 == 0){
			   intSum4 += num1;
			
			   
			   /* 
			    * 3의 배수이면서 5의 배수 
			    * 
			    * num % 3 == 0 AND num % 5==0
			    * 
			    */
			   if(num1 % 3 == 0 ) {
				   if(num1 % 5 ==0) {
					   intSum5 += num1 =0;
					   
				   }
			   }
			   
			}
     			}
		}
		
		
		   }
	    
	     }
		
		 
		

	


