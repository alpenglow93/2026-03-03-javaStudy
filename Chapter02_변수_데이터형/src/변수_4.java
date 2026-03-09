/*
 * 
 * 	교재 36페이지
 * 	
 * 	변수란: 하나의 값을 저장할 수 있는 메모리 주소의 별칭
 * 	RAM => 각 주소마다 4byte 씩 나눠져있다
 * 
 * 	저장크기
 * 	1byte / 2byte / 4byte / 8byte => 기본형
 * 
 * 	지역변수
 * 		=> stack 공간에 저장
 * 		=> { 변수 선언 } => 지역변수		- 블럭{}이 종료되면 자동 해제 (메모리 자체 관리)
 * 		*** 변수 사용 시에는 반드시 어떤 종류의 값을 저장할지 미리 지정해야한다
 * 
 * 	변수 선언
 * 	int kor;
 * 	int eng;
 * 	int math;
 * 
 * 	int kor, eng, math;
 * 	//위 아래 방식 모두 선언 가능
 * 
 * 	변수의 초기값 - 초기값이 없는 상태에서는 오류 발생
 * 	kor = 100;
 * 	eng = 90;
 * 	math = 80;
 *
 *	선언+초기값
 *	int kor = 90;
 *
 *	=> 변수명
 *		1) 길이 제한은 없지만 가독성으로 위해 적정 길이로 쓰기 (3~10)
 *		2) 변수명에 i, j는 사용하지 않는다 (글꼴에 따라서 구분이 어려울 수 있어서)
 *
 *	-------
 *	실수 정밀도
 *	double d = 100; ==> 소수점 이하 15자리 이상
 *	float => 4byte => double 구분 ==> 소수점 이하 6자리
 *
 *	-------
 *
 *	char => 문자를 저장
 *		0~65535 => 멀티바이트(2byte) 유니코드
 *		문자 하나 저장 가능
 *
 *	String
 *		
 */
public class 변수_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'홍');
		System.out.println((int)'g');
		
		int a = 10;
		System.out.println(a);
		
		/*
		 * byte b1 = 10; byte b2 = 20; byte b3 = b1 + b2; // byte와 byte를 더하면 int 가 되기
		 * 때문에 오류가 발생 // b1 + b2를 byte로 강제형변환하거나 저장하는 새로운 변수의 데이터형을 byte가 아닌 int나 long
		 * 같은 다른 형으로 변경해야함
		 */		
		long l = 100L;	// 그냥 넣으면 int값이므로 L을 덧붙여 명시해주기
		double d = 100;	// 실수 변수에 정수를 넣었지만 double에 들어가면 double로 변환됨
		
		char c = 66;	// char 형은 숫자를 넣으면 호환이 되는 문자를 가지고 온다
		System.out.println(c);
		
		
	}

}
