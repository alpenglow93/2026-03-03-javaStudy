package com.sist.stream;
// FileOutputStream // 쓰기
// close() , write()

import java.io.*;

public class Stream_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try 
		{
			// 저장 폴더
			File dir = new File("c:\\java_data");			
			if(!dir.exists())
			{
				dir.mkdir();
			}
			
			File file = new File("c:\\java_data\\sawon.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			// 자바응용프로그램 ===== sawon.txt : 읽기
			fis = new FileInputStream(file);
			
			// 자바응용프로그램 ===== sawon.txt : 쓰기
//			fos = new FileOutputStream(file, true);	// true를 하면 append 모드, 그게 아니면 덮어쓴다(w모드)
//			
////			fos.write('H');	// byte단위로 받기 때문에 한 글자씩 넣어줘야한다
////			fos.write('e');
////			fos.write('l');
////			fos.write('l');
////			fos.write('o');
//			
//			String info = "홍길동|남자|개발부|서울|대리|4000\n";
//			fos.write(info.getBytes());	// String => byte[] : getBytes()
			//			----- byte
			// 클라이언트 ------- 서버
			
//			System.out.println("파일 저장 완료!!");
			
			int i = 0;
			while((i=fis.read())!=-1)	// 한글이 깨져 읽어진다
			{
				System.out.print((char)i);
			}
			
			
		} catch (Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			try 
			{
				fis.close();
				fos.close();
				
			} catch (Exception ex) {}
		}

	}

}
