/*
 * 	선택문 => 다중조건문을 단순화
 * 			복잡한 소스코딩에서 주로 사용 (게임, 네트워크)
 * 
 * 	형식)
 * 		switch(정수/문자/문자열)
 * 		{
 * 		case 값1:
 * 			처리문장
 * 			break;
 * 		case 값2:
 * 		...
 * 		default:
 * 		}
 * 
 * 		switch()
 * 		{
 * 		case "+" -> 처리문장;	// 자동으로 break를 생략한다
 * 		...
 * 		}
 * 
 */
import java.util.Scanner;
public class 제어문_선택문 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		System.out.print("연산자 입력:(+,-,*,/): ");
		String op = scan.next();
		System.out.print("두번째 정수 입력: ");
		int num2 = scan.nextInt();
		
//		switch(op)
//		{
//		case "+":
//			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
//			break;
//		case "-":
//			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
//			break;
//		case "*":
//			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
//			break;
//		case "/":
//			System.out.printf("%d/%d=%d\n", num1, num2, num1/num2);
//			break;
//		default:
//			System.out.println("잘못된 연산자입니다");
//		
//		}
		
		switch(op)
		{
		case "+", "%"-> {	// 여러개 넣을땐 , 로 추가해주기
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
			System.out.println("프로그램종료");	// 여러줄 넣을땐 괄호로 묶어주기
			}
		case "-"->
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
		case "*"->
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
		case "/"->
			System.out.printf("%d/%d=%d\n", num1, num2, num1/num2);
		default->
			System.out.println("잘못된 연산자입니다");
		
		}
		
	}

}
