/*
 * 	break : 주로 사용
 * 			=> switch~case / 반복문에서 사용
 * 			=> 해당 제어문을 종료
 * 			=> if 안에서 사용하면 안된다 (반복문 없이 단독으로 if를 사용하는 경우)
 * 	continue : 반복문 안에서만 사용이 가능
 * 			=> for : 특정 부분 제외
 * 			=> while, do~while : 처음으로 되돌아갈때
 * 		자신의 반복문만 제어할 수 있다
 * 		for()
 * 		{
 * 			for()
 * 			{
 * 				break;	//	안쪽 for문만 탈출
 * 			}
 * 		}
 */
public class 제어문_반복제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 10; i++)
		{
			if(i==5) break;	// for문 종료
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		for(int i = 1; i <= 10; i++)
		{
			if(i==5) continue;	// 5를 제외하고 출력 (continue를 만나면 증감식으로 올라감)
			System.out.print(i+ " ");
		}

	}

}
