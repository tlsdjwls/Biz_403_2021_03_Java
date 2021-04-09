package com.callor.app.service;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{

	@Override
	protected void inputScore() {
		// TODO 프라이빗
		
		while(true) {
		Integer intNum = inService.inputValue("학번", 1);
		if(intNum == null) {
			return null;
			
		}
		System.out.printf("2021%03d",intNum);
		return super.inputName(strNum);
		
		// for() 반복문이 모두 정상종료 되었는지 ? : index >=size()
		// 
		int index = 0;
		for(index = 0 ; index < scoreList.size() ; index++) {
			ScoreVO vo = scoreList.get(index);
			if(vo.getNum().equals(strNum)) {
			 break;	
	}
		}
		if(index < scoreList.size()) {
			System.out.println(strNum+"는 이미 등록되어 있음");
		}
	} 
		return strNum;
	}
	}
	
	/*
	 * scoreList에 성적정보를 추가할때 학번을
	 * 입력받을텐데 이미 등록된 학번
	 * 정보가 있으면 그 학번은 추가하지 못하도록 하는 코드
	 * 
	 * V1의 inputNum() method 를 재 정의 한다
	 * V1의 inputNum() method 를 제 정의 하기 위하여
	 * private을 protected로 변경
	 */


