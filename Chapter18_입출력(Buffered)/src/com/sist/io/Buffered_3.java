package com.sist.io;
/*
 * 	FileInputStream fis = new FileInputStream("파일명"); // 파일 없으면 catch
 * 	=> 파일에 있는 데이터 읽기
 * 	FileOutputStream fos = new FileOutputStream("파일명"); // 파일이 없는 경우 자동으로 만들어서 써준다
 * 	=> 파일에 데이터를 쓰기
 * 
 * 	FileReader fr = new FileReader("파일명"); // 파일 없으면 catch
 * 	=> 파일에 있는 데이터 읽기
 * 	FileWriter fw = new FileWriter("파일명"); // 파일이 없는 경우 자동으로 만들어서 써준다
 * 	=> 파일에 데이터를 쓰기
 * 
 */
import java.io.*;

public class Buffered_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream("c:\\javaDev\\movie.txt");
//			int i = 0;
//			StringBuilder sb = new StringBuilder();
//			while((i=fis.read())!=-1)	// 파일 끝까지 읽어라
//			{
//				sb.append((char)i);
//			}
//			
//			System.out.println(sb.toString());
			
			long start = System.currentTimeMillis();
			// 수행 속도를 최적화
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));	// InpustStream을 Reader로 변환
			StringBuilder sb = new StringBuilder();
			while(true)
			{
				String msg = in.readLine();
				if(msg == null)	break;	// null 값일 경우가 파일의 끝
				sb.append(msg+"\n");
			}			
			long end = System.currentTimeMillis();
			System.out.println(sb.toString());
			System.out.println("수행시간: " + (end-start)+"MS");
			
		} catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
		finally
		{			
			try 
			{
				fis.close();				
			} catch (Exception ex) {}
		}

	}

}
