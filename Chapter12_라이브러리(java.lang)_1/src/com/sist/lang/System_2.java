package com.sist.lang;

import java.io.IOException;

public class System_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.print("1' 정수 입력: ");
			int num1 = System.in.read();
			// => 키 번호 => '1' => 49 => -48('0')
			//System.out.println("num = " + (num-'0'));
			System.in.read();	// 엔터
			System.out.print("2' 정수 입력: ");
			int num2 = System.in.read();
			System.in.read();	// 엔터
			//System.out.println(num2);
//			System.out.print("연산자 입력(+,-,*,/): ");
//			int op = System.in.read();
//			System.in.read();
//			System.out.println(op);
			// System.in.read() : 사용빈도가 거의 없다
			// Scanner / BufferedReader
			
		} catch (IOException e) {}

	}

}
