/*
 * 	논리연산자 : 조건문 (유효성 검사, 범위, 기간 확인), 반복문
 * 	조건 => 부정 / 논리 / 비교 => 사용이 가능
 * 	=> boolean
 * 
 */

import java.util.Scanner;
public class 이항연산자_논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력(0~100): ");
		// && 정상처리
		// || 비정상처리
		int score = scan.nextInt();
		
		String res = score>=0 && score<=100 ? "정상입력" : "비정상입력";
		System.out.println("res: " + res);
		

	}

}
