package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.ScoreVO;
import com.callor.app.service.ScoreService;
import com.tlsdjwls.standar.MenuService;
import com.tlsdjwls.standard.service.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService {

	protected MenuService menuService;
    protected List<ScoreVO> scoreList;
    protected Scanner scan;
	private Object subjectList;
	@Override
	public void selectMenu() {
		// TODO 매뉴
		List<String> scoreMenu = new ArrayList<String>();
		scan = new Scanner(System.in);
		menuService = new ScoreServiceImplV1("빛고을 고교 성적처리", scoreMenu);
		scoreMenu.add("성적입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");
		Object subjectList;
		
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				System.out.println("업무종료");
				break;
			}
			if(menu == 1) {
				this.inputScore1();
			}else if(menu == 2) {
				this.printScore();
			}else if(menu == 3) {
				this.saveScore();
			}
		}
	}
             
	@Override
	public void inputScore1() {

		


	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
          System.out.println("빛나라 고교 성적리스트 2021");
          System.out.println("=".repeat(80));
          
          System.out.print("학번\t");
          System.out.print("이름\t");
          
		for(int index = 0 ; index < subjectList.length; index++) {
        	  System.out.print(subjectList[index] + "\t");
        	}
          System.out.print("총점 \t");
          System.out.print("평균 \t");
          System.out.println("-".repeat(80));
          
          int nSize = scoreList.size();
          for(int i = 0 ; i < nSize ; i++) {
        	  ScoreVO vo = scoreList.get(i);
        	  System.out.println(vo.getNum() + "\n");
        	  System.out.println(vo.getName() + "\n");
        	  System.out.println(vo.getKor() + "\n");
        	  System.out.println(vo.getEng() + "\n");
        	  System.out.println(vo.getMath() + "\n");
        	  System.out.println(vo.getTotal() + "\n");
        	  System.out.println(vo.getAvg() + "\n");
        	  
          }
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
		System.out.println("성적리스트 저장");
		System.out.println("저장할 파일이름을 입력하세요");
		System.out.println(">>");
		String strFileName = scan.nextLine();
		if(strFileName.equals("")) {
			System.out.println("파일 이름을 입력해야 합니다");
			return;
		}
        
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		strFileName = "src/com/callor/app"+strFileName+".txt";
		
		try {
			
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);
			
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		/*
		 * 파일을 저장할때 
		 * 각데이터를 컴마 (,) 로 구분하여 입력하고 파일이름을 *.csy로 저장하면
		 * excel에서 파일을 읽을수 있다
		 * csv : comma - separated - variables
		 * 컴마로 값을 구분한 파일
		 */
	
			int nSize = scoreList.size();
			for(int i = 0 ; i < nSize ; i++) {
				ScoreVO vo = scoreList.get(i);
				System.out.println(vo.getNum()+ ",");
				System.out.println(vo.getName()+ ",");
				System.out.println(vo.getKor()+ ",");
				System.out.println(vo.getEng()+ ",");
				System.out.println(vo.getMath()+ ",");
				System.out.println(vo.getTotal()+ ",");
				System.out.println(vo.getAvg() + "\n");
				
				
		}
		
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

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer inputScore(String strName) {
		// TODO Auto-generated method stub
		return null;
	}

}
