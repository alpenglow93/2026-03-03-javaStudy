package com.sist.customer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * 	String
 * 		= equals => 로그인 / 아이디 중복 체크 / 비밀번호
 * 				=> 상세보기
 * 		= contains => 검색
 * 		= length => 입력 여부 확인
 * 		= startsWith/endsWith => 써제스트(자동완성기) 
 * 			=> 자음 검색
 * 		= 분리 : split => String[]
 * 				util => StringTokenizer
 * 		= 데이터형 => 문자열 => valueOf
 * 		= 데이터베이스 / 파일 => toUpperCase
 * 		= 입력상에서 공백 제거 : trim()
 * 		= 문자 위치 : indexOf / lastIndexOf
 * 	Math
 * 		= random()
 * 		= ceil() : 올림
 * 	Object
 * 		= toString() : 객체를 문자열로 변환
 * 		= clone() : 복제
 * 		= finalize() : 소멸자
 * 		= equals / hashCode
 * 		= getClass
 * 	--------------------------------------------
 * 	StringBuffer / StringBuilder => 문자열 결합
 * 	Wrapper : 데이터형 => 클래스
 * 	------- 문자열 => 정수, 실수, 논리형 ... 변환
 * 	AutoBoxing / UnBoxing
 * 	System
 * 	-----------------------------------------
 * 	java.util / java.text
 * 	=> java.io / java.net / java.sql
 * 
 */

public class CustomerMainFrame extends JFrame implements ActionListener {
	
	CardLayout card = new CardLayout();
	Login login = new Login();	
	CustomerDataCollection cdc = new CustomerDataCollection();
	
	CustomerList cList = new CustomerList();
	CustomerFind cFind = new CustomerFind();
	
	JMenuItem list = new JMenuItem("사원 목록");
	JMenuItem find = new JMenuItem("사원 검색");
	JMenuItem exit = new JMenuItem("종료");
	
	public CustomerMainFrame()
	{
		JMenu menu = new JMenu("메뉴");	// 상단 메뉴
		menu.add(list);
		menu.add(find);
		menu.addSeparator();	// 구분자		
		menu.add(exit);
		JMenuBar bar = new JMenuBar();
		bar.add(menu);
		
		setJMenuBar(bar);
		
		setLayout(card);
		add("cList", cList);	
		add("cFind", cFind);
		setSize(950, 700);
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// 창을 끄면 작업관리자 상에서 메모리를 끔
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		list.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		} catch(Exception ex) {}
		
		new CustomerMainFrame();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==login.b2)
		{
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다!!");
			System.exit(0);
		}
		else if(e.getSource()==login.b1)
		{
			// 로그인 버튼 클릭
			String id = login.tf.getText();
			// trim() : 좌우의 공백을 제거
			// length() : 문자의 갯수
			if(id.trim().length()<1)	// 입력이 안 됐을 경우
			{
				JOptionPane.showMessageDialog(this,  "아이디를 입력하세요");
				login.tf.requestFocus();
				return;	// 메로스 종료 => 처음부터 다시 입력 요청
			}
			
			//String pwd = login.pf.getPassword().toString();	// 이거나 아래나 둘 중 하나 (String 변환)
			String pwd = String.valueOf(login.pf.getPassword());
			// char[] => 문자열로 변환 => String.valueOf()
			if(pwd.trim().length()<1)	// 입력이 안 됐을 경우
			{
				JOptionPane.showMessageDialog(this,  "비밀번호를 입력하세요");
				login.pf.requestFocus();
				return;	// 메로스 종료 => 처음부터 다시 입력 요청
			}
			
			// 로그인 처리
			String res = cdc.isLogin(id, pwd);
			if(res.equals("NOID"))
			{
				JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다");
				login.tf.setText("");		// tf창 비우기
				login.pf.setText("");		// pf창 비우기
				login.tf.requestFocus();	// 아이디칸에 커서 올리기
			}
			else if(res.equals("NOPWD"))
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");

				login.pf.setText("");		// pf창 비우기
				login.pf.requestFocus();	// 비밀번호칸에 커서 올리기
			}
			else
			{
				login.setVisible(false);	// 로그인 성공하면 로그인창을 지우고
				String name = res.substring(res.indexOf("|")+1);
				setTitle(name+"님 로그인되었습니다");	// 상단 타이틀에 표시
				setVisible(true);			// 메인창 띄우기
			}
			/*
			 * 	1. equals
			 * 	2. split
			 * 	3. substring
			 * 	4. trim
			 * 	5. length
			 * 	6. indexOf
			 * 	7. valueOf
			 * 	---------------
			 * 	검색
			 * 	contains / startWith / toUpperCase
			 * 	=> compare
			 */
			
		}
		else if(e.getSource()==list)
		{
			card.show(getContentPane(), "cList");
		}
		else if(e.getSource()==find)
		{
			card.show(getContentPane(), "cFind");
		}
		else if(e.getSource()==exit)
		{
			dispose();		// 메모리 해제
			System.exit(0);	// 프로그램 종료
		}
		
	}

}
