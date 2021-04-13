package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.service.ScoreService;
import com.callor.score.serviceimpl.ScoreServiceImplV1;

public class Const_02 {
 
	public static void main(String[] args) {
	
	 	ScoreService ssVi = new ScoreServiceImplV1();
    	/*
    	 * List 인터페이스로 3개의 객체를 선언하고 
    	 * 각각을 Array, Linked, Vector 클래스를 사용하여 생성하였다
    	 * 
    	 */
    	List<String> strList1 = new ArrayList<String>();
    	List<String> strList2 = new LinkedList<>();
    	List<String> strList3 = new Vector<>();
    	
    	strList1.add("대한민국");
    	strList1.add("우리나라");
    	
    	strList2.add("3 * 4");
    	strList2.add("3 / 4");
    	
    	strList3.add("홍길동");
    	strList3.add("이몽룡");
    	strList3.add("성춘향");
    	
    	// List 에 저장된 내용을 출력하는 method 호출하기
    	list(strList1);
    	list(strList2);
    	list(strList3);
    	
    	}
    
    public static void list(List<String>strList) {
    	int nSize = strList.size();
    	
}
	
}
