/*
 * Chapter 01
 * 	1. 4page => 자바구동 (javac/java)
 * 		=> 15page
 * 	2. 29page
 * 	3. 30page
 * 
 * Chapter 02
 * 	1. 변수
 * 		36page : 한개의 데이터 저장
 * 					데이터형 변수명;
 * 					변수명 = 값;
 * 					데이터형 변수명 = 값;
 * 		37page : 지역변수
 * 				블록{} 이 끝나면 자동으로 삭제
 * 				반드시 사용 전에 초기화
 * 				변수명칭 => 캐멀 => 변수는 소문자 시작, 두번째 단어는 대문자 (문법은 아니나 규칙사항)
 * 		38page : 변수명의 길이 => 3~10
 * 				=> 어떤 용도인지 주석
 * 
 */
public class 자바_연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		{
			int b= 20;
			{
				int c = 30;
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
			}
			System.out.println("a="+a);
			System.out.println("b="+b);
			//System.out.println("c="+c);
		}
		System.out.println("a="+a);
		//System.out.println("b="+b);
		//System.out.println("c="+c);
	}

}
