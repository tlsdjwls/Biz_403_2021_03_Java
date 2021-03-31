package com.callor.classes.srevice;

import com.callor.classes.model.IolistVO;

public class IolistServiceV2 extends IolistServiceV1{
 
	/*
	 *  V1 input  메서드를 재 정의 한다
	 *  매입단가, 매출단가는 반드시 0 이상이어야한다
	 *  유효성검사를 하도록 코드를 재 정의 한다
	 *  
	 */
    @Override
	public void input() {
		// TODO 매입매출 등록
    	
    	System.out.println("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();
		
		System.out.print("거래처명 >> ");
		String dname= scan.next();
		
		System.out.println("매입매출 >> ");
		String inout = scan.next();
		
		System.out.println("수량 >> ");
		String qty = scan.next();
		
		Integer iprice = 0;
		while(true) {
		// 매입단가와 매출단가는 0 이상만 입력한다
		// 매입단가가 0이상이면 다음 항목입력받도록
	    //while 문을 중단하고 매입단가가 0미만이면 계속하기
			
		System.out.println("매입단가 >>");
	    iprice = scan.nextInt();
		if(iprice < 0) {
			System.out.println("매입단가는 0이상일경우 입력하시오");
		}else {
			break;
		}
	}    
		Integer oprice = 0;		
		while(true) {
		System.out.println("매출단가 >> ");
		oprice = scan.nextInt();
		if(oprice < 0) {
			System.out.println("매출단가는 0 이상일경우 입력하시오");
		}else {
			break;
		}
	}
	 
		IolistVO vo = new IolistVO();
		vo.setPname(dname);
		vo.setDate(date);
		
		
	}
	
	

}
