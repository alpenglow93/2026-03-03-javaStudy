/*
 * 	문자열 비교 => equals() => 로그인처리
 * 	== (equals), != (!equals)
 */
import java.util.Scanner;
public class 제어문_선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// admin / 1234
		System.out.println("ID 입력: ");
		String id = scan.next();
		
		System.out.println("비밀번호 입력: ");
		String pwd = scan.next();
		
		//if(id=="admin" && pwd=="1234")	// 문자열 자체가 아닌 메모리 주소를 비교하기 때문에 제대로 된 비교가 안 됨
		if(id.equals("admin") && pwd.equals("1234"))
		{
			System.out.println("로그인되었습니다");
		}
		else
		{
			System.out.println("ID 혹은 Password가 틀립니다");
		}
		

	}

}
