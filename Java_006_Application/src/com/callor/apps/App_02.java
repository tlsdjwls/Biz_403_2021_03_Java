package com.callor.apps;

import java.util.Random;

public class App_02 {
  
	public static void main(String[] args) {
		/*
		 * 생성할 배열 개수를 변수에 설정해 두고 변수르 사요앟여 배열을 만들기
		 * 
		 *  변수를 사용하여 배열을 선언하면 배열의 개수가 변경되었을때
		 *  이후에for() 반복문 등에서 코드를 변경해야 하는경우를 줄일 수 있다
		 */
		int numsLength = 30;
		
		//  int , long , float , double 형 배열을 생성하면 자동으로 모든 배열에 0이 채워지고 clear
		// String 은 자동으로 "" 으로 채워지고 clear
		int[] intNums = new int[numsLength];
		for(int i = 0 ; i < numsLength ; i++) {
			   intNums[i] = 0;
		}
		Random rnd = new Random();
		/* 
		 *  배열.length 배열을 선언하면 자동으로 생성되는 내부 변수
		 *  배열 전체를 반복하여 연산을 수행할때 사용할수 있는 값 
		 */
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100); 
			
		}
		/*
		 *  배열을 읽는 용도로 반복하여 연산을 할 경우 사용하는 확장된 for() 반복문
		 *  
		 *  for( 요소 변수 : 배열 ) { }
		 *  1 . 배열을 일렬로 모두 나열한다.
		 *  2. 첫번째 배열요소부터 한개씩 요소변수에 담아서 { } 코드로 전달한다
		 *  3. { } 코드에서는 요소변수를 사용하여 연산을 수행한다.
		 *  
		 *  for() 확장된거와 같다
		 *   for(Each)
		 *  
		 *   for(int num : intNums ) 이 코드는 
		 *   아래 연산과 같다
		 *   for(int i = 0 ; i < intNums.length ; i++){
		 *   int num = intNums[i];
		 *   }
		 */
		for(int num : intNums) {
			if(num % 2 ==0) {
				System.out.println(num);
			}
		}
		/*
		 * intNums 배열중에서 3번 요소부터 끝가지 리스트를 출력하라
		 * => 배열의 일부분만 연산을 수행하는 코드 여기서에는 forEach 를 사용할 수 없다
		 */
		for(int i = 3 ; i < intNums.length ; i++) {
			System.out.println(intNums[i]);
		}
	}
}
