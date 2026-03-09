/*
 * 	피연산자가 1개
 * 	증감연산자
 * 		= 전치연산자 : ++a;		=> 증가를 먼저하고 나중에 다른 연산 수행
 * 		= 후치연산자 : a++;		=> 다른 연산을 먼저 수행하고 나중에 증가
 * 
 * 	정수/문자만 사용이 가능한 연산자이다. (실수, 문자열에서는 사용이 불가능)
 * 	반복문에서 주로 사용
 * 	게임에서 자동 이동등을 사용할때도 많이 사용
 * 
 * int a = 10;
 * int b = a++;	// 이 경우 a는 11, b는 10 => 대입연산자가 먼저 작동하고 a증감을 수행
 * 
 * int a = 10;
 * int b = ++a;	// 이 경우는 a = 11, b = 11 => 증감을 먼저 수행하고 대입
 * 
 * -------------------------- 이 이하는 언어마다 작동이 달라질 수 있음
 * 
 * int a = 10;
 * int b = a++ + a++;	// a는 12, b는 10과 11이 더해져서 21이 됨
 * 
 * int a = 10;
 * int b = ++a + ++a;	// 11 + 12 = 23
 * 
 */
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a= 10;
//		int b = a++;
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		
//		int c = 10;
//		int d = ++c;
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
//		
//		int e = 10;
//		int f = e++ + e++;
//		System.out.println("e = " + e);
//		System.out.println("f = " + f);
//		
//		int g = 10;
//		int h = ++g + ++g;
//		System.out.println("g = " + g);
//		System.out.println("h = " + h);
		
		int a = 10;
		int b = a--;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int c = 10;
		int d = --c;
		System.out.println("c = " + c);
		System.out.println("d = " + d);

		int e = 10;
		e++;
		e++;
		e++;
		e--;
		--e;
		e--;
		System.out.println(e);
	}

}
