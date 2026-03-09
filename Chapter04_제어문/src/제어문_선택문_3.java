import java.util.Scanner;
public class 제어문_선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int com = (int)(Math.random()*3);	// 0, 1, 2
		
		System.out.print("가위(0), 바위(1), 보(2): ");
		int user = scan.nextInt();
		if(user>=0 && user<=2)	// 012 정상입력여부 검사
		{
			System.out.print("컴퓨터: ");
			switch(com)
			{
			case 0:
				System.out.print("가위");
				break;
			case 1:
				System.out.print("바위");
				break;
			case 2:
				System.out.print("보");
				break;
			}
			System.out.println();
			
			System.out.print("사용자: ");
			switch(user)
			{
			case 0:
				System.out.print("가위");
				break;
			case 1:
				System.out.print("바위");
				break;
			case 2:
				System.out.print("보");
				break;
			}
			
			// com - user
			// 
			
			System.out.println("\n====== 결과 ======");
			switch (com-user)
			{
			case 1:
			case -2:
				System.out.println("ㅠㅠ");
				break;
			case -1:
			case 2:
				System.out.println("Win!!");
			break;
			case 0:
				System.out.println("비겼다");			}
		}
		else
		{
			System.out.println("Game Over!!");
		}
		

	}

}
