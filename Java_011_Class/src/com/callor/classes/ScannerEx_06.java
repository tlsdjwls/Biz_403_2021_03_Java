package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			Integer intNum1 = 0;
			Integer intNum2 = 0;
			
			System.out.println("숫자 2개를 입력 하세요");
			System.out.println("=".repeat(30));
			System.out.print("숫자 1(QUIT:중단하기) >>");
	     	String strNum1 = scan.nextLine();
	     	if(strNum1.endsWith("QUIT")) {
	     		// 매인 메서드 에서 리턴이 실행되면 어플리케이션을 끝내겠다 라는 통보
	     		return;
	     	}
			try {
			intNum1 = Integer.valueOf(strNum1);
				
			} catch (Exception e) {
			System.out.print("숫자로만 입력하세요");
			continue;
			}
			
			
			System.out.print("숫자 2>>");
			String strNum2 = scan.nextLine();
			
			
			try {
			intNum2 = Integer.valueOf(strNum2);
			System.out.print("숫자로만 입력하세요");	
			} catch (Exception e) {
				// TODO: handle exception
				continue;
			}
			
			System.out.printf("%3d * %3d = %3d\n",intNum1,intNum2,intNum1 * intNum2);
			
			
			
			
		}
	}
}
