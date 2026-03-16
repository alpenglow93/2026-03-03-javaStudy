/*
 * 	1. 사용자로부터 아이디를 받아서 중복체크하는 메소드 원형을 작성하시오
 * 		static boolean idCheck(String id)
 * 
 * 	2. 우편번호를 검색하는 메소드 원형을 작성하시오
 * 		static String[] postFind(String dong)
 * 		static void postFind(String dong)
 * 
 *	3.2단에서 9단까지 구구단을 출력하는 메소드 원형을 작성하시오
 *		static void gugudan()
 * 
 */
public class 문제_1 {
	
	// 1. 1~10까지 출력하는 메소드 구현
	static void num1()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i+" ");
		}
	}
	
	// 2. 1~10까지 합을 구하는 메소드 구현
	static int num2()
	{
		int sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			sum+=i;
		}
		
		return sum;
	}
	
	// 3. 1~n까지 합을 구하는 메소드 구현
	static int num3(int n)
	{
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			sum+=i;
		}
		
		return sum;
	}
	
	// 4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
	static void num4(int a, int b)
	{
		if(b==0)
		{
			System.out.println("0으로 나눌 수 없습니다");
		}
		else
		{
			System.out.printf("%d / %d = %d", a, b, a/b);
		}		
	}
	
	static String print4(int a, int b)
	{
		String result = "";
		if(b==0)
			result = "0으로 나눌 수 없습니다";
		else
			result = a + "/" + b + "=" + (a/(double)b);
		return result;
	}
	
	// 5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	static void num5(String str)
	{
		char c = ' ';
		for(int i = 0; i < str.length()-1; i++)
		{
			if(c>='A' && c<='Z')
			{
				System.out.print((char)(c+32));
			}
			else
			{
				System.out.print((char)(c-32));
			}			
		} 
	}
	
	static char change(char c)
	{
//		Character.toUpperCase(c);	// 대문자
//		Character.toLowerCase(c);	// 소문자
		// 라이브러리 + 사용자 정의 = 조립
		// 
		return (char)(c-32);
	}
	
	// 6. 문자열을 거꾸로 출력하는 메소드 구현
	// 그림을 거꾸로 출력하는 프로그램을 출력하시오 : 코딩테스트
	/*
	 * 	FileInputStream fis = new FileInputStream("파일경로명");
	 * 	byte[] buffer = new byte[4096];
	 * 
	 * 	for(int i = buffer.length-1; i>=0; i--)
	 * 	{
	 * 		System.out.println(buffer[i]);
	 * 	}	// 파일을 읽어들이는걸 뒤에서부터 하는 식으로 (바이트 배열을 거꾸로)
	 */
	static void num6(String str)
	{
		// 문자열을 뒤에서부터 읽기
		for(int i = str.length()-1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		num1();
		System.out.println();
		
		System.out.println(num2());
		
		System.out.println(num3(100));
		
		//num4(100, 25);
		System.out.println(print4(100,25));
		
		//num5("Hello Java");
		System.out.println(change('h'));
		
		num6("Hello Java!!");

	}

}
