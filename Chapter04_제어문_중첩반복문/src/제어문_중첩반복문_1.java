/*
 * 	중첩
 * 			ex)로그인이 된 경우
 * 		if(조건문) => if(조건문 && 조건문)
 * 		{
 * 				ex)관리자라면
 * 			if(조건문)
 * 			{
 * 			}
 * 		}
 * 
 * 	-------------------------
 * 
 * 		for(초기값;조건식;증감식)	===> 세로 출력 (줄수)
 * 		{
 * 			for(초기값;조건식;증감식)	===> 가로 출력 (실제 출력물)
 * 			{
 * 				반복 수행 문장
 * 			}
 * 		}
 * 
 * 
 * 
 */
public class 제어문_중첩반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 구구단		
		for(int i = 1; i <= 9; i++)	// 9줄을 만든다 (세로줄)
		{
			for(int j = 2; j<=9; j++)	// 8개를 출력 (가로줄)
			{
				System.out.printf("%d * %d = %2d\t", j, i, j*i);
				// \t : tab (일정간격을 띄워라)
				// %2d : 두 칸의 간격을 줌
			}
			System.out.println();
		}

	}

}
