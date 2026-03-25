/*
 * 	인터페이스
 * 	1. 기능(메소드) 정해둔다
 * 		=> 모든 개발자 동일한 메소드를 구현 => 표준화
 * 	2. 인터페이스 사용?
 * 		1) 이미 어떤 것을 구현해야되는지 알고 있다 (규격화)
 * 		2) 여러 개발자 동시에 개발
 * 			=> 이 기능은 반드시 구현
 * 				웹 - main, 게시판, 공지사항 : 관리자 모드, 회원가입/로그인
 * 					매뉴얼 => 인터페이스
 * 		3) 내부 구현이 변경 => 메소드는 그대로 유지
 * 		4) 유지보수가 편리하다
 * 
 * 				인터페이스			클래스
 * 	----------------------------------------------
 * 				기능 설정			구현
 * 
 * 				메소드 선언			메소드 구현
 * 
 * 				상속(다중)			단일 상속
 * 			class => class
 * 				[ extend ]
 * 
 * 		interface => interface
 * 			[ extends ]
 * 		interface => class
 * 			[ implements ]
 * 		class => interface (X)
 * 	----------------------------------------------
 * 		class A
 * 		class B
 * 		class C extends A, B => (X)
 * 
 * 		=> class B extends A
 * 			class C extends B
 * 
 * 		interface A
 * 			interface B extends A
 * 			interface C extends B
 * 
 * 		=> interface C extends A, B
 * 
 * 		=> interface => class
 * 			[ implements ]
 * 
 * 		인터페이스
 * 		=> 추상클래스의 일종
 * 		=> 추상클래스의 단점을 보완 => 다중 상속
 * 		=> 장점
 * 			1. 기능 설계 (메소드 선언)
 * 				= 개발시간을 단축
 * 				= 표준화가 가능 => 라이브러리
 * 					프로그램은 정답이 없다 => 요구: 결과물
 * 			2. 결합도가 낮다 (수정시에 다른 클래스에 영향이 없다)
 * 				스프링 : 결합성이 낮은 프로그램으로 만들어져 있다
 * 						** 로드 존슨
 * 			3. 소스의 통일화 => 분석이 가능
 * 			4. 서로 다른 클래스 연결해서 사용이 가능 (리모컨)
 * 			5. 관련된 클래스를 모아서 한개의 이름으로 제어가 가능
 * 			6. 유지보수가 쉽다
 * 			7. 독립적으로 사용이 가능
 * 
 * 		인터페이스의 구성요소
 *	 		- 접근지정어 : public, default 사용 가능
 * 		public interface InterfaceName
 * 		{
 * 			[변수]
 * 				=> 상수형 변수만 저장
 * 				private int a; (X)	// 접근지정자 에러, 상수형이 아닌 변수 에러
 * 				public int a = 10;	// 반드시 값을 넣어줘야함
 * 
 * 			[선언된 메소드]
 * 				=> 추상메소드
 * 				public abstract void display();
 * 					// public abstract는 본래는 반드시 써줘야하지만 인터페이스에서는 생략이 가능 (자동 생성)
 * 				공통으로 구현을 해야 되는 부분을 설정
 * 				=> 회원가입
 * 					아이디 중복체크
 * 					비밀번호 규칙
 * 					우편번호 검색
 * 					이메일 충돌 방지
 * 					전화번호 동일(X)
 * 				
 * 			[구현된 메소드]
 * 				- default
 * 				==> 최근에 추가 (JDK 1.8)
 * 
 * 				public default 리턴형 메소드(매개변수)	// default 키워드 빠지면 오류
 * 				{
 * 
 * 				}				
 * 
 * 				- static
 * 					public static 리턴형 메소드명()
 * 					{
 * 					}
 * 					// public을 생략할 수 있다
 * 
 * 			==> 이 안의 모든 내용은 public만 사용 가능 * 			
 * 		}
 * 
 * 		클래스는 접근지정어 선택적
 * 		인터페이스 접근지정어 => 필수 (public)
 * 
 * 		추상클래스 : 기본은 만들어준다 / 나머지는 개발자에게 맡긴다 (반쪽 미완성 클래스) 
 * 			프랜차이즈 메뉴 (기본 레시피 => 매장 독자적 개발)
 * 		인터페이스 : 무엇을 해야하는지 알려준다 => 완전한 미완성 클래스
 * 		=> 객체 생성이 안된다 (new (X))
 * 		=> 상속 => 구현해서 사용이 가능
 * 
 * 		요구사항 => 사이트 벤치마킹 : 어떤 기능이 필요한지 설계
 * 
 * 		
 * 						인터페이스				추상클래스
 * 		------------------------------------------------------
 * 			개념			설계중심				기본+규칙(재사용)
 * 						규칙
 * 
 * 			구현코드		거의 없다				실제 구현+미구현
 * 						선언만
 * 					=> 경우의 수가 많은 경우
 * 
 * 			상속			다중 상속				단일 상속
 * 						implements			extends
 * 
 * 			사용 목적		강제 / 수정 유연성		공통기능 재사용
 * 		------------------------------------------------------
 * 		=> 기능 설정 => 개발시간 단축
 * 					 소스가 통일화
 * 		
 * 		** 인터페이스도 구현된 메소드가 가능
 * 			=> default / static
 * 		** 인터페이스는 모든 요소가 public
 * 			** 변수는 상수형만 사용이 가능
 * 					---- 반드시 초기화값을 설정한다
 * 		** 인터페이스가 public 이어야 하는 이유
 * 			1) 다른 클래스와 통신
 * 			2) 어떤 위치든 접근이 가능
 * 				public이 없는 경우에는 자동으로 public을 추가해준다
 * 		** 사용처
 * 			1) 윈도우의 이벤트 처리
 * 				JButton / JTextField / Mouse Click ...
 * 				=> interface
 * 			2) 결합성이 낮은 프로그램 : 스프링
 * 			3) 여러개 있는 경우 => 인터페이스
 * 				데이터베이스 / 파일 / 네트워크
 * 
 * 
 */

import java.util.*;

//interface는 무조건 public
interface I
{
	int a = 100;	// interface에서는 public static final이 생략될 수 있다 (자동 생성)
	void display();	// public abstract 생략 가능 (자동 생성)
	default void aaa() // public 생략 가능
	{
		
	}
}

interface II
{
	void display();
	default void aaa() {}	// 선택적 오버라이딩
}

class A implements II
{
	public void display() {}
	//void display() {}	// interface는 public인데 클래스에서는 아무것도 안 적으면 오류 발생
	// interface에서는 public이 추가되지만 클래스에서 가져다 쓸때는 오류가 발생해서 추가해줘야한다
}

class B implements II
{
	public void display() {}
	public void aaa() {}	// default 메소드 : 필요한 구역에서만 구현할 수 있도록 해줌
}

class C implements II
{
	public void display() {}
}



public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> list = new ArrayList<String>();
		//List<String> list = new Vector<String>();
		List<String> list = new LinkedList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("심청이");
		for(String name:list)
		{
			System.out.println(name);
		}

	}

}
