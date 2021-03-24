package com.callor.apps;

import com.callor.apps.service.ScoreService;

public class ScoreEx_02 {
    // 한번 선언하고 코딩된 클래스는
	// 어디에서든지 인스턴스로 생성하면 클래스에 만들어진 코드를
	// 호출하여 명령을 수행할수 있다.
	ScoreService sService= new ScoreService();
	  // ScoreService 클래스의  makeScore () 메서드를 
	  // 호출하여 무언가 실행하라
    sService.makeScore();
	sService.prontScore();
	    
	    
}
	

