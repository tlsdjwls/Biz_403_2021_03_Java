package com.callor.apps;

public class Pay_01 {

	public static void main(String[] args) {
		
		int nPay = 3_723_560;// 금액
		int nPaper = 50_000;// 최고 액면가 화폐
		
		//정수 = 정수 / 정수 : 소수점이하가 잘린다
		// 몫을 구하여 액면가액 만큼 개수를 계산
		
		int nCount = nPay/ nPaper;
		System.out.println(nPaper + "원권 :" + nCount);
		//액면가액 만큼 개수를 구했으면
		//nPay 에서 액면가액 금액만큼을 빼고 이후에 계산
		// 3723560 % 50000= > 5만원권 * 매수만큼을 3723560 에서 뺀 금액이 된다
		// nPay = nPay -( nPaper * nCount)
		// nPay = nPay % nPaper;
		nPay %= nPaper;
		nPaper /= 5;
		System.out.println(nPay);
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 :" + nCount);
		nPay %= nPaper;
		nPaper /=5 ;
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 :" + nCount);
		nPay %= nPaper;
		nPaper /=2 ;
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 :" + nCount);
		nPay %= nPaper;
		nPaper /=5 ;
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 :" + nCount);
		nPay %= nPaper;
		nPaper /=2 ;
		
		
	}
}
