
/*
 * 	정수
 * 		byte
 * 		int
 * 		long => 주로 시간, 날짜
 * 
 * 	문자
 * 
 * 	논리
 */
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Random;

import javax.swing.*;	// java (1.0) / javax (1.2)
// => 10버전 이상 jakarta / 10버전 이하 javax
// 옛날 버전은 javax로 시작하는데 신버전은 jakarta 로 시작돼서 옛날 라이브러리는 호환이 안 됨
public class 변수_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File f = new File("C:\\javaDev\\javaStudy\\Chapter02_변수_데이터형\\src\\변수_정리.java");
//		long l = f.lastModified();
//		System.out.println(l);		
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(l)));
		
		/*
		 * 	변수 선언
		 * 	변수 = 초기값
		 * 		=> 명시적	String name = "홍길동";
		 * 		=> 입력값
		 * 		=> 랜덤	Math.random(); // double 0.0 ~ 0.99
		 * 		=> 외부에서 데이터 읽기
		 * 		=> 윈도우
		 * 			JOptionPane.showInputDialog();
		 */
		
//		String name = JOptionPane.showInputDialog("이름 입력: ");
//		System.out.println(name);
//		int kor = (int)(Math.random() * 101);
//		int eng = (int)(Math.random() * 101);
//		int math = (int)(Math.random() * 101);
		
		Random r = new Random();
		int kor = r.nextInt(101);
		int eng = r.nextInt(101);
		int math = r.nextInt(101);
		
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		

	}

}
