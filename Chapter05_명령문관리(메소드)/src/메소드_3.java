/*
 * 	메소드 형태 (4가지)
 * 	1. 입력값 / 리턴값 모두 있는 메소드
 * 		리턴값 메소드명(매개변수...)
 * 		{
 * 			return 결과값;	// 리턴형과 데이터형이 동일 / 반드시 한개만 설정
 * 							// 결과값이 여러개 = [], 클래스
 * 		}
 * 	2. 입력값 / 리턴값 모두 없는 메소드
 * 		void 메소드명()	// 리턴이 없는 경우는 void
 * 		{
 * 			return;	// 생략이 가능
 * 		}
 * 	3. 입력값은 없고 / 리턴값만 있는 메소드
 * 		리턴값 메소드명()
 * 		{
 * 			return 값;
 * 		}
 * 	4. 입력값은 있고 / 리턴값이 없는 메소드
 * 		void 메소드명(매개변수...)
 * 		{
 * 			자체 처리...
 * 		}
 * 
 * 	===> 호출방법
 * 	1. 리턴형 / 매개변수
 * 		데이터형 변수명 = 메소드명(매개변수값);
 * 
 * 		int aaa(int a, int b)
 * 		=> int a = aaa(10, 20)	// int보다 큰 데이터형이면 된다 => 가급적이면 일치
 * 	2. void
 * 		메소드명(매개변수)
 * 	3. 메소드 즉시 종료 : 필요한 위치 return 설정
 * 		단독 사용 : void
 * 		선택적 사용
 * 	4. 형식
 * 		[접근지정어][옵션] 리턴형 메소드명(매개변수...) => 선언부
 * 		(static abstract final...)
 * 		{
 * 			구현부
 * 		}
 * 
 * 		=> 재사용 / 특정 기능을 만드는 경우
 * 		예) 게시판
 * 			글쓰기 / 상세보기 / 수정 / 삭제 / 검색 / 추가
 * 			추가(업로드) => 수정이 가능 (오버라이딩)
 * 			객체 지향의 핵심 : 변수 / 메소드
 * 			메소드 안에
 * 				=> 변수 / 제어문 / 연산자
 * 
 * 			변수 => 연산자 => 제어문
 * 
 * 
 * 
 * 	1 예제
 * 		단을 사용자가 전송
 * 		해당 단을 출력
 * 
 */
import java.util.*;
public class 메소드_3 {
	
	static void gugudan(int dan)
	{
		for(int i = 1; i <= 9; i++)
		{
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력: ");
		// 구구단을 출력하는 메소드를 호출
		int dan = scan.nextInt();
		gugudan(dan);
		System.out.println("=======");
		System.out.print("단 입력: ");
		dan = scan.nextInt();
		gugudan(dan);
	}

}
