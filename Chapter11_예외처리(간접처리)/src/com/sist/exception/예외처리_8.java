package com.sist.exception;

// 사용자 정의 예외처리

class MyException extends Exception
{
	private String msg;
	public MyException(String msg)
	{
		super(msg);
	}
}

/*
 * 	전세계 IP 긁어오기
 * 	[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3} => 0-9까지의 숫자가 1~3자리
 * 	
 */

public class 예외처리_8 {

	// 생성자 new
	// catch => throw
	// 우선 => if~else => 포함여부 정규식
	// [0-9] 숫자포함 [가-힣] 한글포함 [A-Za-z] 영문포함
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = 'A';
		try {
			if(c>='A' && c <='Z')
			{
				throw new MyException("소문자만 입력이 가능합니다");
			}
			
		} catch (MyException e) {
			// TODO: handle exception
			
			System.out.println(e.getMessage());
		}

	}

}
