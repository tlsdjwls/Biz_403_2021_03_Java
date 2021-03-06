package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.service.ScoreService;
import com.tlsdjwls.standar.MenuService;
import com.tlsdjwls.standard.service.MenuServiceImplV1;

public class ScoreServiceImplV3 implements ScoreService {

	MenuService menuService;
      
	/*
	 * 보통 맴버변수(클래스영역에 선언된 변수들) 객체는 이클래스의
	 * 생성자에서 만드는 것이 좋다
	 * 
	 * 하지만 객체를 생성할때 전달해야할 매개변수(파라매터)에 대하여
	 * 수행해야할 연산코드가 있을 경우는 객체를 사용하기 전에 객체를
	 * 생성하는 코드를 작성하여도 된다. 
	 * 
	 * 
	 */
	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		List<String> scoreMenu = new ArrayList<String>();
		menuService = new MenuServiceImplV1("빛고을 고교 성적처리", scoreMenu);
		scoreMenu.add("성적입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");
		
		
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				System.out.println("업무종료");
				break;
			}
			if(menu == 1) {
				this.inputScore();
			}else if(menu == 2) {
				this.printScore();
			}else if(menu == 3) {
				this.saveScore();
			}
		}
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}
}

