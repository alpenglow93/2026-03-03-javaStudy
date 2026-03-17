// 문자열 분리
// => split
/*
 * 	원형
 * 	String[] split(String regex);
 * 	
 * 	=> regex 는 정규식
 */
public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "red,green,blue,yellow,black,magenta,pink";
		String[] colors = color.split(",");
		// , 를 기준으로 모두 잘라냄
		for(String c:colors)
		{
			System.out.println(c);
		}
		
		color = "red|green|blue|yellow|black|magenta|pink";
		String[] colors2 = color.split("\\|");	// | 구분자는 그냥 쓰면 한 글자로 잘려버림 => \\| 라고 써줘야한다
		// 정규식의 기호
		/*
		 *  |
		 *  .
		 *  ?
		 *  *
		 *  +
		 *  이것들은 \\를 붙여서 사용해줘야한다
		 */
		
		for(String c:colors2)
		{
			System.out.println(c);
		}

	}

}
