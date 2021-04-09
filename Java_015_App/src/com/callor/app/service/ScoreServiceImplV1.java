package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;

 /*
  * 1. 메뉴를 보여주고
  * 2. 성적입력 : 학생수의  제한이 없다.
  *  가. 학번 
  *  나. 학생이름 : InputName()
  *  다. 과목별성적입력 : inputScore()
  *  
  *  가. 학생성적입력 : inputScore() 시작
  *   - 학번입력
  *   - 이름입력
  *   - 점수입력
  *   
  *  나. 학생의 이름을 입력하는 inputName() method는
  *  return type String 형이기 때문에
  *  학생이름을 입력받고 입력받은 학생이름을 return 한다
  *  return 학생이름을 inputScroe() 에서 
  *  
  */
public class ScoreServiceImplV1  implements ScoreService{
	InputService inService;
    ScoreVO vo = new ScoreVO();
    List<ScoreVO> scoreList;
    Scanner scan;
    public ScoreServiceImplV1() {
	scoreList = new ArrayList<ScoreVO>();
	scan = new Scanner(System.in);
	}
	
	 
	@Override
	public void selectMenu() {
    // TODO 성적처리 매뉴선택
	while(true) {
		System.out.println("=".repeat(50));
		System.out.println("1. 성적입력");
		System.out.println("2. 성적리스트 출력");
		System.out.println("QUIT . 업무종료");
		String strM = scan.nextLine();
		if(strM.equals("QUIT")) {
			break;
		}
		Integer intM = null;
		  try {
		  intM = Integer.valueOf(strM);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("메뉴는 정수 QUIT만 입력");
		}
		 if(intM == 1) {
			 this.inputScore();
		 }
	    
	}//end while
		
		
	}

	
	@Override
	public String inputName(String strNum) {
	
		while(true) {
			System.out.println(strNum+"학생의 이름 입력 (QUIT. 를 입력하시면 종료)");
            System.out.print(">> ");
            String strName = scan.nextLine();
            if(strName.equals("QUIT")) {
            	break;
            }else if(strName.equals("")) {
            	System.out.println("학생이름은 반드시 입력하세요");
            	continue;
            }
            return strName;
		}//end while
		
		
		// TODO Auto-generated method stub
		return strNum;
	}
	@Override
	protected void inputScore() {
		// TODO 학번,이름,과목점수를 입력받아서 List에 추가
		// 학번 입력처리 : 001, 002 형식으로 입력받기
		// 정수 값이 intNum에 담길것이고
		// QUIT를 입력했으면 
		// null 값이 intNum에 담길것이다
		Integer intNum =  ((InputService) inService).inputValue("학번",1);
		// intNum에 null 값이 담겨 있으면 종료하고 
		// 다시 매뉴로 돌아간다
		if(intNum == null) {
			return;
		}
		// 정수를 입력했으면 입력받은 정수값을 학번의 문자열 형식(001, 002)으로 변환을 하자
		// "%3d" ,intNum : 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정렬하는 문자열 만들기 " 1"
		// String format( "%03d" , 1) 
		// 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정렬하고 왼쪽의 빈칸에 0을 체워라
		// "001"
		String.format("2021%03d", intNum); //2021001
		Integer intKor = ((InputService) inService).inputValue("국어", 0, 100);
		if(intKor == null) {
			return;
		}
		Integer intEng = ((InputService) inService).inputValue("영어", 0, 100);
		if(intEng == null) {
			return;
		}
		Integer intMath = ((InputService) inService).inputValue("수학", 0, 100);
		if(intMath == null) {
			return;
		}
		
	    
		vo.setNum(null);
		vo.setName(null);
		vo.setKor(intKor);
		vo.setEng(intEng);
		vo.setMath(intMath);
		
		
		
		
	}

	@Override
	public void printScore() {
		// TODO 리스트 출력하기
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=".repeat(50));
		
		for(int index = 0 ; index < scoreList.size() ; index++) {
			ScoreVO vo = scoreList.get(index);
			System.out.println(vo.getNum() + "\t");
			System.out.println(vo.getName() + "\t");
			System.out.println(vo.getKor() + "\t");
			System.out.println(vo.getEng() + "\t");
			System.out.println(vo.getMath() + "\t");
			System.out.println(vo.getTotal() + "\t");
			System.out.println(vo.getAvg() + "\t");
			
		}
		
	}


	@Override
	public String inputName() {
		// TODO Auto-generated method stub
		return null;
	}

}

	

