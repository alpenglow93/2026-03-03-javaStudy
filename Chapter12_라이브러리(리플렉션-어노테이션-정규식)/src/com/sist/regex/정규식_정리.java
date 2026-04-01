package com.sist.regex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 	정규식은 문자의 형태 (패턴)을 만드는 과정
 * 	=> replaceAll / split
 * 	=> 기호
 * 		[] => 한 개의 문자
 * 			=> [a] / [abc] : a|b|c
 * 			=> 범위 => [a-z] / [A-Z] / [0-9] / [가-힣]
 * 			=> [a-zA-Z] => contains
 * 			=> ^[a-zA-Z] => startWith
 * 			=> [a-zA-Z]$ => endsWith
 * 		^, $ => 시작과 끝
 * 		+ : 1개 이상 	abc+ => c반복		(abc)+ => abc반복 
 * 		* : 0개 이상
 * 			<table>
 * 			  |
 * 			<caption>?
 * 			<tr>*
 * 			  |
 * 		-------------
 * 		|			|
 * 		th*			td*
 * 
 * 		. : 임의의 한글자 => 오라클 A___ ___K ...K A...
 * 		? : 0이나 1개
 * 		| : 선택
 * 		{n} => n번 반복 => 글자 갯수
 * 		{n,} => n번 이상 반복
 * 			a{3,} => aaa aaaa aaaaa aaaaaa ....
 * 		{n,m} => n~m 반복
 * 			a{2,4} => aa aaa aaaa
 * 		그룹 => (단어)
 * 		----------------- mathers => true/false
 * 
 */
public class 정규식_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String msg = "내 전화번호는 010-1234-5678이고 "
//					+ "회사 전화는 02-333-4566 입니다";
//		// 전화번호만 추출 (group1).(group2).().() 전체: group(1)
//		
//		String regex = "(\\d{2,3})-(\\d{3,4})-(\\d{4})";
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(msg);
//		
//		while(m.find())
//		{
//			System.out.println("전화번호: " + m.group());
//			System.out.println(m.start()+" "+m.end());	// 출력되는 값: 인덱스 번호
//			// 문자열의 인덱스 => 문자열은 0번부터
//		}
		/*
		 * 	Matcher
		 * 		matchers() : 전체 문자열에서 패턴과 일치 여부 => boolean
		 * 		find() : 부분 일치 (패턴 형식)
		 * 		group() : 찾는 문자열
		 * 		start() : 시작 인덱스
		 * 		end() : 끝 인덱스
		 * 		replaceAll() : 변환
		 * 
		 */
		
//		String msg = "비밀번호: 1234,또 다른 비밀번호: 567";
//		String regex = "\\d+";
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(msg);
//		while(m.find())
//		{
//			System.out.println("비밀번호: " + m.group());
//		}
		
//		String email = "test@sample.com";
//		String regex = "^[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]{2,}$";
//		boolean result = Pattern.matches(regex, email);
//		if(result)
//		{
//			System.out.println("이메일 형식입니다");
//		}
//		else
//		{
//			System.out.println("이메일 형식이 아닙니다");
//		}
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		System.out.println(today);
		//String regex = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		String regex = "(\\d{4})-(\\d{1,2})-(\\d{1,2})";
		// (211.238.124).(1)
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(today);
		if(m.find())
		{
			System.out.println("오늘 날짜: " + m.group());
			System.out.println("년도: " + m.group(1));
			System.out.println("월: " + m.group(2));
			System.out.println("일: " + m.group(3));
		}
		
		/*
		 * 	패턴
		 * 		Pattern.matchers => equals => 전체 문장
		 * 		Matcher.find() => contains
		 * 		=> 찾은 문자열 : group
		 * 		=> replaceAll()
		 * 		=> () => 그룹
		 * 		-------------------------------------
		 * 		--> 데이터셋 => 데이터사전
		 * 
		 * 	크롤링 : HTML / JavaScript(정규식)
		 * 	=> Youtube => 유료 (해킹)
		 * 	=> 무료 API Key
		 * 		
		 * 
		 */
		

	}

}
