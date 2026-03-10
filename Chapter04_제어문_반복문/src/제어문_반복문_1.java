/*
 * 사용자로부터 단을 받아서 구구단
 * 5
 * 5*1=5
 * ...
 * 5*9=45
 * 
 */
import java.util.Scanner;
public class 제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력: ");
		int dan = scan.nextInt();
		
		// 구구단 처리
		for(int i = 1 ; i <= 9 ; i++)
		{
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		
		System.out.println();	// 다음줄에 출력
		
		for(int i = 9 ; i >= 1 ; i--)
		{
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		
		System.out.println();
		
		String str = "Hello Java";
		
		// str.length() : 문자 갯수
		for(int i = 0 ; i < str.length(); i++)
		{
			System.out.print(str.charAt(i));	// charAt() : 문자 한 개 추출
		}
		
		System.out.println();
		
		// length는 문자 갯수이고 string은 0부터 시작하기 때문에 1을 빼줘야함 (lenght는 인덱스보다 1이 많다)
		for(int i = str.length()-1; i >= 0 ; i--)
		{
			System.out.print(str.charAt(i));	// charAt() : 문자 한 개 추출
		}
		
		System.out.println();
		
		int a = 0;	// 대문자 갯수 저장
		int b = 0;	// 소문자 갯수 저장
		
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);	// 알파벳을 한 개 읽기
			if(c >= 'A' && c <= 'Z')
				a++;
			if(c >= 'a' && c <= 'z')
				b++;
		}
		
		System.out.println("대문자 갯수: " + a);
		System.out.println("소문자 갯수: " + b);
		
	}

}
