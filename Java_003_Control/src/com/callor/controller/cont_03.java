package com.callor.controller;

public class cont_03 {

	public static void main(String[] args) {
		
		// 0 부터 9까지 출력하기
		for(int i = 0 ; 1 < 10 ; i ++) {
			System.out.println(i);
		}
    /*
     *  i ++ 와 i + 1 차이
     *  for() 반복문내에서 i++ 를 사용할때는 매우 주의를 해야한다.
     *  for()반복문의 반복 횟수가 변경되어 버린다
     *  1. 변수 i 의 저장된 값이 변경되느나 아니냐
     *  i++ : i에 저장된 값이 1증가하는 값으로 변경 i + 1 : i에 저장된 값은 변경되지 않는다
     *  i 변수에 저장된 값에 1을 덧셈하여 임시적으로 다른 명령에서 사용하려고 할때 설치
     */
	 for(int i = 0 ; i < 10 ; i ++); {
		System.out.println(i); }
	 
	 System.out.println("================");
	 
	 for (int i = 0 ; i < 10; i++) {
		 System.out.println("우리나라"); }
	 
	 System.out.println("================");
	 
	for (int i = 0 ; i < 10; i ++); {
		System.out.println("대한민국");}
	
	System.out.println("=================");
	 for (int i = 0 ; i < 10 ; i += 2) {
		 System.out.println("Republic of Korea");
	/*
	 *  for  () 반복문내에서 i ++ 를 실행하고
	 *  {for 본문명령문} 내에서 i-- 를 실행했다
	 *  이런상황이 되면 i 값은 i < 10 조건에서 항상 true 인 상태가 되어 무한반복되는 
	 *  코드가 되어버린다	 
	 */
		
	 }
	
	}
	// int intNum= 3; 정수형변수 intNum 를 선언하고
	// 정수 3을 변수 intNum 에 저장하라
	
	
	

}
