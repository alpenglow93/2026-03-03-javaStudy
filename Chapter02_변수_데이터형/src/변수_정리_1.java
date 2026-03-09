/*
 * 	출력 형식
 * 
 * 	System.out.print()		=> 가로 출력 (inline)
 * 	System.out.println()	=> 세로 출력 (block)
 * 	System.out.printf()		=> 서식이 있는 경우
 * 
 * 	연산처리 (연산자)
 * 		산술( + - * / % & | ^ << >>)
 *  	단항(++ -- 형변환 부정 연산자 !)
 *  	논리(&& ||)
 *  	비교(== != < > <= >=)
 *  	대입(= += -= *= /= op=)
 *  
 *  제어문
 *  	조건문
 *  	반복문
 *  	선택문
 *  	반복제어문
 *  
 *  묶기
 *  	명령어 묶기 : 메소드
 *  	데이터 묶기 : 클래스	-> ~VO, ~DTO
 *  	둘 다 묶기 : 클래스	-> ~DAO, ~Service
 * 
 */
public class 변수_정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("Hello ");
		//System.out.print("Java");
		System.out.println("Hello ");
		System.out.println("Java");
		// %d : 정수값 / %s : 문자열 / %c : 문자 / %f : 실수
		// %3d 는 3칸을 주고 오른쪽정렬 하는 느낌
		// %-3d는 -3칸을 주고 왼쪽정렬 하는 느낌
		System.out.printf("%-4d%-4d%-4d\n", 90, 90, 90);	// printf 는 소수점 자리수 자를때 많이 사용한다
		System.out.println(10/3.0);
		System.out.printf("%.2f\n", 10/3.0);	// %.2f : 소수점 2자리까지 남기고 잘라내라

	}

}
