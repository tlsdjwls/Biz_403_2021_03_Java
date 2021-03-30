package com.callor.classes.service;

public class ScoreServiceV3 extends ScoreServiceV1 {
	
 public ScoreServiceV3() {
       
	public void menuScore() {
			
		while(true) {
			
		}
			System.out.println(Lines.dLine(50));
			System.out.println("빛나라 고교 성적 시스템 V1");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("0. 업무종료");
			System.out.println(Lines.sLine(50));
			System.out.println("업무 선택 >>");
			int intMenu = scan.nextInt();
			if(intMenu == 1) {
				//성적입력
				this.inputScore();
			}else if(intMenu == 2) {
				while(true) {
					if(this.inputScore() == null) {
						break;
					}
				}
			}
				//성적 리스트 출력
			}else if(intMenu == 3) {
				this.printScore();
				
			}
 }	

}
