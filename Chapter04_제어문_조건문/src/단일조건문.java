/*
 * 	제어문 : 프로그램을 제어할때 사용
 * 		=> 건너뛰기, 원하는 데이터만 출력
 * 		=> 반복적으로 수행
 * 		=> 반복을 제어
 * 	1) 제어문의 종류
 * 		1. 조건문
 * 			단일조건문
 * 					if(조건) => 조건은 무조건 true/false만 사용이 가능
 * 					{
 * 						명령문;	// 조건이 true일 때 블럭 안으로 들어와 명령을 수행
 * 					}
 * 					
 * 			선택조건문
 * 			다중조건문
 * 		2. 선택문
 * 			선택문 : 다중조건문을 단순화
 * 		3. 반복문
 * 			for문	=> 반복횟수지정
 * 			while문	=> 반복횟수 지정이 없는 경우 => 선 조건 검색
 * 			do~while문	=> 반복횟수 지정이 없는 경우 => 반드시 한 번 이상은 수행
 * 		4. 반복제어문
 * 			break : 반복 문장 중단
 * 			continue : 특정 부분을 제외
 * 		5. 혼합
 * 	----------------------------------	기본문법
 * 	관련된 데이터 묶기 : 배열/클래스
 * 	관련된 명령문 묶기 : 메소드
 * 	--------------- + 묶기 (객체지향)
 */
public class 단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 단일조건문
		int num = 15;
		if(num%3==0)
		{
			System.out.println(num+"은 3의 배수입니다");
		}
		if(num%5==0)
		{
			System.out.println(num+"은 5의 배수입니다");
		}
		if(num%7==0)
		{
			System.out.println(num+"은 7의 배수입니다");
		}
		
		// 범위/기간 => 논리연산자
		char c = '8';
		if(c>='A' && c<='Z')
		{
			System.out.println(c+"는 대문자입니다");
		}
		if(c>='a' && c<='z')
		{
			System.out.println(c+"는 소문자입니다");
		}
		if(c >= '0' && c <= '9')
		{
			System.out.println(c+"는 숫자입니다");
		}
		
		String id = "admin";
		String pwd = "1234";
		
		// 문자열 비교 => equals를 사용
//		if(id.equals("admin") && pwd.equals("1234"))
//		{
//			System.out.println("로그인되었습니다");
//		}
//		if(!(id.equals("admin") && pwd.equals("1234")))
//		{
//			System.out.println("아이디나 비밀번호가 틀립니다");
//		}

//		if(id=="admin" && pwd=="1234")
//		{
//			System.out.println("로그인되었습니다");	// == 을 사용했지만 로그인 되었다고 나옴.
//			//같은 문자열이 저장되면 같은 곳을 참조하기 때문에 결과적으로 주소가 같게 나오게 됨.
//			// scanner로 입력받았을때는 안 된다.
//		}
		
		// 에러처리
		int a = 10;
		int b = 3;
		
		if(b==0)
		{
			System.out.println("0으로 나눌 수 없습니다");
		}
		if(b!=0)
		{
			System.out.println(a/(double)b);
		}
		
	}

}
