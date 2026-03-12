/*
 * 	1. 몇 줄 출력 => 1차 for문
 * 	2. 내용물	=> 2차 for문
 * 	3. 1차 종료 ==> for 종료
 * 
 * Label: // ~ break Label; // 
 * 	for()
 * 	{
 * 		for()
 * 		{
 * 			if()
 * 			{
 * 				break;	// 여기에 도달하면 내부에 있는 2차 for문만 종료된다
 * 			}
 * 		}
 * 	}
 * 
 * 	break / continue => 자신의 반복문만 제어
 * 
 * 
 * 	for(int i = 1; i <= 3; i++)
 * 	{
 * 		for(int j = 1; j <= 3; j++)
 * 		{
 * 			출력물
 * 		}
 * 		줄바꿈
 * 	}
 * 
 * 	i=1 i<=3 ==> 이차 for j=1 j=2 j=3 => i++
 * 	i=2 i<=3 ==> 이차 for j=1 j=2 j=3 => i++
 * 	i=3 i<=3 ==> 이차 for j=1 j=2 j=3 => i++
 * 	i=4 ==> 종료
 */
public class 제어문_중첩반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <=3; j++)
			{
				System.out.println("i="+i+",j="+j);
			}
		}
		// 더블클릭으로 중단점 넣어서 Debug as -> F6을 누르면 한 줄씩 실행
	}

}
