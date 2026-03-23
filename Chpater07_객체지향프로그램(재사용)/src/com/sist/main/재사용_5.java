package com.sist.main;

/*
 * 	1. 생성자 매개변수 여부
 * 	2. class A
 * 		class B extends A
 * 
 * 		=> A a = new A();	(X)
 * 		=> B b = new B();
 * 		=> A c = new B();
 * 			A는 변수 B는 메소드
 * 	
 * 
 */

// 같은 파일에서 클래스 여러개 만드는 경우 => public class는 한 번만 사용이 가능
class Saram
{
	String name;
	String sex;
	static int age;
	public Saram(String name, String sex)	// 기본 생성자 없이 매개변수 있는 생성자
	{
		this.name = name;
		this.sex = sex;
		age = 20; // => 생성자 : 인스턴스, static 상관 없이 초기화 가능
	}
}

class Member extends Saram
{
	public Member(String name, String sex)
	{
		super(name, sex);
		// TODO Auto-generated constructor stub
		
//		this.name = "박문수";
//		this.sex = "남자";
	}
	
	public void display()
	{
		System.out.println("이름: " + name);
		System.out.println("성별: " + sex);
		Member.age = 25;	// 변경이 가능 => 상속은 예외지만 사용은 가능 
		System.out.println("나이: " + Member.age);
	}

	// 위와 같은 기본생성자 없고 매개변수가 있는 생성자를 가지고 있는 클래스를 상속받을경우
	// super()를 따로 해주지 않으면 오류가 난다
	/*
	 * 	상속
	 * 	= 생성자 => default 생성자는 자동 호출
	 * 	= 매개변수가 있는 경우에는 super()
	 */
}

/*
 * 	1. 상속 내리는 클래스 => 매개변수가 있는 생성자가 있는 경우
 * 		=> 상속 받는 클래스에서 반드시 super(값...) 호출
 * 	2. 변수 상속시에 => super / this 는 구분이 없다
 * 		=> 구분 : 상속받은 클래스에서 변수를 다시 설정
 */

public class 재사용_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m = new Member("홍길동", "남자");
		m.display();

	}

}
