/*
 * 	변수 : 초기값이 없는 상태 메모리에 저장이 안된다
 * 		=> 지역변수
 * 			명시적, 입력, 난수 ...
 * 		=> 클래스에 선언된 변수는 자동 초기화 (자동 초기값 => 기본값)
 * 		=> 프로그램 구동 => 초기값이 필요할 때
 * 		예) 
 * 			String URL = "오라클주소";
 * 		=> 파일 읽기 / 쿠키 ...	>> 명시적 초기화가 안된다 (초기화블록 / 생성자)
 * 	초기값 => 생성자
 * 		생성자
 * 		1. 특징 (일반 메소드와 다르다)
 * 			1) 클래스명과 동일
 * 			2) 리턴형이 없다 => void가 들어가도 리턴형이기 때문에 이것이 붙으면 생성자가 아니라 일반 메소드
 * 			3) 오버로딩을 지원한다
 * 				같은 이름의 메소드를 여러개 생성
 * 				** 오버로딩 ==> 226page
 * 				= 메소드명이 동일
 * 				= 리턴형은 관계가 없다
 * 					int a()			<<
 * 					double a(int a)	<< 리턴형 상관 없이 매개변수가 다르므로 오버로딩이 됨
 * 				= 매개변수의 갯수/데이터형이 다르면 오버로딩
 * 				= 접근지정어도 관계 없다
 * 				= 같은 클래스 안에서 생성
 * 		2. 역할
 * 			멤버변수의 초기화 담당
 * 			시작과 동시에 처리하는 기능
 * 				=> 네트워크 / 크롤링 / 데이터베이스 / 화면 UI (프로그램을 켜면 화면을 띄워줘야하므로)
 * 				=> 웹, SpringAI 에서 많이 씀
 * 				=> 클래스를 메모리에 저장하는 경우
 * 					new 생성자();
 * 				
 * 			 
 * 		
 */
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@AllArgsConstructor	// 모든 생성자 (Args : 매개변수)
@NoArgsConstructor	// 매개변수가 없는 생성자
class A
{
//	A() {
//		System.out.println("생성자 호출");
//	}
	
//	A(int a) {
//		System.out.println("호출");
//	}
	
	int a, b;
	
}

public class 생성자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 매개변수가 있는 생성자를 만들어놓고 기본 생성자를 생성하지 않는 경우엔
		// A a = new A(); 같은 식으로 기본 생성자를 두고 new를 하면 오류가 발생함
		A a = new A();		
		
	}

}
