package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// 1번 이상 반복 => + ==> \\+	\\*		+나 *자체를 찾기 위해서는 \\ 붙여주기
// 
public class 정규식_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hllo".matches("he+llo"));
		System.out.println("hello".matches("he+llo"));
		System.out.println("heeeeeeeeeeello".matches("he+llo"));	// e가 한번 이상 반복하고 있는지
		
		System.out.println("he".matches(".."));
		System.out.println("he".matches("h*."));
		System.out.println("he".matches("he*"));
		System.out.println("he".matches("h+e+"));
		
		// /watch\\?v=[^가-힣]+
		// 특수문자 / 알파벳 / 숫자
		
		
//		try 
//		{
//			Document doc =
//					Jsoup.connect("https://www.youtube.com/results?search_query=%ED%82%A4%ED%82%A4").get();
//			Pattern p = Pattern.compile("/watch\\?v=[^가-힣]+");
//			Matcher m = p.matcher(doc.toString());
//			while(m.find())
//			{
//				String s = m.group();
//				s = s.substring(s.indexOf("=")+1, s.indexOf("\""));
//				System.out.println(s);
//			}
//			
//		} catch (Exception ex) {}

	}

}
