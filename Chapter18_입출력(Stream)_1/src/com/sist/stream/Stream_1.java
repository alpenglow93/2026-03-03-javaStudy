package com.sist.stream;
/*
 * 	IO => Input / Output
 * 			입력		출력
 * 		------------------- System.in / System.out
 * 							키보드 입력		명령프롬프트에 출력	==> 표준 입출력
 * 	=> 프로그램 외부 소스를 목적지의 데이터 정보 교환
 * 			 -------  ----
 *						| 프로그램에서 => 화면, 파일에 나가는 데이터 위치
 * 			  | 입력=>키보드,파일,네트워크에 들어오는 데이터
 * 	출발지 ----------------		-------------------
 * 	1. 키보드		입력스트림				출력스트림
 * 	2. 파일 -------------- 프로그램 -------------- 		도착지
 * 	3. 프로그램					데이터를 써서 보내는 객체	1. 모니터
 * 				데이터를 읽어오는 객체						2. 파일
 * 													3. 브라우저
 * 	스트림 : 응용프로그램(개발자)과 I/O객체를 연결해서 데이터를 이동하는 통료
 * 		=> 단방향으로 연결
 * 
 * 	스트림 클래스
 * 		입력스트림
 * 			1byte => 전송 : 바이트스트림
 * 			InputStream : interface (최상위)
 * 				| 구현된 클래스
 * 			**FileInputStream (파일)
 * 			**BufferedInputStream (메모리)
 * 			ObjectInputStream
 * 
 * 			2byte => 전송 : 문자스트림
 * 			Reader : interface (최상위)
 * 				| 구현된 클래스
 * 			**FileReader (파일)
 * 			**BufferedReader (메모리 => 키보드 입력)
 * 				=> 한줄씩 => 파일 읽기 / 외부 소스 읽기
 * 			(Reader에는 Object는 없다)
 * 
 * 		출력스트림
 * 			1byte : 바이트스트림
 * 			OutputStream : interface
 * 				|
 * 			**FileOutputStream (파일)
 * 			**BufferedOutputStream (메모리)
 * 			ObjectOutputStream
 * 
 * 			2byte : 문자스트림
 * 			Writer : interface
 * 				|
 * 			**FileWriter (파일 쓰기)
 * 			**BufferedWriter (메모리에 저장)
 * 			**PrintWriter
 * 		
 * 		1. FileInputStream : 파일 읽기
 * 							 다운로드, 파일 이동
 * 							 이미지, 동영상 ...
 * 							 변환 InputStreamReader
 * 									- 바이트스트림을 문자스트림으로 변환
 * 			: read() : 읽기 => 1글자씩 읽기 => byte 단위로 읽는다
 * 			: close() : 닫기
 * 			------------------ ChckedException (예외처리)
 * 	
 * 
 */

import java.io.*; 

public class Stream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		try 
		{
//			File file = new File("");
//			fis = new FileInputStream(file); // 파일을 넣어주거나
			fis = new FileInputStream(
							"C:\\Users\\sist5\\git\\java-study\\Chapter18_입출력(IO)_2\\src\\com\\sist\\io\\IO_1.java"
							);	 // 경로명을 넣어주거나
			BufferedReader br = new BufferedReader(new InputStreamReader(fis)); // InputStream을 Reader로 변경
			
//			// 파일읽기 시작
//			int i = 0; // 한글자씩 읽어오기 => 정수로 읽는다
//			while((i=fis.read())!=-1) // -1 : EOF (End Of File)
//			{
//				System.out.print((char)i);
//				// FileInputStream으로 읽으면 한글이 깨진다 => 한글파일을 읽는 용도가 아니다
//				// 파일 이동
//			}
			
			while(true)
			{
				String s = br.readLine();
				if(s==null)
					break;
				System.out.println(s);
			}
			
			
		} catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
			// getMessage() => 파일을 찾을 수 없다
			// printStackTrace() => 실행하는 과정 => 해당위치 종료
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
