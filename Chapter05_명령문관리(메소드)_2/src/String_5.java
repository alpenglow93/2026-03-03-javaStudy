// 문자열 잘라내기 => 162page
/*
 * 	Hello Java
 * 	0123456789
 * 
 * 	원하는 위치부터 뒤에 전체
 *		substring(6) 6번 인덱스부터 다 잘라라
 * 	부분적으로 자르기
 * 		substring(2,5)	2번부터 5번 잘라라 (234를 가져옴)
 * 
 * 		String substring(int start);	// start부터 맨 마지막까지 잘라냄
 * 		String substring(int start, int end)	// start부터 end까지	(end-1) 
 *
 * 		문자열을 자르는 경우
 * 		| 웹 => equals / substring / indexOf, lastIndexOf
 * 			=> trim() / split() / valueOf
 * 			이 정도를 많이 사용
 * 
 * 		
 * 
 */
public class String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg = "0123456789";
		
		// 3부터 전체를 가져와라
		System.out.println(msg.substring(3));	// 3456789
		// 1~5까지 가져와라
		System.out.println(msg.substring(1, 6));	// 12345
		
		// 우편번호 자르기
		String post = "100-111";
		System.out.println(post.substring(0, 3));	// 100
		System.out.println(post.substring(4));		// 111

		String title = "Hello Java,Oracle!!";
		String temp = title.substring(0, 10) + "...";
		System.out.println(temp);	// Hello Java...
		// 화면 UI => HTML의 단점은 있는 그대로 출력
	}

}
