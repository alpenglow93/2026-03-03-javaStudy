package com.sist.regex;
// ^ and $ => ^ 시작 , $ 끝
public class 정규식_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello".matches("^ho$"));	// 두글자 false
		System.out.println("hello".matches("^h.*o$"));
		System.out.println("hello".matches("^h.*"));	// h로 시작하는 모든 문자
		System.out.println("hello".matches(".*o$"));	// o로 끝나는 모든 문자
		// 오라클 => CSS

	}

}
