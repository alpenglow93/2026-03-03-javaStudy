package com.sist.lang;
// Date => 현재 날짜 읽어온다 => 제어 (Calendar)
// 534page

import java.text.SimpleDateFormat;
import java.util.*;

public class Date_Time_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		// => 오라클
		
		/*
		 * 	년도	=> yy / yyyy 	==> 26 / 2026
		 * 	월	=> MM / M 		==> 03 / 3	(분m과 구분하기 위해 대문자로 작성)
		 * 	일	=> dd / d
		 * 
		 * 	시간	=> hh / h
		 * 	분	=> mm / m	
		 * 	초	=> ss / s
		 * 
		 */

	}

}
