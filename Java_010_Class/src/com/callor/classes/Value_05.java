package com.callor.classes;

import com.callor.classes.service.ValueService;

public class Value_05 {

	public static void main(String[] args) {
		
		// retNum 맴버변수를 public 으로 선언하면 
		// 아래와 같이 간편하게 값을 읽을수 있다
		//Integer result = vs.retNum;
		
		// retNum 변수는 밸류 서비스 의 맴버 변수이다
		// 이 맴버변수를 외부에서 값을 변경하는것은 코드를 매우 위험스럽게 만드는 것이다.
		// 좋은 방법은 맴버변수를 private 으로 설정하고 getter() 메서드를 통해 읽기 S전용으로 하는것이 좋다
		 
		// vs.retNum = 200;
		
		ValueService vs = new ValueService();
		Integer result = 0;
		vs.nums();
		Integer result1 = vs.getRetNum();
		Integer result2 = vs.numsRet();
		
	}
}
