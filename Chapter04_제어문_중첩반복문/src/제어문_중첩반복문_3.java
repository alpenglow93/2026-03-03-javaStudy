/*
 * 	★★★★★
 * 	★★★★★
 * 	★★★★★
 * 	★★★★★
 * 	★★★★★	=> 줄 수 5개 별 5개
 * 
 * 
 * 	ABCD
 * 	EFGH
 * 	IJKL
 * 	MNOP
 * 
 * 	ABCD
 * 	ABCD
 * 	ABCD
 * 	ABCD
 * 
 */
public class 제어문_중첩반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 1; i<= 5; i++)	// 세로 다섯줄
//		{
//			for(int j = 1; j <= 5; j++)	// 가로 별 다섯개
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}

//		char c = 'A';
//		for(int i = 1; i <= 4; i++)
//		{
//			for(int j = 1; j <= 4; j++)
//			{
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <= 4; i++)
		{
			char c = 'A';	// 변수의 위치에 따른 출력 결과가 달라지므로 위치 중요함
			for(int j = 1; j <= 4; j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
		
	}

}
