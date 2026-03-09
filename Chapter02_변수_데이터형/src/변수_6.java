/*
 * 		Sting : 문자열 여러개를 한번에 저장할 수 있는 참조형 데이터형
 * 
 * 		형식) String 변수명 = "";
 * 			=> 웹에서 가장 많이 사용되는 데이터형
 * 			=> 클래스형으로 사용이 가능 => 기능 사용
 * 
 * 		=> 문자열 결합
 * 			+ : 산술, 문자열 결합
 * 
 * 			"Hello" + " Java" = "Hello Java"
 * 			7+"7"+7 => "777"
 * 			"77"+7 => "777"
 * 			7+"7"+7+7+7 => "77777"
 * 			7+7+"7"+7+7 => 14777	// 앞에 두 숫자가 연산이 되고 그 뒤에 문자열이 붙어 뒤의 숫자들은 문자열 형식으로 붙음
 * 
 * 		boolean : 존재 여부
 * 				=> 장바구니에 값이 있는지? 회원가입을 했는지? 중복여부 로그인여부 턴 등등
 * 				=> 관리자 / 일반유저
 * 				=> true / false
 * 				=> 1byte(0, 1) - 자바에서는 0, 1을 안 쓰고 true false 만 사용한다
 * 					boolean bCheck = true / false; - 조건문 / 반복문에서 주로 사용
 * 				=> 데이터형의 크기는 사용할 수 없다 / 형변환도 안된다
 */
// 
public class 변수_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String hello = "Hello";
		String java = " Java";
		System.out.println(hello+java);
		System.out.println(7+7+"7"+7+7);
		*/
		
		//변수값 교환
		// Call By Value
		int a = 10;
		int b = 20;
		
		int temp = a;
		
		a = b;
		b = temp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
