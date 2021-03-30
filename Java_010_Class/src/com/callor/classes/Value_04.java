package com.callor.classes;

public class Value_04 {

	public static void main(String[] args) {
		System.out.println(0/3);S
		Integer result = divid(30,40);
		result = divid(30,0);
		if(result == null) {
		  System.out.println(" 나눗셈을 수행할수 없음");
		  
		}else {
			System.out.println(result);
		}
		 	
		}
	
	private static Integer divid(int num1,int num2) {
		if(num2==0) {
			
		}return num1 / num2;
	/*
	 *  0과 0을 나눗셈 연산을 수행하면 문제가 발생한다
     *  divid() method 에 2개의 정수를 매개변수로 전달하고 
	 *  전달한 숫자가  0이아니면 나눗셈연산을 하여 return
	 *  하고 전달한 숫자가 한개라도 0이면 나눗셈 연산을 수행하도록 
	 *  null 값을 return 한다
	 */
	
	}
}