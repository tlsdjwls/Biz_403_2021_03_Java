package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(">> ");
		String str = scan.nextLine();
		System.out.println("입력한 문자열 : " + str);
		if(str.equals("END")) {
			
			System.out.println("Hi");
		}else {
			System.out.println("Bye");
		}
	}
}
