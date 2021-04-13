package com.callor.score.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.tlsdjwls.standar.MenuService;
import com.tlsdjwls.standard.service.ImputService.InputService;
import com.tlsdjwls.standard.service.InputServiceImplV1;
import com.tlsdjwls.standard.service.MenuServiceImplV1;

public class ScoreServiceImplV1Ex extends ScoreServiceImplV1{
	

	protected MenuService menu;
	protected InputService inS;	
	
	public ScoreServiceImplV1Ex() {
		inS = new InputServiceImplV1();
		
		/*
		 * MenuServiceImplV1 클래스의 생성자는 
		 * 두개의 매개변수(아규먼트 , 파라메터) 를 전달하면서
		 * 호출을 해야 한다 .
		 * 첫번째 매개변수는 프로젝트의 title
		 * 두번째 매개변수는 업무 리스트를 담은 List 형 객체
		 * 
		 * title 은 단순 문자열이기 때문에 바로 전달할수 있는데
		 * List 형 객체는 List 객체를 생성하고 , 데이터를 add 한후
		 * 전달해야하므로 약간의 추가 연산 코드가 필요하다
		 * 
		 * 이럴때는 생성자 method 에서 작성하지 않고
		 * 객체를 사용하는 method 에서 작성하는 것이 좋다
		 * 
		 */
		menu = new MenuServiceImplV1(null, null);
	}
	public void selectMenu() {
		// TODO Auto-generated method stub
		String title = "대한 고등학교 성적처리 시스템 2021";
		List<String>menuList = new ArrayList<String>();
		menuList.add("1.학생정보 등록");
		menuList.add("2.성적등록");
		menuList.add("3.성적정보 열기");
		menuList.add("4.성적정보 저장");
		menuList.add("5.성적정보 출력");
	    menu = new MenuServiceImplV1(title, menuList);
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
		if(menu == 1){}
		if(menu == 2) {}
		if(menu == 3) {}
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
		}else if(menu == 2) {
			
		}else if(menu == 3) {
			
		}
		}
	}

	


