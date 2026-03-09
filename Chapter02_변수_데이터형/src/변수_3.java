/*
 * 	byte / long => 정수
 * 		byte: -128~127
 * 		long: 큰 데이터값을 사용하는 경우 사용 => 금융권/빅데이터
 * 
 * 	=> int / long
 * 		숫자 뒤에 L이 붙어있으면 long형 숫자 (대소문자 여부는 상관없음)
 * 
 * 
 * 	데이터형
 * 		= 기본형 : 자바에서 제공하는 데이터형
 * 		= 참조형 : 사용자 정의 (class)
 * 
 * 		큰 데이터형에 작은 데이터형 대입 (O)
 * 		작은 데이터형에 큰 데이터형 대입 (X)
 * 
 * 					  4byte  8byte  4byte  8byte
 * 		byte < short < int < long < float < double
 * 				char
 * 			=> 실수와 정수간에서는 바이트 크기로 비교하는게 아니고 수표현으로 비교함
 * 
 * 		실수
 * 			float (4byte)	10.5f (실수 표현에 f를 붙이면 float)
 * 			double (8byte) - default (실수 표현에 아무것도 없으면 double)
 * 
 */
public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = Byte.MIN_VALUE;
		byte b2 = Byte.MAX_VALUE;
		
		System.out.println("byte 범위: " + b1 + " ~ " + b2);
		
		long l1 = Long.MIN_VALUE;
		long l2 = Long.MAX_VALUE;

		System.out.println("long 범위: " + l1 + " ~ " + l2);
		
		short s1 = Short.MIN_VALUE;
		short s2 = Short.MAX_VALUE;
		
		System.out.println("short 범위: " + s1 + " ~ " + s2);
		
		int i1 = Integer.MIN_VALUE;
		int i2 = Integer.MAX_VALUE;
		
		System.out.println("int 범위: " + i1 + " ~ " + i2);
		
		//double d = 10.5f; // double이 float 보다 크니까 대입 가능
		//float f = 10.5;	// float이 double 보다 작아서 대입 불가능
		//float f = (float)10.5; // 위 처럼 쓰고 싶으면 이렇게 형변환을 해줘야함 (강제형변환)
		
	}

}
