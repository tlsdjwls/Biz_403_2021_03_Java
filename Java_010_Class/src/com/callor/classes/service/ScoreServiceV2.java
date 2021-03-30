package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;

public class ScoreServiceV2 extends ScoreServiceV1 {

/*
 *  ScoreServicev1 을 extends (상속,확장)
 *  ScoreServiceV1 에 있는 메서드를 그대로 이어받아서 ScoreServiceV2에 마치
 *  복사 붙이기 한것처럼 사용하겠다 
 *  
 *  V1 에서 작성된 inputScore() 를  V2 에서는 새롭게 개선
 *  (기능 업그래이드)
 */
	  
	  public ScoreServiceV2() {
		  scan = new Scanner(System.in);
		  scoreList = new ArrayList<ScoreVO>();
		  
		  
	  }
	  public Integer inputScore() {
		  
		 // System.out.println("학번을 001 형식으로 입력하세요");
		 //System.out.print(">> ");
		 //String strNum = scan.next();
		  
		  /*
		   * scoreLise 를
		   */
		 int nSize = scoreList.size();
		 String strNum = String.format("%03d", nSize + 1);
		 
		 int intKor = 0;
		 while(true) {
			 
		 
		 
		  System.out.println(strNum + 
				  " 번의  국어 점수를 입력하세요(중단 : - 1)");
		  System.out.print(">> ");
	      intKor = scan.nextInt();
	      if(intKor == -1) {
	    	  return -1;
	      } else if (intKor < 0 || intKor > 100) {
	    
	      
	     }
	      
	      System.out.println(strNum + " 번의  영어 점수를 입력하세요");
	      System.out.print(">> ");
		   int intEng = scan.nextInt();
	      
	      System.out.println(strNum + " 번의  수학 점수를 입력하세요");
	      int intMath = scan.nextInt();
          
	      ScoreVO scoreVO = new ScoreVO();
	      scoreVO.num = strNum;
	      scoreVO.kor = intKor;
	      scoreVO.eng = intEng;
	      scoreVO.math = intMath;
	      scoreList.add(scoreVO);
	      
	      return 0;
		 } 
	  } // inputSCore()
	  
	   // printScore()
	  
	  }
	
	

