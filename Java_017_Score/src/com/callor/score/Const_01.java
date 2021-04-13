package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.service.ScoreService;
import com.callor.score.serviceimpl.ScoreServiceImplV1;

public class Const_01 {

	public static void main(String[] args) {

		ScoreService ssVi = new ScoreServiceImplV1();
		/*
		 * List 인터페이스로 3개의 객체를 선언하고 각각을 Array, Linked, Vector 클래스를 사용하여 생성하였다
		 * 
		 * strList1, strList2 , strList3 는 각각 ArrayList , LinkedList, Vector type으로 데이터
		 * 형이 다르다
		 * 
		 * 하지만 List interface type 으로 선언되었기 때문에 method 등의 연산을 공용으로 사용할수 있다
		 * 
		 * 이러한 성질을 (클래스)의 다형성 이라고 한다.
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
		list1(strList1);
		list2(strList2);
		list3(strList3);

	}

	// ArrayList 의 내용전체를 Console 에 출력하기
	/*
	 * 여기에 있는 세개의 method 는 각각 ArrayList, LinkdList , Vector type 의 매개변수를 전달받아 연산을
	 * 수행한다
	 * 
	 * 세개의 method는 하는일이 똑같은 코드이지만 매개변수 type이 달라서 어쩔수 없이 중복하는 코드가 된다
	 */
	    public static void list1(List<String>strList) {
    	int nSize = strList.size();
    	for(int i = 0 ; i < nSize ; i++) {
    	System.out.println(strList.get(i));
    	}
	    }
	public static void list2(List<String> LinkedList) {
		int nSize = LinkedList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.println(LinkedList.get(i));
		}
	}

	public static void list3(List<String> Vector) {
		int nSize = Vector.size();
		for (int i = 0; i < nSize; i++) {
			System.out.println(Vector.get(i));

		}
	}
}