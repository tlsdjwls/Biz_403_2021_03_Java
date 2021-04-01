package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class IuputServiceV5 {

	Scanner scan;
	List<NumberVO> numList;

	public IuputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {
        
		System.out.println("=".repeat(50));
		System.out.println("두 정수의 값을 적으세요");
		System.out.print("첫번째 1: >>");
		String strNum1 = scan.nextLine();
		Integer intNum1 = 0;
		 System.out.print("두번째 2: >>");
		String strNum2 = scan.nextLine();
		Integer intNum2 = 0;
		
       try {
		intNum1 = Integer.valueOf(strNum1);
	
       
       } catch (Exception e) {
       System.out.println("숫자로만입력");
	}
	 if(intNum1 < intNum2) {
	System.out.println("2번보다 큰값을 적어주세요");
	
	 }
	
			
		
	}

	public void printNum() {
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
        
			
		}

	}
}