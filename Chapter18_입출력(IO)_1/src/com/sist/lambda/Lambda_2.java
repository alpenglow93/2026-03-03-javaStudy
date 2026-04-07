package com.sist.lambda;

// null 대신 사용 : Optional => map, filter
// orElse("이미지 없음.jpg") / ifPresent
// Optional + stream(데이터가 여러개인 경우)

import java.util.*;
import javax.swing.*;

public class Lambda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog("이름 입력:");	// 취소 버튼 누르면 null, 아무것도 입력하지 않고 확인하면 공백
		//System.out.println(input);
//		String result = Optional.ofNullable(input)	// input 값이 null일 수도 있다
//								.filter(s->s.length()>3)	// if 3글자 이상
//								.map(s->s.toUpperCase())	// 대문자로 변환
//								.orElse("입력값 없음");		// null이면 해당 내용 출력
//		System.out.println(result);
		
		if(input!=null)	// null을 비교시에는 ==
		{
			if(input.length()>3)
			{
				input = input.toUpperCase();
				System.out.println(input);
			}
			else
			{
				System.out.println(input);
			}
		}
		else
		{
			System.out.println("입력값 없음");
		}
		

	}

}
