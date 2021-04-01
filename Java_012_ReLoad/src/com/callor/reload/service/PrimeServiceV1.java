package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {

	protected Random rnd;
	int intNum1;

	public PrimeServiceV1() {

		rnd = new Random();
		

	}

	public void primeNum() {
		/*
		 * for() 반복문은 실행되거나 끝나는 경우 비교문 "i < rndNum" true 인 동안 반복하라 만약 rndNum가 10이다 i ==
		 * 9 일때까지 반복하라 for() 반복문이 종료되면 i 은 얼마일까?
		 * 
		 * i 값이 rndNum 보다 작으면 { } 내의 코드 실행 실행 후에 i ++ 를 실행한다 i 가 9 가 되었을때 { } 을 실행하고
		 * 다시한번 i++ 가 실행 된다
		 * 
		 * 때문에 for () 반복문이 중단되지 않고 모두 정상 수행이 되면 "i 값은 rndNum 값과 같아진다" "i == rndNum" 
		 * 인데 i< rndNum 냐고 묻는것
		 *  
		 *  만약 for () 반복문이 중간에 break 를 만났다 "i 값은 항상 rndNum 보다 작다"
		 */
		int rndNum = rnd.nextInt(51) + 50;
        boolean notPrime = false;
		for (int i = 2; i < rndNum; i++) {
			// rndNum 가 6 이라고 가정
			// 6%2,6%4,6%5
			// rndNum 가 100 이라고 가정 
           if(rndNum % i == 0) {
        	   //소수가 아닌 경우
        	   // rndNum를 i 값들로 나머지 연산을 했을때 한번이라도 나머지가 0이면
        	   // 그 수는 소수가 아닌 경우이다 그렇다면 그이후에는 더이상 연산을 할 필요가 없다
        	   notPrime = true;
        	 break;   
           }
        	   
           
		} // for() end 
		// 여기서 for() 반복문이 break 되었냐?
		// break 가 되었다면 소수가 아님
		// 아니면 모두 완료되었다?
		// 그렇지 않으면 그수는 소수
            if(notPrime == true) {
            	System.out.println("소수가 아님");
            }else {
            	System.out.println("소수임");
            }
	}
	}
