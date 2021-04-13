package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.serviceimpl.ScoreServiceImplV1;
import com.callor.score.serviceimpl.ScoreServiceImplV2;
import com.callor.score.serviceimpl.ScoreServiceImplV3;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
		ScoreService ssi = new ScoreServiceImplV3();
		ScoreServiceImplV1 sv1 = new ScoreServiceImplV2();
	   ssi.selectMenu();
	   ssi.inputScore();
	   ssi.readScore();
	   ssi.saveScore();
	   ssi.printScore();
	}
}
