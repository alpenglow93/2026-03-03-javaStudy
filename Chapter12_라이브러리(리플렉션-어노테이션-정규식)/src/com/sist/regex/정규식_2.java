package com.sist.regex;
// 0개 이상 반복 => *
public class 정규식_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello".matches("H*.llo"));	// H가 반복이 될 수도 있고 그 다음에 한 글자가 더 있고
		System.out.println("ho".matches("h.*o"));	// h 이후 임의의 글자가 없을수도 있고 반복될수도 있고 (알파벳 여러개가 들어갈수도 있음hekfjdo)
		System.out.println("hheeeeee".matches("h*e*"));
		System.out.println("hello".matches(".*"));
		System.out.println("".matches(".*"));

	}

}
