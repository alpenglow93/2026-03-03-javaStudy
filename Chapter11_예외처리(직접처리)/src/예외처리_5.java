/*
 * 	1. 인터페이스
 * 		=> 표준화 가능
 * 		=> 소스의 통일화
 * 		=> 다른 클래스와 연결시에 주로 사용 : 리모컨
 * 			=> 결합성이 낮아진다
 * 			=> client <=|=> server
 * 					interface
 * 			=> 유지보수
 * 		=> 관련된 여러개의 클래스를 모아서 한 개의 이름으로 관리하는 역할
 * 
 */

interface Animal
{
	// public static final 생략 (자동 생성)
	int a = 100;	// 상수형 => 반드시 초기화
	
	public void eat(); // abstract 생략
	// interface의 메소드는 항상 public abstract 키워드가 들어가게 된다
	// 항상 public이지만 private 사용도 가능 => interface 자체에서만 사용
	private void display()
	{
		System.out.println("공통사용");
	}
	public default void aaa()
	{
		display();	// 이런 식으로 interface 자체 내에서 공통으로 사용하는게 있을 경우 private 메소드를 만들어서 사용할 수 있다
	}
	public default void bbb()
	{
		display();
	}
	public default void ccc()
	{
		display();
	}
}

public class 예외처리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
