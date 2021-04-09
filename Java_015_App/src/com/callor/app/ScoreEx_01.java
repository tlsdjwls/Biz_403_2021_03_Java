package com.callor.app;

import com.callor.app.model.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {
		ScoreVO scoreVO = new ScoreVO();
		
		scoreVO.setNum("001");
		scoreVO.setName("홍길동");
		scoreVO.setKor(88);
		scoreVO.setEng(99);
		scoreVO.setMath(77);
		
		System.out.println(scoreVO.toString());
		
	}
}
