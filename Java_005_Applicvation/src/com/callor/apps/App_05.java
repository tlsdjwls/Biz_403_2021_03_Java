package com.callor.apps;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {
    
     Random rnd = new Random();
    
     int[] intKors = new int[5];
     int[] intEngs = new int[5];
     int[] intMaths = new int[5];
     int intTotal = 0;
     float floatAvg = 0;
     for(int i = 0 ; i < 5 ; i++) {
    	 intTotal =
    	 intKors[i] = rnd.nextInt(51) + 50;
         intEngs[i] = rnd.nextInt(51) + 50;
         intMaths[i] =rnd.nextInt(51) + 50;
         intTotal[i] = intKors[i];
         intTotal[i] = intEngs[i];
         intTotal[i] = intMaths[i];
         
         
      System.out.println("============================================");
      System.out.println("학번 \t 국어 \t 영어 \t 수학\t 총점 \t 평균");
      System.out.println("--------------------------------------------");
      System.out.println((i + 1)+"\t" );
      System.out.println(int);
      System.out.println("============================================");
      
      
      
     }
      /*
       *  5명의 학생의 3과 점수(국어 , 영어 , 수학)의 성적표를 만들기
       *  
       */
      
     
     } 
     }
     
        //과목 3가지를 학생수 만큼 배열을 선언
     int[] intKors = new int[5];
     int[] intEngs = new int[5];
     int[] intMaths = new int[5];
     
     intKors[0] = 88;
     intEngs[0] = 77;
     intMaths[0] = 88;
     
     // 가상의 점수를 생성하기
     for(int i = 0 ; i < 5 ; i++) {
    	 intKors[i] = rnd.nextInt(51) + 50;
    	 intEngs[i] = rnd.nextInt(51) + 50;
    	 intMaths[i] = rnd.nextInt(51) + 50;
    	 
     }
     //학생별로 총점과 평균을 계산하여
     //저장해두기
     int[] intTotal = new int[i];
     float[] floatAvg = new int[i];
     for(int = i = 0 ; i < 5 ; i++)
      intTotal[i] = intKors[i];
     intTotal[i] = intEngs[i];
     intTotal[i] = intMaths[i];
     
     
	}

}
