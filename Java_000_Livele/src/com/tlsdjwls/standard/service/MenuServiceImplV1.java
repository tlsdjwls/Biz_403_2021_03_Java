package com.tlsdjwls.standard.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tlsdjwls.standar.MenuService;

  /*
   *  new MenuServiceImplV1  형식으로 작성이 안된다
   *  반드시
   */
  
public class MenuServiceImplV1 implements MenuService {
 	
	 protected List<String> menuList;
	 protected Scanner scan;
	 protected String title;
	 public MenuServiceImplV1(String title, List<String> menuList) {
		this.title = title;
		this.menuList = menuList;
	    scan = new Scanner(System.in);			
	
	 }
	 public Integer selectMenu() {
		 while(true) {
		 System.out.println("=".repeat(50));
		 System.out.println("title");
		 System.out.println("-".repeat(50));
		 int nSize = menuList.size();
		 for(int menuIndex = 0 ; menuIndex < nSize ; menuIndex++) {
			 System.out.printf("%d,%s\n",menuIndex + 1 , menuList.get(menuIndex));
			 
		 }
		 System.out.println("QUIT. 업무종료");
		 System.out.println("-".repeat(50));
		 System.out.println("업무선택>> ");
		 String strm = scan.nextLine();
		 if(strm.equals("QUIT")) {
			 return null;
		 }
		 Integer intM = null;
		 
		 try {
		intM = Integer.valueOf(strm);	
		} catch (Exception e) {
			System.out.printf("업무는 1 ~ %d, 또는 QUIT만 입력하세요"
					,nSize);
			// TODO: handle exception
			continue;
		
	    
			 
		 }
			
		}
		 
		 }
	 }


