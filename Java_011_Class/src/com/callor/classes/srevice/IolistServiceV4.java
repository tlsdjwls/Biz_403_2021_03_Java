package com.callor.classes.srevice;

import com.callor.classes.model.IolistVO;

public class IolistServiceV4 extends IolistServiceV1{

	@Override
	public void input() {
		
		String pname = null;
		while(true) {
		System.out.print("상품명 >> ");
		pname = scan.next();
		if(pname.equals("QUIT")) {
		return;
		}else if(pname.equals("")) {
		System.out.println("상품명은 반드시 입력하세요");
			continue;
		 }
			break;
	}
		
		System.out.println("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();
		
		System.out.print("거래처명 >> ");
		String dname= scan.next();
		
		System.out.println("매입매출 >> ");
		String inout = scan.next();
		
		System.out.println("수량 >> ");
		String qty = scan.next();
		
		Integer iprice = this.inputPrice("매입");
		if(iprice == null) {
			return;
		}
		Integer oprice = this.inputPrice("매출");
		if(oprice == null) {
			return;
		}
	}
	     
	private Integer inputPrice(String title) {
		
		while(true) {
			
			System.out.println(title + " 단가를 입력하세요");
			System.out.println(title + " 단가는 0 이상 입력하세요");
			System.out.println("-1을 입력하면 입력을 중단합니다");
			System.out.print(title + "단가 >> ");
			Integer price = scan.nextInt();
			if(price == -1) {
				return null;
			}else if(price < 0) {
				System.out.println(title + " 단가는 0 이상 입력하세요");
			}else {
				return price;
			}
		} 
	}

	
}
