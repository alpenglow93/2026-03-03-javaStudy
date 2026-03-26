package com.sist.inter;

import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

// 다중 상속 => 메소드명이 충돌이 안되게 => 윈도우

interface A
{
	public void aaa();
}

interface B
{
	public void bbb();
}

class C implements A, B, D
{

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
		System.out.println("bbb() Call...");
		
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
		System.out.println("aaa() Call...");
		
	}
	
}

interface D
{
	public void aaa();	// 메소드명이 동일할때 문제가 발생한다
	// class에 D를 상속해도 이미 AAA에 있는 aaa가 구현된걸로 D의 것도 구현됐다고 인식됨
}

public class 인터페이스_3 extends JFrame
//implements KeyListener, MouseListener, ActionListener, FocusListener, ItemListener, WindowListener, Runnable
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
