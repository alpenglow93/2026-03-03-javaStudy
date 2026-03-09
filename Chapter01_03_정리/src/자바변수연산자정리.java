/*
 * 	자바 => 웹개발 (관련된 자바만 공부)
 * 		1. 변수 : 프로그램에 필요한 데이터 저장
 * 		2. 변수를 요청에 따라 처리
 * 			1) 연산자
 * 			2) 제어문
 * 		3. 필요한 데이터 묶기 => 배열/클래스
 * 		4. 관련된 명령어 묶기 => 메소드
 * 		5. 프로그램이 종료 없이 실행 (무중단) => 예외처리
 * 		6. 라이브러리
 * 			=> 웹 관련
 * 	
 * 데이터베이스 : 오라클 => 필요한 데이터를 영구적으로 저장 (SQL)
 * 
 * 	웹 화면 UI
 * 		HTML/CSS => 동적 처리 (자바스크립트)
 * 	브라우저로 데이터 전송 : JSP
 * 	--------------------------- 팀별 1차
 * 	Spring-Framework / Spring-Boot
 * 	=> 순서, 기능, 처리하는 방법
 * 
 * 	CI/CD : 우분투 => AWS => 명령문만 수행
 * 			Jenkins / Nginx
 * 	---------------------------------- Backend
 * 
 * 	Front : VueJS (pinia)
 * 
 * 		React(tanStack-Query) 
 * 		Spring AI
 * 
 * 	데이터 저장 ====> 데이터 요청처리 ====> 출력
 * 
 * 	데이터 저장
 * 		데이터 한 개 저장 : 변수
 * 		데이터 여러개 저장 : 배열/클래스
 * 
 * 	데이터 요청처리
 * 		연산자, 제어문
 * 
 * 	출력
 * 		윈도우(Application)
 * 		브라우저
 * 		모바일
 * 
 * 	변수 : 한 개의 데이터를 메모리에 저장해서 사용
 * 		어떤 데이터 저장할지 (bit에는 0과 1만 저장된다)
 * 			정수: byte, 8bit : -127 ~ 127 => 파일(업로드, 다운로드)
 * 				int, 32bit : -21억 4천 ~ 21억 4천
 * 				long, 64bit : 금융권 / 빅데이터 / AI
 * 			실수: double, 8byte : 소수점 15자리 (정밀도)
 * 			문자: char, 2byte : 0~65535
 * 				'A', '홍'
 * 			논리: true / false => 반복문/조건문
 * 			문자열: 여러개의 문자를 저장
 * 				"홍길동", "주소".... 문자 제한이 없다
 * 
 * 	
 * 	데이터형 정리
 * 		1byte	2byte	4byte	8byte
 * ------------------------------------------
 * 	정수	byte	short	int		long
 * 	실수					float	double
 * 	문자			char
 * 	논리	boolean
 * 
 * 	연산자
 * 		단항연산자
 * 			= 증감연산자 ++ --
 * 			= 부정연산자 ! => true/false (boolean)
 * 			= 형변환연산자 (자동형변환) (강제형변환)
 * 					'A' => 65
 * 					'a' => 97
 * 					'0' => 48
 * 				표현법
 * 				=> 정수형 : 10(10진법), 0xA(16진법), 012(8진법), 0b1010(2진법)
 * 				=> 실수형 : 10.5(double)
 * 				=> 문자 : 'A'
 * 				=> 논리형 : boolean b = true;
 * 				=> 문자열: String s = "Hello Java!!"
 * 		이항연산자
 * 			= 산술연산자 + - * / %
 * 					+ : "10" + 10 => 1010 (문자열결합)
 * 					/ : 0으로 나누면 오류 발생(Infinity)
 * 					% : 0으로 나머지 값을 구하면 (NaN)
 * 			= 비교연산자 == != > < >= <=
 * 					정수 / 실수 / 문자 / 논리는 일부만 사용이 가능
 * 			= 논리연산자 결과값: true/false
 * 					1. 효율적인 연산
 * 					2. 조건문/반복문에서 주로 사용
 * 					3. 두개를 동시에 처리
 * 					4. 게임 => 범위 지정
 * 					5. && => 범위나 기간이 포함(어디~어디까지) / || => 범위나 기간에 포함이 안 된 상태
 * 			 
 * 			= 대입연산자 = += -= : 가장 나중에 연산되는 연산자
 * 		삼항연산자
 * 			==> if~else : 단순화한 연산자
 * 			(조건) ? 값1 : 값2		=>	(조건)이 참이면 값1, 거짓이면 값2
 * 
 * 
 */
public class 자바변수연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프로그램 시작
		
//		int kor = 90;
//		kor++;
//		System.out.println("국어: " + kor);
//		
//		int eng = 80;
//		eng--;
//		System.out.println("영어: " + eng);
//		
//		// true와 false만 저장 가능
//		boolean b = false;
//		System.out.println("반대: " + !b);
		
		// 산술연산자
		int kor = 80;
		int eng = 78;
		int math = 90;
		
		// 총점
		int total = kor + eng + math;
		// 평균
		double avg = total / 3.0;
		
		// 출력
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", avg);	// 반올림이 된다
		// 정수: %d
		// 실수: %f
		// 문자: %c
		// 문자열: %s
		
		System.out.println("====== % 나누고 나머지 ======");
		System.out.println("5%2="+(5%2));
		System.out.println("5%-2="+(5%-2));
		System.out.println("-5%2="+(-5%2));
		System.out.println("-5%-2="+(-5%-2));	// 나머지 계산을 할때 부호는 왼쪽항의 부호를 따른다
		
		int num = 100;
		String result = (num%2==0) ? "짝수" : "홀수";
		System.out.println(result);
		

	}

}
