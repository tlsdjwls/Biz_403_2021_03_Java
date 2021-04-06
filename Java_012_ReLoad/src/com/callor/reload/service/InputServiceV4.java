package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {

	protected Scanner scan;
	protected List<NumberVO>numList;
	
	public InputServiceV4() {
	   
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	    	
		
		
	}
	public void inputNum() {
	 
		System.out.println("2개의 정수를 입력하세요");
		System.out.print("정수1 >>");
		String strNum1 = scan.nextLine();
		Integer intNum1 =Integer.valueOf(strNum1);
		
		
		System.out.print("정수2 >>");
		String strNum2 = scan.nextLine();
		Integer intNum2 =Integer.valueOf(strNum1);
		
	
	
	}
	 
	  	
		
		
	
	public void printNum() {
           
		
		for(int i = i ; i < numList.size(); i++) {
		NumberVO vo = numList.get(i);
		System.out.print(vo.getNum1() + "\t");
		System.out.println(vo.getNum2() + "\t");
		
		
		}	
	}
}
