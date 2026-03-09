/*
 *	if(조건)
 *	{
 *		조건 true일때
 *	}
 *	else
 *	{
 *		조건 false일때
 *
 *	}
 *
 *	// 짝수 / 홀수 => 1~100
 *		
 */
import java.util.Random;
public class 선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int i = r.nextInt(100) + 1;	// 1~100 사이의 정수 추출
		
		System.out.println("정수값: " + i);
		
		if(i%2==0)
			System.out.println(i + "는 짝수입니다");
		else
			System.out.println(i + "는 홀수입니다");
		
		char c = 'A';
		if(c>='A' && c<='Z')
			System.out.println(c+"는 대문자입니다");
		else// if(c>='a' && c<='z')
			System.out.println(c+"는 소문자입니다");

	}

}
