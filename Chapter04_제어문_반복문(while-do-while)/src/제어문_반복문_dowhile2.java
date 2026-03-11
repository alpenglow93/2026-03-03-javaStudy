/*
 * 	난수 => 1~100 사이 수 임의 추출
 * 	=> 이 값을 맞추는 게임 (UP, DOWN)
 */
import java.util.*;
// Random과 Scanner를 임포트 해야해서 *로 다 넣어버림
public class 제어문_반복문_dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 컴퓨터 난수 발생
		Random r = new Random();
		int com = r.nextInt(100) + 1;	// 100: 바운더리 (0~99)
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("1~100사이의 정수 입력: ");
			int user = scan.nextInt();
			
			// 사용자가 잘못 입력한 경우
			if(user < 1 || user > 100)
			{
				System.out.println("잘못된 입력입니다");
				continue;	// 처음으로 이동
			}
			
			// 결과 비교
			if(com>user)
				System.out.println("입력값보다 큰 값 입력(UP)");
			else if(com<user)
				System.out.println("입력값보다 작은 값 입력(DOWN)");
			else
			{
				System.out.println("Game Over!!");
				break;
				// break, continue => 밑에는 코딩하면 오류 (Unreachable code)
				//System.out.println("a"); // 오류남
			}
				
			
		} while(true);

	}

}
