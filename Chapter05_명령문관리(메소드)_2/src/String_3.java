/*
 * 	목표
 * 	1. 메소드 이해
 * 	2. String 클래스 이해
 * 	3. 객체지향개념
 * 	---------------------
 * 	4. 상속 / 포함
 * 	5. 다형성
 * 	6. 클래스 설계
 * 	7. 인터페이스
 * 	---------------------
 * 	8. 예외처리
 * 	9. java.util / java.lang
 * 	10. java.io / java.net
 * 	11. java.sql
 * 	---------------------
 * 
 * 	String 클래스는 java.lang 에 들어있지만 자주 사용하기 때문에 java.lang은 생략이 가능하다
 * 	=> String / Math
 * 
 * 	String => 주요 메소드
 * 		원하는 위치 (인덱스 번호 찾기)
 * 
 * 		indexOf (앞에서 찾기) / lastIndexOf (뒤에서 찾기)
 * 			문자 찾는 경우			파일 찾기
 * 
 * 		int indexOf(char c)
 * 		int indexOf(String s)
 * 		===> return에 -1이 나오면 없는 경우
 * 
 * 		int lastIndexOf(char c)
 * 		int lastIndexOf(String s)
 * 		===> return에 -1이 나오면 결과가 없는 경우 
 * 	
 * 		
 * 
 */
import java.io.*;
public class String_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		File dir = new File("c:\\javaDev");
//		File[] files = dir.listFiles();
//		// 파일명을 가져와 확장자를 잘라낼때 lastIndexOf()를 사용해서 .을 찾는다
//		
//		for(File f:files)
//		{
//			if(f.isFile())	// 파일인 경우에만 출력 (폴더는 IsDirectory())
//			{
//				String name = f.getName();
//				String ext = name.substring(name.lastIndexOf(".")+1);	// +1을 안 하면 찾은 글자 . 부터 나옴
//				// substring() : 특정 범위의 문자열 추출
//				System.out.println(ext);				
//			}
//		}
		
		String msg = "Hello Java!!";
		System.out.println("a의 위치: " + msg.indexOf("a"));
		// 일반적으로는 indexOf() 많이 사용
		System.out.println("a의 위치: " + msg.lastIndexOf("a"));
		// 경로 / 확장자일때 lastIndexOf() 많이 사용
		System.out.println("b의 위치: " + msg.indexOf("b"));
		System.out.println("b의 위치: " + msg.lastIndexOf("b"));	// 찾는 결과가 없는 경우 -1을 리턴

		String ext = msg.substring(msg.lastIndexOf("B")+1);	// 전체 단어에서 b를 찾지 못했기 때문에 전체 문자열을 리턴
		System.out.println(ext);
		
		// 문자열을 사용해서 제어 => 원본은 불변
	}

}
