package com.callor.app.service;

/*
 * v2 는 v1 을 상속받고
 * v3 는 v2 을 상속받고
 * v3 는 v1 을 상속받고 v2의 제정의된 inputNum() 를 상속받는 효과가 된다.
 * 즉 v3 는 v1에 구현된 객체,변수,method 를 모두 그대로 물려받으면서 
 * v2에서 새롭게 작성한 inputNum() 를 상속받아서 사용하고 있다.
 * 
 */
public class ScoreServiceV3 extends ScoreServiceImplV2 {

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("빛나라 고교 성적처리 V3");
			System.out.println("=".repeat(60));
			System.out.println("1 . 성적등록");
			System.out.println("2 . 성적 리스트 출력");
			System.out.println("3 . 성적 파일에 저장");
			System.out.println("QYIT. 업무종료");
			String strM = scan.nextLine();
			if(strM.equals("QUIT")) {
				break;
			}
			Integer intM = null;
			try {
			intM = Integer.valueOf(strM);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("메뉴는 0~2 까지만 선택 , 종료:QUIT");
				continue;
			}
			if(intM ==1) {
				this.inputScore();
			}else if(intM == 2) {
				this.inputScore();
			}else if(intM == 3) {
				
			}
			System.out.println("업무 종료 편한 휴일 보내세요");
		}
		
		super.selectMenu();
	}
	// 입력된 성적리스트를 파일에 저장하기
	protected void scoreToFile() {
		
	}
	

}
