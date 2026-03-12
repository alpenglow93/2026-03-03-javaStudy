// => 컴퓨터 => 가위바위보 10번 => 2승 2무 6패
import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win = 0, lose = 0, same = 0;
		String[] res = { "가위", "바위", "보" };
		
		Scanner scan = new Scanner(System.in);
		for(int i = 1; i <= 10; i++)
		{
			int com = (int)(Math.random()*3);
			System.out.print("가위(0), 바위(1), 보(2): ");
			int user = scan.nextInt();
			if(user<0 || user>2)
			{
				System.out.println("잘못된 입력입니다!");
				i--;	// 잘못 입력했다고 게임 횟수 차감되면 안되니까
				continue;	// i++ 증가식으로 이동
			}
			
			System.out.println("컴퓨터: " + res[com]);
			System.out.println("사용자: " + res[user]);
			
			int r = com - user;
			if(r==-1 || r==2)
			{
				win++;
				System.out.println("승");
			}
			else if(r==1 || r==-2)
			{
				lose++;
				System.out.println("패");
			}
			else
			{
				same++;
				System.out.println("무");
			}
			
		}
		
		System.out.printf("결과: %d승-%d무-%d패\n", win, same, lose);
		
//		int com = (int)(Math.random()*3);	// 0 1 2
//		Scanner scan = new Scanner(System.in);
//		System.out.print("가위(0), 바위(1), 보(2): ");
//		int user = scan.nextInt();
//		System.out.println("사용자: " + res[user]);
//		System.out.println("컴퓨터: " + res[com]);
//		
////		if(com==0)
////			System.out.println("가위");
////		else if(com==1)
////			System.out.println("바위");
////		else if(com==2)
////			System.out.println("보");
//		
//		System.out.println("===== 결과값 =====");
//		int r =com-user;
//		if(r==-1 || r==2)
//			System.out.println("User Win!!");
//		else if(r==1 || r==-2)
//			System.out.println("ㅠㅠ");
//		else
//			System.out.println("비겼다");
		
		

	}

}
