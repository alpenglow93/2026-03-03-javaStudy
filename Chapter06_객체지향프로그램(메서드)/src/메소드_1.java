/*
 * 	232page
 * 
 * 	모든 프로그램 : 데이터 + 메소드
 * 
 * 	메소드
 * 		역할
 * 		1) 클래스와 클래스간의 연결 (통신) => 메세지
 * 			매개변수 리턴형
 * 		2) 반복 제거
 * 		3) 구조적인 프로그램
 * 			절차적 언어 ===> 헌책방
 * 			객체지향 ===> 교보서적 
 * 		4) 메소드는 호출시마다 { 부터 } 까지 수행 => 호출한 위치로 원상복귀
 * 		5) 구성 요소
 * 			주고(매개변수)
 * 				사용자 요청 => 여러개, 한개, 없을 수 있다
 * 						=> 최소화 : 3개 이상 / 클래스, 배열
 * 			받기(리턴형) : 사용자 요청에 대한 처리값
 * 						=> 1개만 사용이 가능
 * 						=> 데이터값 여러개 : 배열 / 클래스 이용
 * 			메소드명 => 구분자 => 소문자로 시작 => 식별자
 * 					5~10자 정도
 * 			구현부
 * 			{
 * 				return; // void => 생략이 가능 (컴파일러가 자동 추가)
 * 				return 값;
 * 			}
 * 				return, 기본생성자, import java.lang, Object 상속 => 컴파일러가 자동 추가하는 것들
 * 
 * 		= 형식)
 * 			[접근지정어][제어어] 리턴형 메소드명(매개변수...)
 * 			{
 * 				구현
 * 				return 결과값;
 * 			}
 * 
 * 			static 메소드 ===> 클래스명.메소드명(값)
 * 			=> 한개의 메모리 안에 저장 => 공유
 * 			instance 메소드 == 객체명.메소드명(값...)
 * 			=> 객체마다 따로 저장 => 독립
 * 			=> new마다 따로 저장
 * 
 * 	
 * 		aaa(int a, char c, int b)
 * 		aaa(int a, int c, float b)
 * 		aaa(double a, char c, char b)
 * 		aaa(char a, char c, char b)
 * 		aaa(int a, double c, char b)
 * 		aaa(double a, double c, double b)
 * 		// 데이터형이 다 다르므로 오버로딩
 * 
 * 		aaa(10.5, 10, 10)	double int int
 * 		정확히 일치하지 않으면 가장 가까운 근사치를 찾는다 (double char char)
 * 		aaa(10.5, 'A', 10.5f) double double double
 * 	
 * 		
 * 				
 * 	
 */

class Methods
{
	int a = 10;
	String name = "홍길동";
	static int b = 20;	// 컴파일시에 저장
	
	static void display()	// 컴파일시에 저장 (static은 new를 쓰지 않아도 사용 가능)
	{
		System.out.println("Commons Methods");
	}
	void display(int a)
	{
		System.out.println("Instance Mathod");
	}
}

public class 메소드_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("b="+ Methods.b);	// new를 하지 않아도 static 변수이므로 사용이 가능하다
		Methods.display();
		// 목록(메뉴) => 한번 저장
		// 마이페이지는 사용자마다 달라야하므로 로그인을 해야하고 instance
		
		// 1. 메모리에 저장
		Methods m = new Methods();
		m.display(100);
		System.out.println("a=" + m.a);
		

	}

}
