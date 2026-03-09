
import java.util.Scanner;	// 입력

public class 변수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 사과 5개
		 * => 사과를 2개를 먹었다
		 * => 현재 남아있는 갯수는 몇 개일까
		 */
		
		/*
		 * int 사과 = 5; //int 먹은수 = 2; //int 남은수 = 사과 - 먹은수;
		 * 
		 * //System.out.println("남은 사과 : " + 남은수);
		 * 
		 * 사과 -= 2; // 사과 = 사과 - 2; System.out.println("남은 사과 : " + 사과);
		 */
		
		/*
		 * 국어 80점
		 * 영어 90
		 * 수학 70
		 * 평균구하기
		 */
		
		/*
		 * int 국어 = 80; int 영어 = 90; int 수학 = 70;
		 * 
		 * System.out.println((국어 + 영어 + 수학) / 3);
		 */
		
		Scanner scan = new Scanner(System.in);
		// System.in => 키보드 입력값을 읽어오는 역할
		// => 공백 / 엔터 90 80 70
		/*
		 * System.out.print("국어 점수 입력: "); // println은 줄바꿈을 하고 출력, print는 줄바꿈을 하지 않음 int
		 * 국어 = scan.nextInt();
		 * System.out.println("국어: " + 국어);
		 * 
		 * System.out.print("영어 점수 입력: ");
		 * int 영어 = scan.nextInt();
		 * System.out.println("영어: " + 영어);
		 * 
		 * System.out.print("수학 점수 입력: ");
		 * int 수학 = scan.nextInt();
		 * System.out.println("수학: " + 수학);
		 */
		System.out.print("국어 영어 수학 입력: ");
		int 국어 = scan.nextInt();
		int 영어 = scan.nextInt();
		int 수학 = scan.nextInt();
		
		System.out.println("총점: " + (국어+영어+수학));
		System.out.printf("평균 %.2f", (국어+영어+수학) / 3.0); // 이런식으로 써주면 소수점 2자리까지 출력해준다

	}

}
