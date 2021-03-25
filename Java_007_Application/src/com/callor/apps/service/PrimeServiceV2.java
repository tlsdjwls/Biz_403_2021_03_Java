package com.callor.apps.service;

import java.util.Random;

public class PrimeServiceV2 {

	  int [] intNum;
	  public PrimeServiceV2() {
         intNum = new int[20];
         
	}
	  public void makeNums() {
		 Random rnd = new Random();
		 for(int i = 0 ; i < intNum.length ; i++) {
			 intNum[i] = rnd.nextInt(51)+50;
			 
		 }
		  
	  }
	  
	  public void printPrime() {
		  
		  for(int num : intNum) {
			  
			  int index = 0;
			  for(index = 2 ; index < num ; index++) {
				  if(num % index == 0) {
					  break;
				  }
			  
			  // 중간에 break 를 만났다
			  // index == num ; 로할수있으나 오류를 막기위해 아래와 같이부등호를 사용
			  
			  if( index >= num) {
				  // 소수가 아님을 출력
				  System.out.println(num + " 는 소수");
			  }
			  }
		  }
		  
	  }
}
