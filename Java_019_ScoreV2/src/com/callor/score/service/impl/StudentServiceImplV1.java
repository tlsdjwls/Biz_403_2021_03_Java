package com.callor.score.service.impl;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {
	protected List<StudentVO> studentList;
	protected String studentFile;
	protected final int 학번  = 0;
	protected final int 이름  = 1;
	protected final int 학년 = 2;
	protected final int  반 = 3;
	protected final int 주소  = 4;
	/*
	 * new StudentServiceImplV1() 생성자를 호출하여 객체를 생성하려고 하면
	 * 고정된 파일이름 ("src/com/callor/score/student.txt"); 를 사용하여
	 * 파일을 읽을 수 있도록 할 예정이다
	 * 
	 * 생성자에서는 new StudentServiceImplV1("파일명") 의 생성자
	 * method를 다시 호출하는 구조가 된다
	 * 
	 * 
	 */
      
	public StudentServiceImplV1() {
	// TODO Auto-generated constructor stub
		// 여기에서 다음의 생성자 메서드 를 또한번 호출
		// new StudentServiceImlV1( "src/com/callor/score/student.txt";) 
	this("src/com/callor/score/student.txt");
	}
	public StudentServiceImplV1(String fileName) {
		studentList = new ArrayList<StudentVO>();
		this.studentFile = fileName;
		StudentVO stVO = new StudentVO();
	}
	
    @Override
    public void insertStudent() {
    // TODO Auto-generated method stub
    			
    }

    	 
	
     // student.txt 파일에서 학생의 정보를 읽어 가져오기
	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
       FileReader fileReader  = null ;
       BufferedReader buffer = null;
       
       try {
		fileReader = new FileReader(this.studentFile);
		buffer = new BufferedReader(fileReader);
		
		while(true) {
			
			String reader = buffer.readLine();
			// 파일로 부터 읽은값이 null
			// EOF(End of File) 에 다다랐다
			if(reader == null) break;
			
			String[] sts = reader.split(":");
			StudentVO vo = new StudentVO();
			vo.setNum(sts[학번]);
			vo.setName(sts[이름]);
			vo.setDept(sts[학년]);
			vo.setGrade(sts[반]);
			vo.setAddress(sts[주소]);
			
		}
		buffer.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO 파라메터(미터) 로 전달하기
		// 1 번 코드
	   StudentVO vo = null;
	   int nSize = studentList.size();
	   for(int i = 0 ; i < nSize ; i++) {
		   StudentVO Svo = studentList.get(i);
		   if(Svo.getNum().equals(num)) {
			   return Svo;
		   }
	   }
	  
	   // 2번코드
	   // 새로운 for, forEach
	 for(StudentVO vo1 : studentList) {
		 if(vo1.getNum().equals(num)) return vo1;
	 }
	   return null;	
		
		
		
		
		
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
      
      System.out.println("=".repeat(80));
      System.out.println("학번\t이름\t학과\t학년\t주소");
      System.out.println("-".repeat(80));
      
      // 배열을 사용하여 for() 반복문을 구현할때는 배열.length 속성을
      // 직접 반복문의 조건으로 설정한다  
      // i < 배열.length  
      /*
       *  List  객체는 특성상 수시로 데이터의 개수가 변경된다 
       *  List 에 담긴 개수를 알려주는 size() method 는 호출될때마다
       *  List 에 담긴 데이터 개수를 다시 헤아리는 코드가 실행된다
       *  
       *  for() 반복문 내에서 i < list.size () 코드를 사용하면
       *  for() 반복문이 반복되는 동안 계속해서 개수를 해아리게 된다
       *  
       *  데이터의 개수가 몇개 안될때는 큰 문제가 없지만 데이터개수가 많아지면
       *  그만큼 성능이  떨어지게 된다
       *  
       *  list 전체를 for() 반복문을 사용하여 순회할때는 먼저 size() 값을 int 형 변수에
       *  담아놓고 시작하자.
       */
      
      
      int nSize = studentList.size();
      for(int i = 0 ; i < nSize; i++) {
    	StudentVO vo = studentList.get(i);
    	
    	System.out.println(vo.getNum() + "\t");
    	System.out.println(vo.getName() + "\t");
    	System.out.println(vo.getDept() + "\t");
    	System.out.println(vo.getGrade() + "\t");
    	System.out.println(vo.getAddress() + "\n");
     }
      System.out.println("=".repeat(80));
	}

}
