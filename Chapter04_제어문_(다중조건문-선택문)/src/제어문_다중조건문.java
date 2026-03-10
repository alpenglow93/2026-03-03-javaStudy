/*
 * 	1. 기본문법 : 변수, 데이터형, 연산자, 제어문
 * 	2. 프로그램 제어 => 관련된 명령문, 변수 묶기
 * 	3. 데이터 보호(캡슐화) / 재사용(상속/포함) / 수정 쉽게(오버라이딩) / 추가 기능(오버로딩)
 * 	4. 설계 : 인터페이스
 * 	5. 프로그램 비정상 종료 방지 / 미리 에러에 대한 처리 => 예외처리
 * 	6. 라이브러리(자바제공)
 * 
 * 	제어문 : 다중 조건문 => 일반 프로그램에서는 많이 사용
 * 						웹에서는 가끔 사용
 * 	1) 형식
 * 		if(조건문)
 * 		{
 * 			조건이 true면 실행하는 명령문
 * 		}
 * 		else if(조건문)
 * 		{
 * 			조건이 true면 실행하는 명령문
 * 		}
 * 		...
 * 		else	// 필요시에만 사용
 * 		{
 * 			조건이 없는 경우 실행
 * 		}
 * 	
 * 	2) 동작
 * 		처음부터 시작 ===> 해당 조건을 찾는다
 * 		=> 해당 조건을 찾으면 문장을 실행하고 종료
 * 	3) 처리 : 경우수가 여러개인 경우
 * 
 * 	===> 단순화 : switch case
 */
// 사칙연산처리 +_*/% => 다른연산처리else
import java.util.Scanner;
public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 입력받는 준비
		Scanner scan = new Scanner(System.in);
		// System.in => 키보드 입력값 => 받아서 메모리에 저장하는 역할
		// => API => 자바에서 제공
		// 1. 첫번째 숫자
		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		// 2. 연산자
		System.out.print("연산자 입력:(+,-,*,/): ");
		String op = scan.next();
		// 자바에서 입력하는 모든 장치는 char이 아니고 String
		// Scanner 단점은 엔터/공백
		// aaa bbb ccc => enter => 결과값은 aaa => next()
		// 해결법 => nextLine() 엔터 칠때까지의 입력을 받는다
		// 웹이나 window 들어가면 입력창을 따로 쓰기 때문에 큰 신경 쓰지 않아도 됨
		// 3. 두번째 숫자 ===> 저장 ===> 결과값 출력시 읽기
		System.out.print("두번째 정수 입력: ");
		int num2 = scan.nextInt();
		
		// 처리(연산처리)
		if(op.equals("+"))
		{
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
		}
		else if(op.equals("-"))
		{
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
		}
		else if(op.equals("*"))
		{
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
		}
		else if(op.equals("/"))
		{
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없습니다");
			}
			else
				System.out.printf("%d/%d=%d\n", num1, num2, num1/num2);
		}
		else
		{
			System.out.println("연산자 입력이 잘못되었습니다");
		}
		

	}

}
