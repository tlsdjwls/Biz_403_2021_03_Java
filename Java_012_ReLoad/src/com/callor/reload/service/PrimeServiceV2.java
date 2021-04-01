package com.callor.reload.service;



public class PrimeServiceV2 extends PrimeServiceV1{
	
	// 자동으로 protected 로 선언된 객체, 변수는 생성해서 사용할수있다
	// Random rnd;
	
	public void primeNum() {
		
		int rndNum = rnd.nextInt(51) + 50;
		
		// flag 변수 : 상태를 설정하여 사용할 변수
		boolean notPrime = false;
		for(int i = 2 ; i <rndNum ; i ++) {
			if(rndNum % i == 0) {
				notPrime = true;
				break;
			}
		} if(notPrime) {
			System.out.println(rndNum+ "는 소수가 아님");
		// flag 색깔에 따라 소수, 소수가 아님을 출력
	}else {
		System.out.println(rndNum + "는 소수임");
	}
	}

	
}

