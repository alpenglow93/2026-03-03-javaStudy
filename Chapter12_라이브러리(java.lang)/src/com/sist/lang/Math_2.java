package com.sist.lang;
import static java.lang.Math.*;	// static import 하면 ceil() 같이 앞에 클래스명을 붙이지 않아도 됨
import static java.lang.String.*;
// 클래스명 없이 사용이 가능하다 => static 메소드인 경우에만 가능
// Math => static이라 사용하기 편리하다
// ceil / random => 오라클에 존재 (Math)
// toString / hashCode / equals / clone / getClass (Object)
public class Math_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println((int)(ceil(10/3)));
		System.out.println(random());
		
		System.out.println(valueOf(10));

	}

}
