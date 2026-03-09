/*
 * 산출물
 * 	1. 형식	==> 벤치마킹
 * 	2. 결과값	==> 출력물 (와이어프레임)
 * 	3. 흐름	==> 유스케이스 다이어그램, 클래스 다이어그램, 시퀀스 다이어그램
 * 	4. 순서도	==> 플로우차트
 * 	----------
 * 	ERD => 구현 => 웹사이트
 * 
 * 	형식)
 * 		if(조건문)
 * 		{
 * 			조건이 true
 * 		}
 * 		else
 * 		{
 * 			조건이 false
 * 		}
 * 
 * 
 */
// => 3개의 점수를 받아서 평균을 내는데 60점 이하는 탈락 / 합격
import java.util.Scanner;
public class 제어문_선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수 입력: ");
		int kor = scan.nextInt();
		
		System.out.println("영어 점수 입력: ");
		int eng = scan.nextInt();
		
		System.out.println("수학 점수 입력: ");
		int math = scan.nextInt();
		
		//평균
		int avg = (kor+eng+math) / 3;
		
		if(avg >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");

	}

}
