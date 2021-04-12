package com.callor.app.service;

public interface ScoreService {
/* interface
 * 클래스를 만들기위한 설계도 (Protorype) 역활수행
 * 팀 프로젝트에서 여러팀원이 동일한 클래스를 만들때
 * 같은 연산을 수행하는 클래스를 만들때, method 의
 * 이름을 통일하여 이후에 프로젝트를 통합할때 발생하는
 * 오류를 최소화 하기 위함이다 
 * 
 *  interface 를 inplements 한 클래스는 interface에 저장된
 *  method 를 반드시 구현해야 한다
 *  
 *  interface 와 관련된 클래스를 사용하여 객체를 생성한후 method 를 호출하는 
 *  코드를 통해 연산을 수행하는 측에서는 아직 method 코드가 구현이 덜 되었다라도
 *  자신의 코드를 진행할수 있도록 한다.
 */
	public void selectMenu();
	public void inputScore();
	public void printScore();
	public void saveScore();
	
	public void readScore();
	
	public Integer checkScore();
	Integer inputScore(String strName);
	
	
}
