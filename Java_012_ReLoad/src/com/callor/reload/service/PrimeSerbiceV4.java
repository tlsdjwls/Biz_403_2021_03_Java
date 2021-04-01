package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeSerbiceV4 {
	
	     
	
	
  protected	Random rnd;
  protected List<Integer>primeList; 
    
	   
  int num = rnd.nextInt(51) + 50;
    
	public PrimeSerbiceV4() {
	 
		
	primeList = new ArrayList<Integer>();
	  
	 
		
		
		
	}
	public void primeNum() {
		boolean notPrime = false;
		for(int index = 2 ; index < num ; index++) {
		if(num % index ==0) {
			notPrime = true;
			break;
			
		}if(!notPrime) {
			
			primeList.add(num);
		}
	}
		
		
		
	}
	
	
	public void printPrimeNum() {
	  for(Integer prime : primeList);
	    System.out.println(num);
	}
	
   
    
}
