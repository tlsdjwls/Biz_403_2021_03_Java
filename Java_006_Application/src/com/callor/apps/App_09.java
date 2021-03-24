package com.callor.apps;

import java.util.Random;

public class App_09 {

	public static void main(String[] args) {
		  String[] strNames= {"홍길동",
				            "이몽룡",
				            "성춘향",
				            "장녹수",
				            "임꺽정"};
		  int[] intNum = new int[strNames.length];
		  int[] intKor = new int[ strNames.length];
		  int[] intEng = new int[ strNames.length];
		  int[] intMath = new int[ strNames.length];
		  
		  int[] intTotal = new int[ strNames.length];
		  float[] floatAvg = new float[strNames.length];
		  
		  Random rnd = new Random();
		  for(int i = 0 ; i < strNames.length ; i++) {
			 
			  intKor[i] = rnd.nextInt(51) + 50;
		      intEng[i] = rnd.nextInt(51) + 50;
			  intMath[i] = rnd.nextInt(51) + 50;
			  
		  }
		  for(int i = 0 ; i < strNames.length ; i++) {
			  intTotal[i] = intKor[i];
			  intTotal[i] += intEng[i];
			  intTotal[i] += intMath[i];
			  floatAvg[i] = (float)intTotal[i] / 3;
			  
		  }
		  System.out.println("빛 나라 고교 성적 처리");
		  System.out.println("========================================================");
		  System.out.println("학번\t이름\t국어\t영어\t수학\t 총점 :");
		  for(int i = 0 ; i < strNames.length ; i++) {
			  System.out.printf("%3d\t",intNum[i]);
			  System.out.printf("%s\t",strNames);
			  
			  System.out.printf("3%d\t",intKor[i]);
			  System.out.printf("3%d\t",intEng[i]);
			  System.out.printf("3%d\t",intMath[i]);
			  
			  System.out.printf("5%d\t",intTotal[i]);
			  System.out.printf("3.2%f\t",floatAvg[i]);
		  }
		}
		
	}

