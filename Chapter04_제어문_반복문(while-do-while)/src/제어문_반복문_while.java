/*
 * 	1. 조건문 : if, if~else
 * 	2. 선택문 : switch~case
 * 
 * 
 * 	반복문
 * 		for : 화면 UI, 알고리즘 => 배열 / 컬렉션 처리
 * 				반복횟수 지정
 * 		while : Back-End
 * 				파일 / 데이터페이스 / 네트워크
 * 				간단한 게임
 * 
 * 				반복횟수가 지정이 안 된 경우
 * 				=> 시작 => 조건검색
 * 		do~while : 시작화면 출력
 * 					한 번 이상을 반드시 출력할때
 * 					=> 시작 => 문장 => 조건검색
 * ----------------------------------------------
 * 	제어
 * 	=> break : 반복을 종료
 * 	=> continue : 건너뛴다 (특정부분에서 제외)
 * 
 * 	1) 형식
 * 		1. 시작값		int i = 1
 * 		2. 끝값		i <= 10
 * 		3. 몇 번 수행	i++
 * 
 * 		for(시작값;끝값;증가값)
 * 			실행문
 * 
 * 		시작값
 * 		while(끝값)
 * 		{
 * 			실행문장
 * 			증가값
 * 		}
 * 
 * 		시작값
 * 		do
 * 		{
 * 			실행문장
 * 			증가값
 * 		} while(끝값);
 * 
 */
import java.io.*;
public class 제어문_반복문_while {

	public static void main(String[] args) /*throws Exception*/ {
		// TODO Auto-generated method stub
		
//		File file = new File("c:\\javaDev\\movie.txt");
//		FileReader fr = new FileReader(file);
//		//String movie = "";
//		StringBuffer db = new StringBuffer();	// buffer가 더 빠름
//		int i = 0;
//		while((i=fr.read())!= -1)
//		{
//			//movie += (char)i;
//			db.append((char)i);
//		}
//		fr.close();
//		System.out.println(db.toString());
		
		System.out.println("===== for문 =====");
		for(char c = 'A'; c <= 'Z'; c++)
		{
			System.out.print(c + " ");
		}
		System.out.println("\n===== while =====");
		char c = 'A';
		while(c <= 'Z')
		{
			System.out.print(c + " ");
			c++;
		}
		System.out.println("\n===== do~while =====");
		c = 'A';
		do
		{
			System.out.print(c + " ");
			c++;
		} while(c <= 'Z');

	}

}
