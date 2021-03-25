package com.callor.apps.service;

import java.util.Random;
    // 클래스 선언문 (시작하는 곳)
public class EvenServiceV2 extends EvenServiceV1{
	//extends : 코드를 가져와서 복사해서 쓰고 싶다
	// 클래스의 상속
	/*
	 * 자바 프로그래밍에서 상속
	 * v2 클래스에서는 v1 클래스를 상속했다
	 * v1 에 작성한 (선언한) 변수, method 코드를 그대로 이어받아서 사용하겠다
	 * 
	 * v1 에 작성된 mathod들의 코드를 그대로 사용하면서 일부 method의 코드를 
	 * 변경 ,확장 , 기능개선을 하여 내 프로젝트에 적용 하겠다
	 */
	int[] intNum;// 여기서는 선언만 하고 
    // int[] Nums = new int[100]; // 이렇게 하지않는다
	/*
	 * 클래스 선언하면
	 */
	// 생성자 method 
	// 클래스 를 선언하면 자동으로 만들어지는 mathod
	// 별도의 코드가 필요없으면 만들지 않아도 된다
	// new EventServiceV1() 코드에서 호출되는 mathod
	public EvenServiceV2() {// 생성은 생성자에서
		intNum = new int[20];

	
	/*
	 *  1시간에 90KM 를 갈수있는 속도로 달려라
	 *  90KM/h 속도로 달려라
	 */

		
	}
	
        /*
         * 짝수(Even) 홀수(Odd)
         * 짝수값을 구하는 관계로 Even 을 사용
         */
	public void printEven() {
		int nCount = 0;
		for(int i = 0 ; i < intNum.length ; i++) {
			if(intNum[i] % 2 == 0) {
                   System.out.printf("%5d",intNum[i]);
                  nCount++;
                  if(nCount % 5 ==0) {
                	  
                	  
                	  
                  }
                	  
            
                  

                  
	

