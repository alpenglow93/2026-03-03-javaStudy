/*
 * 	일반 프로그램 : 프로그램 - 운영체제 - 하드웨어
 * 	자바 프로그램 : 프로그램 - JVM - 운영체제 - 하드웨어
 * 		JVM : JDK => 실제 실행속도가 C언어보다는 늦다 (네트워크, 파일)	- 통신역할
 * 
 * 	JDK 구성
 * 		JRE => 실행환경 => 라이브러리 포함
 * 		JVM => Development Tool (bin 폴더 안에 javac, java / javap, javaw, jar)
 * 		Library
 * -----------------
 * 			javac : 컴퓨터가 인식하는 언어 변경 => 컴파일
 * 			java : 프로그램 실행 => 화면 출력
 * 					한줄씩 읽어서 출력 (인터프리터) - HTML, CSS, JavaScript
 * 			javap : 역 컴파일러
 * 			javaw : 서버구동 => 톰캣 (웹서버)
 * 			jar : 배포 => zip
 * 			 | 자바파일이 아니고 .class 파일만 묶어준다
 * 
 * 		자바로 제작할 수 있는 프로그램
 * 		=> 웹 개발 (JSP: Java Server Page(파일))
 * 		=> 모바일: 안드로이드 / 아이폰: 스위프트 => 통합 : 플러터
 * 		=> 게임: swing / javafx / java3d
 * 
 * 		자바의 특징
 * 			모든 운영체제의 호환성이 좋다
 * 
 * 		클래스명: 첫글자를 대문자, 단어가 여러개면 단어 첫글자마다 대문자
 * 		변수명: 소문자 시작, 3~10글자 정도
 * 		상수명: 모든 글자 대문자
 * 		메소드: 소문자 시작
 * 
 * 
 */
public class 자바_구동 {
	public static void main(String[] args) {
		 
		System.out.println("자바 실행"); // () 안에 있는 데이터를 출력
		System.out.println("<html><body><h1>Hello Java</h1></body></html>");
	}
}
