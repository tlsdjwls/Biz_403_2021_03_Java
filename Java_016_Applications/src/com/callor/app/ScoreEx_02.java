package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV2;
;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		ScoreService ss = new ScoreServiceImplV2();
		ss.selectMenu();
		
	}
}
