/*
 * 	변환
 * 		toUpperCase : 대문자로 변환
 * 			=> String toUpperCase();	String은 불변이므로 변환한 값을 넘겨준다
 * 		toLowerCase : 소문자로 변환
 * 			=> String toLowerCase();
 * 		replace	: 지정된 문자(문자열) 변환
 * 			=> String replace(char c1, char c2);	// 앞이 찾는 문자, 뒤가 변경할 문자
 * 			=> String replace(String s1, String s2);
 * 				"Hello Java".replace('a', 'b');
 * 				=> "Hello Jbvb"
 * 				"Hello Java".replace("Java", "Oracle");
 * 				=> "Hello Oracle"
 * 		replaceAll : 정규식을 이용하는 방식
 * 		----------> 크롤링시에 / 어려운 문자가 있는 경우
 * 			맛있는 맛있고 맛있게... => 맛있*
 * 			=> replaceAll(regex, "변경할 문자")
 * 				regex
 * 					[A-Z] : 대문자 전체
 * 					[a-z] : 소문자 전체
 * 					[0-9] : 숫자 전체
 * 					^[A-Z] : 대문자 시작
 * 					[^A-Z] : 대문자 제외
 * 					[가-힣] : 한글 전체
 * 					. : 임의의 한 글자 
 * 
 * 	159~160page
 */
public class String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// toUpperCase
		// toLowerCase
		// 오라클 => 대소문자 구분을 하지 않는다 / 실제 저장된 데이터는 구분한다
		String msg = "Hello Java Javb Javc Javn";
		System.out.println("대문자로 변환: " + msg.toUpperCase());
		// . 메모리 주소 접근 연산자
		System.out.println("소문자로 변환: " + msg.toLowerCase());
		// msg = msg.toLowerCase(); // 이런 식으로 쓰면 바뀌지만 그냥 쓰면 안 바뀜 (원본은 가급적이면 유지)
		// 실제 데이터는 불변
		System.out.println("실제 원본 데이터: " + msg);
		
		// replace
		String s = msg.replace('l', 'k');	// l 문자를 다 k로 바꿔준다
		System.out.println(s);
		
		s = msg.replace("Java", "Spring");
		System.out.println(s);
		
		s = msg.replaceAll("Jav+", "Orar");	// Jav으로 시작하는 모든 단어를 Orar로 변경	(+ 뒷 글자가 한글자 이상 / * 뒷글자가 0글자 이상)
		System.out.println(s);
		// 여러개를 한번에 변경할때 사용
		
	}

}
