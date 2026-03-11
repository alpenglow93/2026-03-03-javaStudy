/*
 * 	지역변수 : {} 안에서만 사용이 가능 ===> 자동 메모리 해제
 * 	=> 초기화가 된 상태에서 사용이 가능
 * 	=> char c = '' => 오류발생(null)
 *  => char c = ' ';
 * 	전역변수 : 다른 클래스에서 사용이 가능
 * -------------------------------- 멤버변수 ===> 사용자 삭제, GC
 * 
 * 
 */
public class 지역변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문 이용해서
		// ABCDE
		char c = 'A';
		for(int i = 0; i<5; i++)
		{
			System.out.print(c++);
		}
		System.out.println();
		for(int i = 0; i < 5; i++)
		{
			char d = 'A';
			System.out.print(d++);	// AAAAA
			// d 변수가 블럭 밖으로 나가면 없어지고 반복될때마다 다시 선언되므로 계속 A를 출력하게된다
		}
		System.out.println();
		// 상수 선언방법 => 대문자
		final double PIE = 3.14;	// final : 상수로 지정하는 키워드
		//PIE = 2.00;	// 상수로 지정하면 값을 변경할 수 없음
		// 배열 / 오라클 주소 / 사이트 주소 같은것들을 final

	}

}
