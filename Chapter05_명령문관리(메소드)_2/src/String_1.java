/*
 * 	웹 개발
 * 		String / ArrayList / Integer
 * 		자바에서 지원하는 메소드들도 기억하기 => 리턴형/매개변수/어떤 값을 가져오는지
 * 
 * 	비교
 * 		equals / equalsIgnoreCase
 * 		ID/PWD		검색
 * 		( equals는 대소문자 구분을 하고 / equalsIgnoreCase는 대소문자 구분이 없다)
 * 
 * 
 * 
 */
public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hong = "admin";
		String shim = "admin";
		String park = new String("admin");	// new는 새로운 메모리를 할당
		String lee = "Admin";
		
		if(hong==shim)	// 같은 문자열이면 동일한 메모리를 참조한다
		{
			System.out.println("hong과 shim은 같다");
		}
		else
		{
			System.out.println("hong과 shim은 같지않다");
		}
		
		if(hong==park)	// new 로 참조되어 주소가 다르게 된다
		{
			System.out.println("hong과 park은 같다");
		}
		else
		{
			System.out.println("hong과 park은 같지않다");
		}
		
		if(hong.equals(park))	// hong이 참조하는 문자열과 park이 참조하는 문자열이 같은지 비교
		{
			System.out.println("hong과 park은 같다");
		}
		else
		{
			System.out.println("hong과 park은 같지않다");
		}
		// 가급적이면 == 보다 equals() 사용
		// => 상세보기 / 아이디 찾기 / 비밀번호 찾기 / 로그인
		
		if(hong.equals(lee))	// equals()는 대소문자를 구분한다
		{
			System.out.println("hong과 lee은 같다");
		}
		else
		{
			System.out.println("hong과 lee은 같지않다");
		}
		
		/*
		 * 	boolean equalsIgnoreCase(String s)
		 * 	boolean equals(String s)
		 * 	---> 조건문에서 주로 사용
		 */
		
		if(hong.equalsIgnoreCase(lee))	// equalsIgnoreCase()는 대소문자를 구분하지 않는다 (검색)
		{
			System.out.println("hong과 lee은 같다");
		}
		else
		{
			System.out.println("hong과 lee은 같지않다");
		}

	}

}
