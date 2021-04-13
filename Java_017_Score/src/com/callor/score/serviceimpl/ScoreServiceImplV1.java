package com.callor.score.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.tlsdjwls.standar.MenuService;
import com.tlsdjwls.standard.service.ImputService.InputService;
import com.tlsdjwls.standard.service.InputServiceImplV1;
import com.tlsdjwls.standard.service.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {
	protected MenuService menuService;
	protected InputService inS;
	protected List<ScoreVO>scoreList;
	
	protected Scanner scan;
	protected Object subjectList;
	
	
	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		scoreList = new ArrayList<ScoreVO>();
		inS = new InputServiceImplV1();
		menuService = new MenuServiceImplV1(null, null);
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		String title = "대한 고등학교 성적처리 시스템 2021";
		List<String>menuList = new ArrayList<String>();
		menuList.add("1.학생정보 등록");
		menuList.add("2.성적등록"); // inputScore()
		menuList.add("3.성적정보 열기");// readScore()
		menuList.add("4.성적정보 저장");
		menuList.add("5.성적정보 출력");
	    menuService = new MenuServiceImplV1(title, menuList);
	    Integer menu = menuService.selectMenu();
		if(menu == null) {
			return;
		}// 1번코드 
		/*
		 * 만약 menu 변수의 값이 1일때
		 * menu 가 1일때 코드가 실행되고 
		 * 코드가 종료되면 또다시  menu
		 * 값이 2인가 ? , menu 값이 3인가를
		 * 검사하는 불필요한 코드가 실행된다 
		 */
	//	if(menu == 1){}
	//	if(menu == 2) {}
	//	if(menu == 3) {}
		// 2번 코드
		/*
		 * 만약 menu 변수의 값이 1이면
		 * menu 가 1일때 실행되고
		 * 코드가 종료되면 
		 * else 이후의 코드는 무시하고
		 * 바로 if 문이 종료된다
		 * 
		 * 1번 코드에 비하면 약간이나마
		 * 효율적인 코드가 된다.
		 */
		if(menu == 1) { 
			// menu 가 1일때 
		} else if(menu == 2) {
			this.inputScore();
		} else if(menu == 3) {
			this.readScore();
		} else if(menu == 4) {
			this.saveScore();
		} else if(menu == 5) {
			this.printScore();
		}		
		// TODO 매뉴 설정
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


}
