package com.callor.apps;

public class App_06 {

	public static void main(String[] args) {
		int nCount = 0;
		// for () 중첩하기
		//바깥 for(int i) 가 한번 반목할때 마다
		// 안쪽 for (int j) 가 5번 반복하라
					
		for(int i = 0 ; i < 5 ; i++) {
		for(int j = 0; j < 5 ; j++) {
		System.out.println(++nCount);		
			}
		}
		// 한줄에 별 5개를 찍고 Enter 키를 눌러 똑같이하라
		for(int i = 0 ; i < 5 ; i++) {
		for(int j = 0; j < 5 ; j++) {
		System.out.print(" * ");
		}
		System.out.println();
		}
		System.out.println("=====================");
	    for(int i = 0 ; i < 5 ; i++) {
		for(int j = 0; j < i + 1 ; j++) {
		System.out.println(" * ");		
		
         }
       System.out.println();
	}
	    System.out.println("=====================");
	    for(int i = 0 ; i < 5 ; i++) {
		for(int j = i ; j < 5 ; j++) {
		System.out.println(" * ");		
		
         }
        System.out.println();
}
	    
	    
	}
	    
}