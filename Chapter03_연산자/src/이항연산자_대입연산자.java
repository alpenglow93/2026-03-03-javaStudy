/*
 * 	대입연산자(=) : 우선순위가 마지막
 * 		int a = 10;
 * 
 * 	복합대입연산자
 * 		+=, -=, *=, /=, >>=, <<=, &=, |=, ^=
 * 
 * 	대입연산자 특징?
 * 	1. 형변환
 * 		int a = 'A' ==> a = 65
 * 		double d = 10 ==> d 10.0
 * 		왼쪽>=오른쪽
 * 		---------
 * 		int a = 10L;	<< 오류
 * 			=> long l = 10L
 * 			=> int a = (int)10L	<< 둘 중 하나 방법을 선택해야함
 * 	2. 초기값 / 계산 결과값 저장
 * 		int a = 10;
 * 		int b = 20;
 * 		int c = a+b;
 * 	3. 기본 (초기값)
 * 		int a = 0;
 * 		double d = 0.0
 * 		char c = ' ';	//''=null << 공백 안 주면 null 취급이라 에러
 * 		float f = 0.0f;
 * 		long l = 0L;
 * ---------------------------------------------------------------
 * 
 * 	복합대입연산자
 * 	+= : a += 1; a = a + 1;
 * 	-= : a -= 1; a = a - 1;
 * 	
 * 
 * 
 */
public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int c = 65;
//		//int d = (int)(Math.random()*26)+65;	// int가 들어가면 오류 발생
//		int d = (char)((int)(Math.random()*26)+65);
//		// 연산처리 결과 => 대입
//		System.out.println(d);
//		//char cc='';
		
		int sum = 0;
		int even = 0;
		int odd = 0;
		
		for(int i = 1 ; i <= 100; i++)
		{
			if(i%2 == 0)
				even+=i;	// even = even + i;
			else
				odd+=i;		// odd = odd + i;
			sum += i;	// 1~100정수를 누적
		}
		
		System.out.println("짝수합: " + even);
		System.out.println("홀수합: " + odd);
		System.out.println("총합: " + sum);
		
		String alpha = "";
		for(char c = 'A'; c<= 'Z'; c++)
		{
			alpha += c;	// alpha = alpha + c;
		}
		System.out.println(alpha);

	}

}
