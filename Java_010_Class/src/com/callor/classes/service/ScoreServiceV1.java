package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;

public class ScoreServiceV1 {
	/*
	 * 접근제한자 ( 참조제한자)
	 * 
	 * public , private , protected
	 * 
	 * public :모두에게 개방한다 , 모두에게 공개한다 누구나 접근(읽기,쓰기) 하게한다. Class obj = new Class()
	 * obj.method(); obj.변수 = 100;
	 * 
	 * private : 현재 클래스 (파일) 에 있는 코드에서만 접근가능 obj.변수 = 100; //문법에 오류가 난다
	 * 
	 * protected : 객체를 통해서 직접 접근금지 Class obj = new Class() obj.method() 방식으로 접근이
	 * 안된다. 클래스를 상속받게 하겠다 라는 전제하에 상속을 받은 클래스에서는 자유롭게 점근 가능
	 * 
	 * 부모클래스와 상속받은 자식클래스 간에 공유하는 목적
	 * 
	 * 
	 * 
	 * class , method, 맴버변수를 선언할때 사용하는 keyword 접근 제한자는 사용하지 않아도 문법적인 오류가 발생하지는 않는다.
	 * 
	 * 객체 이론에 "정보은닉 (감춘다, 제한적으로 접근하게 한다, 데이터를 보호한다)"
	 * 
	 * 
	 */
	
	/*
	 * 맴버변수를 protected로 선언을 해 두면 현재 클래스(v1)를 상속받은 자식
	 * 클래스에서 변수가 선언된 것처럼 동작할 수 있다.
	 * 
	 *  상속을 허락하고 , 맴버변수를 공유하고자 할때는 protected 를 추가한다.
	 *  
	 */

	protected Scanner scan;
	protected List<ScoreVO> scoreList;

	public ScoreServiceV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();

	}

	public Integer inputScore() {

		// System.out.println("학번을 001 형식으로 입력하세요");
		// System.out.print(">> ");
		// String strNum = scan.next();

		/*
		 * scoreLise 를
		 */
		int nSize = scoreList.size();
		String strNum = String.format("%03d", nSize + 1);

		int intKor = 0;
		while (true) {

			System.out.println(strNum + " 번의  국어 점수를 입력하세요(중단 : - 1)");
			System.out.print(">> ");
			intKor = scan.nextInt();
			if (intKor == -1) {
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

	public void printScore() {

		for (int i = 0; i < scoreList.size(); i++) {
			// scoreList 의 i 번째 저장된 값을 읽어서
			// ScoreVO 형 sVO 객체에 담기
			ScoreVO sVO = scoreList.get(i);

			System.out.print(sVO.num + "\t");
			System.out.print(sVO.kor + "\t");
			System.out.print(sVO.eng + "\t");
			System.out.print(sVO.math + "\n");
		}
	}
	// printScore()

	private void printHeader() {
		System.out.println(" * 빛나라 고교 성적 처리 V1");
		System.out.println(Lines.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Lines.sLine(50));
	}

}
