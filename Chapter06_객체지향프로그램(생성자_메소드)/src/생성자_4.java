/*
 * 	생성자 => 229page
 * 		=> 자신의 생성자를 호출이 가능하다
 * 		=> this() => 자신의 생성자 => 상
 * 		=> this => 자신의 객체		<< this() 메소드와 this는 다르다
 * 			상속 내린 클래스 : super
 * 
 * 
 * 	프로그램은
 * 		1. 반복 제거가 중요	=> for/메소드/생성자
 * 			공통모듈 => 수정편리
 * 
 * 
 */
class Member2
{
	int mno;
	String name;
	String address;
	// 여기에서 생성된 멤버변수는 클래스 내부에서 모두 사용이 가능하지만,
	// static{} 블럭, static() 메소드 안에서는 사용이 불가능하다
	// 하지만 static 변수는 모든곳에서 사용이 가능하다
	
	static
	{
		//name = "심청이"; // static 블럭 안이라 멤버변수 사용이 안되어 오류가 남
	}
	
	Member2() {
		mno = 1;
		name = "홍길동";
		address = "서울";
	}
	
	Member2(String n) {
		// 중복코딩이 많은 경우 많이 사용
		this();	// 자기자신의 생성자 Member2() 를 실행하라
		// 생성자 안에서만 사용이 가능
		// 반드시 첫번째줄에서 사용 (오류남)
		name = n;
	}
	
	Member2(String n, String a)
	{
		this(n);	// 자기자신의 생성자 Member2(n) 을 실행하라
		name = n;
		address = a;
	}	
}

public class 생성자_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member2 m1 = new Member2();
		System.out.println("회원번호: " + m1.mno);		// 1
		System.out.println("이름: " + m1.name);		// 홍길동
		System.out.println("주소: " + m1.address);	// 서울
		
		Member2 m2 = new Member2("심청이");
		System.out.println("회원번호: " + m2.mno);		// 0
		System.out.println("이름: " + m2.name);		// 심청이
		System.out.println("주소: " + m2.address);	// null
		
		Member2 m3 = new Member2("박문수", "부산");
		System.out.println("회원번호: " + m3.mno);		// 0
		System.out.println("이름: " + m3.name);		// 박문수
		System.out.println("주소: " + m3.address);	// 부산
		// this()가 없다면 생성하는 생성자에 값이 들어가지 않아 기본 초기화값이 들어가게 됨

	}

}
