package com.sist.inner;
/*
 * 	내부클래스의 종류 / 형식 => 윈도우, 빅데이터, Spring AI
 * 	-------
 * 		멤버클래스 : 공동으로 사용되는 변수, 메소드가 있는 경우
 * 			장점: 다른 클래스와 연결해서 사용하기 쉽다
 * 				 코드의 복잡성을 줄일 수 있다
 * 				 --------- 게임
 * 		class A
 * 		{
 * 			A,B,C
 * 			class B => private까지 접근이 가능
 * 			{
 * 				A,B,C
 * 			}
 * 		}
 * 		==> 네트워크 (서버), Thread(자원=>윈도우에 있는 기능을 바로 활용)
 * 		class Server
 * 		{
 * 			=> 사용자 정보 : 공유 => static
 * 			class 통신 
 * 			{
 *				// 서버는 한 번만 열어야하기 때문에 따로 빼지 못해서 서버의 내부클래스로
 * 			} 
 * 		}
 * 		class MyWindow
 * 		{
 * 			=> 버튼 ...
 * 			class Thread
 * 			{
 * 				// 버튼등을 사용해야하는데 new window를 하면 새 창이 뜨기 때문에 내부클래스로
 * 			}
 * 		}
 * 		익명의 클래스 : extends를 사용하지 않고 오버라이딩을 하는 경우
 * 					윈도우 => 버튼 extends JFrame
 * 					----------
 * 		class A extends C
 * 		{
 * 			B b = new B()
 * 			{
 * 				void disp() {}	// 익명의 클래스 오버라이딩
 * 			}
 * 		}
 * 		class B
 * 		{
 * 			void disp() {}
 * 		}
 * 
 * 		지역 클래스 : 메소드 안에 클래스 정의 => 사용빈도는 없다
 * 		class A
 * 		{
 * 			public void disp()
 * 			{
 * 				class B
 * 				{
 * 				}
 * 			}
 * 		}
 * 
 * 		==> 멤버클래스 / 익명의 클래스 => 윈도우 개발, AI
 * 		==> AI (데이터 수집 = 데이터분석 = 예측 = 학습)
 * 		class A
 * 		{
 * 			class B
 * 			class C
 * 			class D	// 클래스가 동시에 여러개 들어가있을수도 있다
 * 		}
 * 
 * 		
 * 		
 * 		자동차 == 엔진
 * 		서버  == 클라이언트
 * 		윈도우 ==	쓰레드
 * 		----------------- 웹 : 독립적
 * 		
 * 
 */

class Outer
{
	private String name = "홍길동";

	class Inner
	{
		int a = 10;
		public void print()
		{
			System.out.println("Inner:Call..:name="+name);
		}
	}
	
	public void display()
	{
		Inner in = new Inner();
		in.print();
	}
}

// static
class Outer2
{
	
	static class Inner // static Inner Class
	{
		
		public void print()
		{
			System.out.println("Inner: print() Call...");
		}
	}
}

// 익명의 클래스 : 한 번 사용 후 버린다
class Outer3
{
	Inner in = new Inner() {
		public void print()
		{
			System.out.println("Outer3에서 Inner: print() 오버라이딩...");
		}
	};
	
}
class Inner
{
	public void print()
	{
		System.out.println("Inner: print() Call...");
	}
}

// 지역 클래스
class Outer4
{
	public void print()
	{
		
		Inner i = new Inner();	// 이걸 안 쓰면 호출 불가
		i.print();
	}
	class Inner
	{
		public void print()
		{
			System.out.println("지역클래스: Inner.print() Call...");
		}
	}
}

public class 내부클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===== 멤버 클래스 =====");
//		Outer p = new Outer();
//		Outer.Inner c = p.new Inner();
//		c.print();
		System.out.println();
		
		Outer p = new Outer();
		p.display();
		
		System.out.println("===== static 클래스 =====");
		Outer2.Inner c1 = new Outer2.Inner();
		c1.print();
		System.out.println();
		
		System.out.println("===== 지역 클래스 =====");
		Outer4 c2 = new Outer4();
		c2.print(); // 클래스 캡슐화
		System.out.println();
		
		System.out.println("===== 익명의 클래스 =====");
		Inner i1 = new Inner();
		i1.print();
		Outer3 i2 = new Outer3();
		i2.in.print();
		System.out.println();
		

	}

}
