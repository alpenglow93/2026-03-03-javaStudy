/*
 * 	프로그램 순서
 * 		데이터 저장 => 데이터 가공 => 화면출력
 * 
 * 		데이터 저장
 * 		- 변수 : 데이터 한 개 저장
 * 		- 배열 : 같은 데이터 여러개 저장
 * 		- 클래스 : 다른 데이터 여러개 저장
 * 				=> 사용자 정의 데이터
 * 
 * 		byte : -128~127
 * 		int : -21억4천~21억4천
 * 
 * 		double : 정밀도 소수점이하 15자리
 * 
 * 		char : 0~65535 => 멀티바이트 (유니코드) => UTF-8
 * 
 * 		문자열 : char 여러개를 묶어서 사용
 * 		String : char[] => 기능을 가지고 있다
 * 			*** 웹/네트워크는 모든 데이터가 문자열이다
 *
 *		제어문
 *			조건문
 *				= 단일조건문
 *					if(조건)
 *					{
 *						실행문장 => 조건 true일때만 수행
 *						=> 오류처리 => 사용자가 잘못된 입력
 *						유효성 검사
 *					}
 *				= 선택조건문
 *					if(조건)
 *					{
 *						조건 true
 *					}
 *					else
 *					{
 *						조건 false
 *					}
 *					// 웹 로그인 여부 / 관리자, 사용자...
 *					일반 프로그램은 건너뛴다
 *					=> 웹은 화면을 유지해야하기 때문에 값을 계속 전송
 *					=> HTML은 UI => 기능첨부(자바) ==> JSP (ThymeLeaf)
 *							=> React 변환, VueJS => HTML 기반
 *				= 다중조건문
 *					=> 한 개의 조건만 수행
 *					if(조건)
 *					{
 *						true => 처리하고 종료
 *						false
 *					}
 *					else if(조건)
 *					{
 *					}
 *					...
 *					else
 *					{
 *						조건이 없는 경우에 처리
 *					}
 *			선택문
 *				= switch => 다중 조건문을 단순화
 *			반복문
 *				= for : 어디에서 어디까지 : 반복횟수 지정
 *						for(초기값;조건식;증감식)
 *							실행문장 ==> 조건이 fasle면 종료
 *				= while : 반복횟수가 없는 경우 : 데이터베이스 / 파일
 *						초기값
 *						while(조건식)
 *						{
 *							실행문장
 *							증감식;
 *						}
 *				= do~while
 *						초기값
 *						do
 *						{
 *							실행문장
 *							증감식
 *						} while(조건식);
 *			반복제어문
 *				= break : switch, 반복문 => 제어문을 종료
 *				= continue : 반복문안에서만 사용
 *							특정 부분을 제외하고 처리
 * 				
 * 
 */
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class 정리1_4 extends JFrame implements KeyListener {
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_D:
			//System.out.println("ddd");
			gv.x+=5;
			if(gv.x>800)
				gv.x = 0;
			gv.repaint();			
			break;
			
		case KeyEvent.VK_A:
			gv.x-=5;
			if(gv.x<0)
				gv.x = 800;
			gv.repaint();
			break;

		default:
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	GameView gv = new GameView();
	public 정리1_4()
	{
		add("Center", gv);
		setSize(800, 600);
		setVisible(true);
		addKeyListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 정리1_4();

	}

}
