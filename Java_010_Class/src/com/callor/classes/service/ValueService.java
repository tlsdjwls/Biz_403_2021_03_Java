package com.callor.classes.service;

public class ValueService {
    /*
     * 클래스의 맴버변수를 퍼블릭으로 변수 설정하고 
     * 
     * 어떤 이유로든 퍼블릭으로 된 맴버변수는
     * 값이 변경될 수있다.
     * 원하지 않는 값으로 변수 내용이 오염될수 있다 그러한 현상을 방지하기 위해
     * 맴버변수는 가급적 프라이빗 으로 선언을 하고 맴버변수값을 객체, 변수 형식으로 읽어내고자한다S
     */
	private int retNum;
	public int getRetNum() {
		return retNum;
	}
	
	public void nums() {
		// nums method 는 어떤 연산을 수행하고 그결과값인
		// 100 을 호출한곳에 return 하고 싶다
		// void method 에서는 값을 return 할수 없다
		// 맴버변수를 선언하고 맴버변수에 값을 저장해 두었다
		retNum = 100;
		
	}
	public Integer numsRet() {
		return 100;
	}
}
