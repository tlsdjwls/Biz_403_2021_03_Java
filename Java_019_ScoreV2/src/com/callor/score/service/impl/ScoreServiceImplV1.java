package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.tlsdjwls.standard.service.ImputService.InputService;
import com.tlsdjwls.standard.service.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {
	protected List<ScoreVO> scoreList;

	protected Scanner scan;
	protected InputService inS;
	protected StudentService sSvi;

	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		inS = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		sSvi = new StudentServiceImplV1();
	}

	@Override
	public void insertScore() {
		// TODO get , set
		// 유효성 검사가 끝난 후 학번을 가지고 VO 에
		// 담아야 하기 때문에 while() 전에 선언
		String strNum = null;
		while (true) {
			Integer intNum = inS.inputValue("학번", 1);
			if (intNum == null) {
				return;
			}
			// 00001 형식으로 학번 변환(생성)
			strNum = String.format("%05d", intNum);
			// 이미 등록된 학번인가를 검사
			ScoreVO scVO = this.numCheck(strNum);
			if (scVO == null)
				break;
			// 학번에 해당하는 점수가 없다!!
			// 학생정보에 등록된 학번인가를 검사하여 학생정보에 없으면
			// 다시 학번을 입력받고 있으면 점수를 입력하도록 break;
            StudentVO stVO = sSvi.getStudent(strNum);
			if (stVO == null) {
				System.out.println("학적부에 없는 학생입니다");
				System.out.println("학번을 다시입력하세요");
				continue;
			}
			System.out.println("=".repeat(30));
	        System.out.printf("학번:%s\n", stVO.getNum());
			System.out.printf("이름:%s\n", stVO.getName());
			System.out.printf("학과:%s\n", stVO.getDept());
			System.out.printf("학년:%s\n", stVO.getGrade());
			System.out.printf("주소:%s\n", stVO.getAddress());
			System.out.println("-".repeat(30));
			System.out.println("학생정보가 맞습니까?");
       

		} // 학번입력끝!!

	}



	// 위에서 담겨있던 데이터는 clear 되고 새로운
	// scoreVo 가 생성된다

	// end insertScore();
	

	protected ScoreVO numCheck(String num) {
		// 파라메터로 전달받은 학번이 스코어리스트에 있는지 검사
		// 있으면 스코어 브이오 를 리턴
		// 없으면 리터널
		for (ScoreVO vo : scoreList) {
			if (vo.getNum().equals(num)) {
				return vo;
			}
		
		}
		return null;
			
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
	 ScoreVO vo = new ScoreVO();
	 Integer intKor = null;
		intKor = inS.inputValue("국어", 0, 100);
		if (intKor == null) return;
		Integer intEng = null;
	    intEng = inS.inputValue("영어", 0, 100);
     if(intEng == null) return;
	    Integer intMath = null;
	    intMath = inS.inputValue("수학", 0, 100);
     if(intMath == null) {
    	 return;
     }
     
        int sum = intKor + intEng + intMath ;
        
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		System.out.println("빛고을 고등학교 성적처리 시스템 V2");
		System.out.println("=".repeat(60));
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=".repeat(60));
		int nSize = scoreList.size();
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.println(vo.getNum() + "\t");
			System.out.println(vo.getKor() + "\t");
			System.out.println(vo.getEng()+ "\t");
			System.out.println(vo.getMath() + "\t");
			System.out.println(vo.getTotal() + "\t");
			System.out.println(vo.getAvg() + "\n");
		}

	}

}
