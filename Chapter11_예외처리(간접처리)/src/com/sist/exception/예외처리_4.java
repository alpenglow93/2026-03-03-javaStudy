package com.sist.exception;
// finally => return 
public class 예외처리_4 {

	public static int test()
	{
		try {
			int a = 10/0;
			return 1;
		} catch (Exception e)	// Throwable ex
		{
			return 2;
		}
		finally
		{
			//return 3;	// finally 에서 return을 사용하면 finally를 무조건 수행하기 때문에 어떤 경우에도 finally의 return이 수행됨
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(test());

	}

}
