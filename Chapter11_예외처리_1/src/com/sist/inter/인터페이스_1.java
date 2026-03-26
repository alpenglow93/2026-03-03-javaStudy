package com.sist.inter;
/*
 * 	기본
 * 	= 클래스 : 설계 도구
 * 	= 객체 : 실제로 만들어진 것 => 사용
 * 	= 인스턴스 : 객체가 만들어질때 생기는 하나의 실체
 * 			-----------------------------
 * 				메모리에 저장된 상태
 * 		클래스 ===== 메모리
 * 			인스턴스화 ---- 인스턴스
 * 						   |
 * 						  A a
 * 		= 예
 * 			스마트폰 설계
 * 				모델명
 * 				색상
 * 				저장용량
 * 				카메라
 * 				----	메모리에 저장
 * 				색상: 빨간색
 * 				모델명: S26
 * 				저장용량: 126GB
 * 				카메라: 12MP
 * 				-------------- 인스턴스
 * 				스마트폰 구매
 * 				----------- 사용: 객체 => 실제 사용
 * 
 * 		1. 인터페이스 / 추상클래스
 * 			추상클래스 => 일부만 개발자에게 맡긴다
 * 				- 구현이 된 메소드 	==> 많다
 * 				- 구현이 안 된 메소드	==> 적다
 * 			인터페이스 => 개발자에게 맡기는것
 * 					=> 구현도 가능
 * 			
 * 
 * 			예) 버튼 클릭 / 마우스 클릭 => 프로그램에 맞게 구현 요청
 * 				윈도우 => 인터페이스 => 부품 업체가 여러곳
 * 						마우스 / 키보드 ...
 * 			
 * 			=> 추상클래스의 일종
 * 				: 미완성된 클래스 => 직접 사용은 불가능
 * 							=> 상속을 내려서 구현후에 사용 (구현: implements)
 * 			=> 자바는 모든 클래스가 단일 상속 지원 => 인터페이스는 다중 상속 지원
 * 			=> 추상클래스의 단점을 보완
 * 			=> 윈도우
 * 				=> 버튼 / 마우스 / 키보드
 * 				class A extends 버튼
 * 				class B extends A
 * 				class C extends 마우스
 * 				class D extends C
 * 				단일 상속을 하면 이런식으로 진행해야함
 * 				...
 * 				class E implements 버튼, 마우스, 키보드
 * 				>> 인터페이스 다중상속
 * 			-------------------------------------------
 * 			역할
 * 			1. 서로 다른 클래스를 연결해서 사용 : 결합성을 낮게
 * 			2. 관련 클래스를 모아서 한 개의 이름으로 제어
 * 				=> 웹, 스프링
 * 			3. 설계와 관련 => 기능 설계
 * 			4. 모든 개발자가 같은 메소드 구현 => 표준화
 * 				=> 소스 통일화
 * 			5. 요구사항 분석 => 기능
 * 			--------------------------------------------
 * 			=> 표준화 - Framework
 * 				Ajax Framework
 * 				React Vue Collection
 * 			
 * 			구성요소
 * 			[접근지정어][제어어] class ClassName
 * 				class의 접근지정어 : public / default
 * 				class의 제어어 : static / abstract / final
 * 			[접근지정어] interface interfaceName
 * 				interface의 접근지정어 : public / default (제어어는 없다)
 * 			{
 * 				변수 => 상수형변수
 * 				(public static final : 생략가능, 자동추가) int a = 10; => 값 설정
 * 
 * 				구현 안 된 메소드
 * 				(public abstract) void display();
 * 
 * 				구현된 메소드
 * 				(public) default void aaa() {}
 * 				
 * 				구현된 메소드
 * 				(public) static void bbb() {}
 * 
 * 				=> interface => 구성요소가 only public
 * 				=> 자체 처리 : private 메소드가 가능
 * 			}
 * 			
 * 			==> new를 사용할 수 없다
 * 				==> 사용이 가능한데 가능한 쓰지 말라
 * 			==> 상속을 받아서 구현한 클래스를 이용한다
 * 
 * 			상속
 * 				interface ====== interface
 * 							확장 : extends
 * 				interface ====== class
 * 							구현 : implements
 * 				class ====== interface
 * 						에러
 * 
 * 				class A
 * 				class B extends A
 * 				class C extends B => C(A,B) 단일 상속
 * 
 * 				interface A
 * 				interface B extends A
 * 				interface C extends B
 * 				----------------------
 * 				interface C extends A,B => 다중상속
 * 
 * 				interface A
 * 				interface B
 * 				class C implements A,B
 * 
 * 				class A
 * 				interface C
 * 				interface D
 * 				interface 
 * 				class B extends A implements C,D
 * 					클래스 상속 + 인터페이스 상속
 * 				=> 인터페이스 : 오버라이딩 프로그램 (재정의)
 * 				오버라이딩 (덮어쓴다)
 * 					= 메소드명이 동일
 * 					= 상속인 상태
 * 					= 매개변수가 동일
 * 					= 리턴형이 동일
 * 					= 접근지정어 => 확대(O), 축소(X)
 * 					public > protected > default > private
 * 						-----------> (X)
 * 					= 인터페이스는 public
 * 				interface A
 * 				{
 * 					void aaa();
 * 				}
 * 				class B implements A
 * 				{
 * 					void aaa() {} => (X)	// interface는 public인데 default로 써버리면 축소가 돼서 오류가 난다
 * 					// interface는 접근지정어 public이 생략이 가능해서 없어보여도 존재하는것임
 * 					public void aaa() {} => (O)
 * 				}
 * 
 * 				오버라이딩 => 모든 메소드 public
 * 							다른 클래스와 연결 => public
 * 
 * 				클래스 ----- 다른 클래스와 연결 => public
 * 				메소드 ----- 다른 클래스와 연결 => public
 * 				변수 : private : getter/setter	(getter/setter는 메소드 : public)
 * 				생성자 ----- 다른 클래스와 연결 => public
 * 
 * 
 */
// = 특별한 경우가 아니면 => 거의 인터페이스는 라이브러리

interface 도형
{
	String COLOR = "black";	// public static final 생략
	
	// 도형 그린다
	public void draw();	// abstract 생략
	//public abstract void draw();
	//abstract public void draw(); // 제어자와 접근지정자는 순서가 바뀌어도 된다
}
// 관련된 클래스를 한개로 모아서 한개의 이름으로 제어 => 인터페이스
// 메모리 공간을 1개 사용
// 웹 => 전송받는 메소드 / 브라우저 보내기
//		request			response :  어떤 파일 실행
class 선 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println(COLOR+"를 이용해서 선을 그린다");
		
	}
	
}

class 사각형 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println(COLOR+"를 이용해서 사각형을 그린다");
		
	}
	
}
// => 상속 / 구현 ==> 데이터형 2개 (도형, 삼각형)
class 삼각형 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println(COLOR+"를 이용해서 삼각형을 그린다");
		
	}
	
}

public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		도형 a = new 선();
		a.draw();
		
		a = new 사각형();
		a.draw();
		
		a = new 삼각형();
		a.draw();
		
		// 클래스 모아서 관리 => 상속 내리는 클래스, 인터페이스 이용
		
	}

}
