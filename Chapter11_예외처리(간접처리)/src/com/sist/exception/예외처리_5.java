package com.sist.exception;
/*
 * 	try-catch 기본 구조
 *	throws VS throw 차이
 *	finally 역할
 *	try-with-resource
 *
 *	예외 선언 => 예외 회피 => 다음에 호출시에 예외처리를 해야된다
 *							=> 예외 떠맡기기 : 예상만 한다
 *	=> 라이브러리에서 주로 사용
 *	=> 일반 개발자 => try~catch를 주로 사용
 *		=> try~catch : 80% , throws : 20%
 * 	=> 형식)
 * 		[접근지정어][제어어] 리턴형 메소드명(매개변수...) throws
 * 			Exception, NumberFormatException,...
 * 			-------------------------------------
 * 			순서가 없다 => 호출시에 예외처리후 사용
 * 			=> 기본 : throws Exception
 * 					throws Throwable
 * 		
 * 		void div(int a, int b) throws ArimethicException
 * 		{
 * 			System.out.println(a/b);
 * 		}
 * 
 * 		main()
 * 		{
 * 			div(10,0);	// 오류가 없다 - 0으로 나눈 Exception 은 선택사항이기 때문에
 *			// ArimethicException 대신 Exception을 줬다면 반드시 체크하고 넘어갔을것
 * 		}
 * 
 * 		======================
 * 		CheckedException		UnCheckedException
 * 			|						|
 * 		컴파일시에 검사 => 필수사항			=> 선택사항
 * 		(예외처리가 되어 있는지)
 * 		=> java.io / java.net
 * 			java.sql...
 * 		=> 예외처리 중에 가장 큰 클래스 사용
 * 			=> Throwable / Exception
 * 			throws => CheckedException
 *	
 * 
 */
public class 예외처리_5 {
	
	public static void div(int a, int b) throws Exception,
	ClassNotFoundException, InterruptedException
	{
		int c = a/b;
		System.out.println(c);
	}

	public static void main(String[] args) throws Throwable {	// 넘겨받는 곳에서 주는 예외보다 작은 범위를 써주면 호출받는 곳에서 처리하지 못하므로 에러
		// TODO Auto-generated method stub
		
		div(10,3);	// ArithmeticException 을 넘겨주면 예외처리는 선택사항 (UnCheck는 그래서 거의 안 넘겨줌)
		// Exception 을 넘겨주면 예외처리 강제됨
		// 직접 처리 => try~catch
		// 다음에 호출시 처리 => throws

	}

}
