/*
 * 	1. while
 * 		사용자가 구구단 => 단을 입력하면
 * 		해당 단을 출력
 * 	--------------------------------
 * 		변수 => 사용자가 입력한 단이 필요
 * 			----------------------
 * 			루프변수 : 1~9
 */
import java.util.Scanner;
/*
 * 	nextInt() => 정수 입력
 * 	nextDouble() => 실수 입력
 * 	next()	=> 문자열 입력
 * 	nextLine() => 문자열(공백 포함)
 */
public class 제어문_반복문_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력: ");
		int dan = scan.nextInt(); // 사용자 요청 변수
		
		// 요구사항 처리
		int i = 1;	// 루프변수
		while(i<=9)
		{
			System.out.printf("%d * %d = %2d\n", dan, i, dan*i);
			i++;
		}

	}

}
