package com.callor.classes.srevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.IolistVO;

/*
 *  IolistVo 는 1개의 데이터를 담을 수 있도록 설계하였다
 *  실제 프로젝트에서는 1개의 데이터만 있는 경우는 없다
 *  
 *  여러개의 데이터를 묶음으로 연산을 수행해야 한다.
 *  데이터의 묶음을 처리할때는 보통 배열을 많이 사용한다
 *  하지만 배열은 그 구조상 사용이 다소 불편할때가 많다 
 *  java 에서는 배열을 사용해야 하는 프로젝트로서 List 클래스를 사용한
 *  객체를 생성하여 진행을 한다
 */
public class IolistServiceV1 {
	/*
	 * 매입매출 데이터들을 사용하여 연산을 수행할탠데 매입매출 데이터들의 묶음을 List 형 객체 사용하겠다
	 * 
	 * List 형 객체에 포함된 (개별)데이터는 IolistVO 형으로 사용하겠다
	 * 
	 * iolist를 private으로 선언한 이유 낱개 데이터는 IolistVO 클래스 형으로 사용하고 그 데이터들을 묶어서 List 형으로
	 * 연산 수행을 하겠다 라는 선언
	 * 혹시 외부에서 iolist 데이터에 접근하여 값을 저장하는 일을 방지하기 위함이다
	 * V1 클래스를 상속하여 사용할 예정이라면 protected 로 선언을 한다
	 * 
	 */
	// TODO 맴버변수 선언하기

	
	protected List<IolistVO> iolist;
	protected Scanner scan;
	
	public IolistServiceV1(){
		iolist = new ArrayList<IolistVO>();
		scan = new Scanner(System.in);
	}
	// public 으로 선언된 method 는 객체 .method() 형식으로 호출이 가능한 method 
	// return type 이 명확히 결정되지 않았을때는 void 형으로 작성을 한다
	 public void selectMenu() {
		 // TODO 매뉴 선택하기
		 while(true) {
			 System.out.println("=".repeat(50));
				System.out.println("KMS 쇼핑몰 업무관리");
				System.out.println("-".repeat(50));
				System.out.println("1.매입매출 등록");
				System.out.println("2.매입매출 리스트 출력");
				System.out.println("0.업무종료");
				System.out.println("-".repeat(50));
				System.out.println("업무선택 >> ");
				int intMenu = scan.nextInt();
				if(intMenu == 0) {
					break;
				}else if(intMenu == 1) {
					this.input();
				}else if(intMenu == 2) {
					this.printAllList();
				
			 
				}
				
		 }// end while
		System.out.println("업무 종료!!! 신난다 퇴근이다.");
		
      		
		
	}
	public void input() {
		// TODO 업무 매뉴 쓰기
		System.out.println("=======================");
		System.out.println("매입 매출 등록");
		System.out.println("-----------------------");
		System.out.print("상품명 >> ");
		String pname = scan.next();
		
		System.out.println("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();
		
		System.out.print("거래처명 >> ");
		String dname= scan.next();
		
		System.out.println("매입매출 >> ");
		String inout = scan.next();
		
		System.out.println("수량 >> ");
		String qty = scan.next();
		
		System.out.println("매입단가 >> ");
		String iprice = scan.next();
		
		System.out.println("매출단가 >> ");
		String  oprice= scan.next();
		
		IolistVO iolistVO = new IolistVO();
		iolistVO.getPname();
		iolistVO.getDate();
		iolistVO.getDname();
		iolistVO.getInout();
		iolistVO.getQty();
		iolistVO.getIprice();
		iolistVO.getOprice();
	  
		
		// 입력된 매입매출 데이터를 데이터 리스트에 담기
		
		this.printIolist(iolistVO);
		} //end input
	public void printAllList() {
		// TODO 저장된 업무 불러오기
		System.out.println("=".repeat(50));
		System.out.println("매입매출 리스트");
        System.out.println("-".repeat(50));
        System.out.println("상품명\t거래일\t거래처\t구분\t"
        		+ "수량\t매입단가\t메출단가\t");
        
		for(int i = 0 ; i < iolist.size(); i++) {
			// iolistVo vo = iolist[i]
			IolistVO vo = iolist.get(i);
			this.printIolist(vo);
		}
		System.out.println("=".repeat(50));
	}
	// TODO 한개 데이터 출력하기
	public void printIolist(IolistVO vo) {
		System.out.print(vo.getPname() + "\t");
		System.out.print(vo.getDate() + "\t");
		System.out.print(vo.getDname() + "\t");
		System.out.print(vo.getInout() + "\t");
		System.out.print(vo.getQty() + "\t");
		System.out.print(vo.getIprice() + "\t");
		System.out.print(vo.getOprice() + "\t");
	}
	// TODO 책깔피 나타내는 주석
}
