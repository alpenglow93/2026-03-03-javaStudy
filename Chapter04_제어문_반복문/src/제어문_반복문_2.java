/*
 *  UP / DOWN
 *  	컴퓨터에서 1~100 사이의 숫자를 임의로 추출 => 난수
 *  
 *  	사용자 입력
 *  		난수 > 입력값 ==> UP
 *  		난수 < 입력값 ==> DOWN
 *  		난수 = 입력값 ==> 종료
 *  	for(;;)
 *  	System.exit(0);
 *  
 */
import java.util.Scanner;
import java.util.Random;
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Random r = new Random();
		int com = r.nextInt(100)+1;	//	1~100 사이의 임의의 값 추출
		
		// 무한루프 => 횟수가 지정되지 않은 상태 (while)
		for(;;)	// 반드시 종료시점을 지정한다
		{
			System.out.print("1~100 사이의 정수 입력: ");
			int user = scan.nextInt();
			//System.out.println("USER Input: "+user);
			if(com>user)
				System.out.println("입력값보다 큰수를 입력(UP)");
			else if(com<user)
				System.out.println("입력값보다 작은수를 입력(DOWN)");
			else
			{
				// 같은 경우 종료
				System.out.println("Game OVER!!");
				System.exit(0);
				
			}
		}

	}

}
