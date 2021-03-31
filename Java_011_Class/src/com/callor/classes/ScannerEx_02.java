package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//숫자를 입력받는 nextInt() 와
		//문자열을 입력받는 nextLine() 을 혼합받는
		
		System.out.print("이름 >>");
		String strName = scan.nextLine();
		
		System.out.print("국어 >>");
		int intKor = scan.nextInt();
		
		System.out.printf("%s 의 국어 성적 : %3d\n",strName,intKor);
		
	}
}
