package com.sist.lang;
// String과 동일 => append => 문자열 결합

import java.io.*;

public class StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			String foodData = "";
			FileReader fr = new FileReader("C:\\javaDev\\food.txt");
			/*
			 * 	FileReader : 문자 스트림 => 한글이 포함된 파일 읽기
			 * 	FileInputStream : 바이트 스트림 (1바이트씩 읽어와 한글이 깨짐) => 다운로드 업로드
			 */
			//StringBuffer sb = new StringBuffer();
			StringBuilder sb = new StringBuilder();
			int i = 0;	// 한 글자씩 읽어온다 => 정수형으로 읽어온다
			long start = System.currentTimeMillis();
			while((i=fr.read()) != -1)	// -1 : EOF End Of File
			{
				//foodData += (char)i;
				sb.append((char)i);
			}
			fr.close();
			long end = System.currentTimeMillis();
			// 데이터 출력
			//System.out.println(foodData);
			System.out.println(sb.toString());
			System.out.println("걸린 시간: " + (end-start)+"MS");
			
		} catch (Exception ex) {}

	}

}
