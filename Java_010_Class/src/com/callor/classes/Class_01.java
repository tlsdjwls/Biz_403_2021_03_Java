package com.callor.classes;

import java.util.Arrays;
import java.util.Random;

public class Class_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intNum = rnd.nextInt(51) + 50;
		// i 값이 0 에서 시작하면서 1씩 증가하면서 100 미만일 경우 {} 실행하라
		// i 값은 0 ~ 99(100 - 1 )
		for(int i = 0 ; i < 100 ; i++) {
			
		}
		// i 값은 2 ~ (intNum - 1 ) 연속으로 생성
	    for(int i = 2 ; i < intNum ; i++) {
	    	System.out.println("생성된 난수 :" + intNum);
	    }
	    int nCount = 0;
	    for(int i = 2 ; i < intNum ; i++) {
	    	if(intNum % i == 0) {
	    		nCount++;
	    	}
	    }
	    
		System.out.println("약수의 개수 : " +nCount);
		int[] divisor = new int[nCount];
		
		int index = 0;
		for(int i  = 2 ; i < intNum ; i++) {
			if (intNum % i == 0) {
				divisor[index++] = i;
				
			}
		}
		
		System.out.println(Arrays.toString(divisor));
		
		
		
	}
}
