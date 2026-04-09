package com.sist.files;
/*
 * 	18장
 * 	IO : Input/Output 데이터의 흐름 관리 (통로)
 * 		데이터 이동 (Stream) => 데이터 이동 공간
 * 		단방향 (입력/출력 => 동시 (쓰레드))
 * 		카톡
 * 		1. 서버로 메세지 전송 => 엔터 (Output)
 * 		2. 출력 => 쓰레드 (Input)
 * 	사용처
 * 		파일 읽기 / 쓰기 => 파일 이동 / 텍스트 변경 / 설정 파일
 * 								  ---- JSON / XML
 * 		네트워크 통신 (주고받기) : 서버와 클라이언트 통신
 * 		사용자 입력 => 콘솔
 * 		=> InputStream 	==> HttpServletRequest
 * 		=> OutputStream ==> HttpServletResponse
 * 					 오라클 : PreparedStatement
 * 	핵심
 * 		Stream : 데이터를 보내는 통로 (단방향 => 읽기/쓰기)
 * 		Bufferd : 한번에 여러개 데이터를 동시에 보낸다 : 효율적이다
 * 
 * 	주요 클래스
 * 		InputStream : 읽기
 * 			|
 * 		FileInputStream (1byte씩 전송) = 업로드/다운로드
 * 		BufferedInputStream
 * 
 * 		OutputStrema : 쓰기
 * 			|
 * 		FileOutputStream (1byte씩 전송) = 파일 쓰기
 * 		BufferedOutputStream
 * 
 * 		Reader : 읽기
 * 			|
 * 		FileReader (2byte씩 전송) = 파일을 제어 (쓰기)
 * 		BufferedReader : 크롤링 => Jsoup
 * 
 * 		Writer : 쓰기
 * 			|
 * 		FileWriter (2byte씩 전송) = 파일 쓰기
 * 		BufferedWriter
 * 
 * 		ObjectInputStream / ObjectOutputStream => 일반 애플리케이션 
 * 		--------------------------------------
 * 		| 파일 => 노출 / 연결성이 거의 없다 / 구분이 없다 : 데이터베이스
 * 		=> JSON / XML
 * 
 * =====================================
 * 
 * 	Files : 819page => java.nio.*
 * 	=> 대부분 => static 메소드로 만들어져 있다
 * 		Files.
 * 	=> 주요 기능
 * 		***exists(경로명) => 파일 존재 여부
 * 		createFile(경로명) => 새파일 생성
 * 		createDirectory(경로명) => 폴더 생성
 * 		***delete(경로명) => 파일 삭제
 * 		***readAllLines(경로명) => 모든 줄을 List<String> 읽음
 * 		write(경로명, content) => 파일 쓰기
 * 		***copy(source, target)
 * 		***move() => 파일 이동
 * 		***size() => 파일 크기
 * 		list() => 파일 목록 출력
 * 		-----------------------------
 * 		경로명 => Paths => Path 객체 생성 후에 사용
 * 					=> 파일이나 폴더를 찾기 위한 정보를 가지고 있는 클래스
 * 
 * ============
 * 	
 * 	Files / Path
 * 	Files
 * 	파일과 디렉토리를 제어하는 모든 기능을 가지고 있다
 * 					-- 이동, 복사, 읽기, 쓰기 + 파일 정보
 * 	=> 반드시 파일 정보를 얻기 : Path 객체를 사용한다 (경로 얻기)
 * 	CheckedException을 가지고 있다 : 예외처리를 한다
 * 	파일 이동 / 복사 => StandardCopyOption.REPLACE_EXISTING
 * 
 * 	Path 객체
 * 	파일/디렉토리의 위치를 나타내는 객체 => 파일 정보
 * 	=> java.nio.file.*
 * 	=> 사용법 => Paths.get(경로명)
 * 	=> 절대경로, 상대경로도 가능
 * 	=> Paths.get("./IO_정리.java"); 	// . => 현재폴더
 * 	=> Paths.get("IO_정리.java");		// 현재폴더라면 파일명만 주는것도 가능
 * 		
 * 
 */

// 파일 존재 여부 확인

import java.nio.file.*;
import java.io.*;
import java.util.*;

public class IO_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Path 생성
		Path filePath = Paths.get("c:\\javaDev\\고객2.txt");
		Path dirPath = Paths.get("c:\\javaDev2");
		
		try 
		{
			// 1. 파일 생성
			if(!Files.exists(filePath))
			{
				Files.createFile(filePath);
				System.out.println("파일 생성 완료");
			}
			
			// 2. 폴더 생성
			if(!Files.exists(dirPath))
			{
				Files.createDirectories(dirPath);
				System.out.println("디렉토리 생성 완료");
			}
			
			// 3. 파일 쓰기
			String content = "안녕하세요 Files 클래스는 파일 관련 제어, File 클래스 확장";
			Files.write(filePath, content.getBytes());
			System.out.println("파일 쓰기 완료");
			// FileOutputStream
			
			// 4. 파일 읽기 : FileInputStream
			Path custFile = Paths.get("c:\\javaDev\\고객.txt");
			List<String> data = Files.readAllLines(custFile);
			data.stream()
				.forEach(s->System.out.println(s));
			
			// 5. 파일 복사
			Path copyPath = Paths.get("c:\\javaDev\\고객2.txt");
			Files.copy(custFile, copyPath, StandardCopyOption.REPLACE_EXISTING);	// 존재하는것 전체를 copy
			System.out.println("파일 복사 완료");
			
			// 6. 파일 이동 / 이름 변경 => 잘라내기
			Path movePath = Paths.get("c:\\javaDev2\\고객3.txt");
			Files.move(copyPath, movePath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("파일 이동 완료 / 파일명 변경");
			
			// 7. 파일 삭제
			Path delDir = Paths.get("c:\\javaDev2");
			//Files.delete(copyPath);
			Files.delete(movePath);
			Files.delete(delDir);	// 폴더 삭제를 하려면 내부 파일도 삭제를 해줘야함
			System.out.println("디렉토리 삭제 완료");
			
			/*
			 * 	copy => 원본은 그대로 유지
			 * 	move => 원본을 이동 (잘라내기)
			 * 	
			 *  StandardCopyOption.REPLACE_EXISTING 
			 *  => 복사, 이동시에 파일이 존재하면 덮어쓰기 / 파일 없으면 자동 생성 
			 *  
			 */
			
		} catch (Exception ex) 
		{
			ex.printStackTrace();
		}

	}

}
