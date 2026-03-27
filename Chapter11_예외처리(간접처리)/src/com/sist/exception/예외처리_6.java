package com.sist.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * 	String id,pwd,name,
 * 	int age
 * 	double ki
 * 	... ==> class로 묶는다
 * 
 */
public class 예외처리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 많이 발생하는 UnCheckedException
		// => NumberFormatException (UnChecked여도 예외처리를 확인해주는게 좋음)
			// 웹/윈도우/모바일 => 서버 데이터 전송 / 브라우저 전송 받기
			// => 모든 데이터 문자열
			// ?no=10	String no=request.getParameter("no")
				// 문자열로 들어오기 때문에 변환해줘야함 => 그렇기 때문에 NuberFormatException 자주 발생
		// NullPointerException
			// => 500에러 메세지
		// IllegalArgumentException // 매개변수값 다른 경우
		
		String image = null;
		// => IS NOT NULL
		try {
			System.out.println(image.length());	// catch절 수행
			
			System.out.println("Image를 브라우저에 출력");
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			
			System.out.println("이미지 없음을 보내라");
		}
		/*
		 * 	String page = request.getParameter("page");
		 * 	=> ?page=1
		 * 	if(page==null)
		 * 		page="1"
		 */
		
		//FileReader in = new FileReader("");	// FileReader에서 예외를 던져주기 때문에 예외처리하지 않으면 에러
		// FileNotFoundException
		
//		System.out.println("aaa");
//		System.out.println("aaa");
//		FileReader in;
//		try {
//			in = new FileReader("");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("aaa");
//		System.out.println("aaa");
//		System.out.println(in.read());

	}

}
