package com.sist.main;

class Human
{
	String name;
	String sex;
	public Human()	// 상속에서 예외
	{
		name = "심청이";
		sex = "여자";
		System.out.println("Human() Call...");
		
	}
	// 그렇지만 Human이 먼저 메모리 할당되고 자식에게 상속하기 때문에
	// 자식은 따로 초기화를 하지 않을 경우 Human에서 초기화한 심청이, 여자 데이터가 들어가있게 된다
}

//class Student extends Human
//{
//	// name, sex
//	public Student(String name, String sex)
//	{
//		this.name = name;
//		this.sex = sex;
//	}
//	public void display()
//	{
//		System.out.println("이름: " + name);
//		System.out.println("성별: " + sex);
//	}
//}

// 상속 내린 클래스 => 메모리 할당 (생성자)
// 상속받은 클래스 => 메모리 할당

class Sawon extends Human
{
	// name, sex
	//String name, sex;	// 변수의 오버라이딩
	// 변수를 오버라이딩하고 super값과 this값을 따로 호출하면 각각 부모의 데이터와 자식의 데이터를 출력한다
	// 오버라이딩하지 않으면 super, this 모두 호출해도 자식의 데이터로 덮어씌워진다
	// 오버라이딩하지 않으면 super영역이 가지고 있는 변수에 대입하지만 오버라이딩하면 this 영역에 데이터가 새로 생기므로 this의 변수에 대입하게 됨
	public Sawon()
	{
		super();	// 원래는 이렇게 써야하나 쓰지 않아도 생략 가능 (자동 호출)	==> 생략이 안되는 케이스 있음
		/*
		 *  생략해도 컴파일러가 자동 호출하는 내용들
		 * 	return / 생성자 / super() / import java.lang / extends Object
		 */
		System.out.println("Sawon() Call...");
		this.name = "박문수";
		this.sex = "남자";
	}
	public void display()
	{
		System.out.println("이름: " + super.name);
		System.out.println("성별: " + super.sex);
		System.out.println("이름: " + this.name);
		System.out.println("성별: " + this.sex);
	}
	
}

public class 재사용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student std = new Student("홍길동", "성별");
//		std.display();
		
		Sawon s = new Sawon();
		s.display();

	}

}
