// 어디까지가 한개의 기능 => 메소드
/*
 * 	// 소스는 변경 사항이 없다
 * 	1. 난수 발생 => 3개의 난수 발생 => 중복 없는 난수
 * 	2. 사용자 입력
 * 		=> 유효성 검사
 * 	3. 난수 / 사용자 입력 비교
 * 	4. 힌트 제공
 * 	5. 종료 여부
 * 
 * 	static boolean isYear(int year)
 * 	{
 * 		boolean bCheck = false;	// for문에서는 이런식으로 밖에서 false라는 디폴트값을 잡아놓고 for문 안으로 들어가서
 * 									// if를 수행하지 않을 경우엔 따로 else문을 넣어 false를 대입할 필요가 없게 만드는 방법
 * 		if((year%4==0)&&(year%100!=0)||(year%400==0))
 * 		{
 * 			bCheck = true;
 * 		}
 * 
 * 		return bCheck;
 * 	}
 * 
 */
import java.util.*;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 난수 발생	===> Set 클래스를 사용하면 중복이 없음 (중복 없는 데이터 저장)
		// => DISTINCT
		int[] com = new int[3];
		for(int i = 0; i < com.length; i++)
		{
			com[i] = (int)(Math.random() * 9) + 1;	// 1~9
			// 중복체크
			for(int j = 0; j < i; j++)	// 첫번째는 검사하지 않는다
			{
				if(com[j] == com[i])
				{
					// com[j] => 기존의 저장된 데이터
					// com[i] => 지금 발생한 난수
					i--;	// 원상복귀 => 해당 위치의 데이터 다시 저장
					break;
				}
			}
			
		}
		// 위 방법으로 중복체크할수도 있고 아래 방밥으로 중복체크할수도 있고
//		int su = 0;
//		boolean bCheck = false;
//		for(int i = 0; i < com.length; i++)
//		{
//			bCheck = true;
//			// 중복 체크 => 중복 => bCheck:true / bCheck = false
//			while(bCheck)
//			{
//				su = (int)(Math.random()*9)+1;
//				bCheck = false;	// while문 종료
//				for(int j = 0; j<i; j++)
//				{
//					if(com[j]==su)
//					{
//						bCheck=true;	// while문 수행
//						break;
//					}
//				}
//			}
//			com[i] = su;
//		}
		System.out.println(Arrays.toString(com));

		// 사용자 입력
		Scanner scan = new Scanner(System.in);
		int[] user = new int[3];
		while(true)
		{
			System.out.print("세자리 정수 입력: ");
			int input = scan.nextInt();
			
			// 정상 입력인지 확인
			if(input<100 || input>999)
			{
				System.err.println("세자리 정수만 입력해야됩니다");
				// 처음으로 돌아가기
				continue;	// while => 조건식으로 이동
			}			
			
			// 배열에 저장 => 369/100	각 자리수를 추출하는 방법
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			// 같은 수(X), 0(X)
			if(user[0] == user[1] || user[1]==user[2] || user[0] == user[1])
			{
				System.err.println("같은 수는 사용할 수 없습니다");
				// 처음으로 돌아가기
				continue;	// while => 조건식으로 이동
			}
			if(user[0] == 0 || user[1] == 0 || user[2] == 0)
			{
				System.err.println("0은 사용할 수 없습니다");
				// 처음으로 돌아가기
				continue;	// while => 조건식으로 이동
			}
			
			// 비교
			int s = 0, b = 0;
			for(int i = 0; i<3; i++)	// com
			{
				for(int j = 0; j < 3; j++)	// user
				{
					if(com[i] == user[j])	// 같은 수 찾기
					{
						if(i==j)
							s++;	// 같은 자리에 있는 경우
						else
							b++;	// 다른 자리에 있는 경우						
					}
				}
			}
			
			// 힌트
			System.out.print("S: ");
			for(int i = 0; i < s; i++)
			{
				System.out.print("●");
			}
			System.out.print("\nB: ");
			for(int i = 0; i < b; i++)
			{
				System.out.print("○");
			}
			System.out.println();
			// 종료 여부 확인
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}
		
	}

}
