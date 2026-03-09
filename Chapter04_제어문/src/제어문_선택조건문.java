/*
 * 	선택조건문 = true 처리 / false 처리
 * 	형식
 * 		if(조건문)
 * 		{
 * 			조건 true 일때 처리
 * 		}
 * 		else
 * 		{
 * 			조건 false 일때 처리
 * 		}
 * 
 * 		
 */
// 숫자 2개 입력하여 최대값 최소값을 구하기
import java.util.Scanner;
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번재 정수 입력: ");
		int num1 = scan.nextInt();
		
		System.out.println("두번재 정수 입력: ");
		int num2 = scan.nextInt();
		
		int num3 = num1>num2 ? num1 : num2;
		
		if(num3==num1)
		{
			System.out.println("최대값: " + num1);
			System.out.println("최소값: " + num2);
		}
		else
		{
			System.out.println("최대값: " + num2);
			System.out.println("최소값: " + num1);
		}

	}

}
