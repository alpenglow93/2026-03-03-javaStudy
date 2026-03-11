/*
 * 	1~100 사이의 총합 / 짝수 합 / 홀수 합
 * 	=> 4개 변수
 * 		1~100 변경되는 변수 => 루프변수
 * 		총합, 짝수합, 홀수합 변수
 */
public class 제어문_반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, even = 0, odd = 0;
		
		int i = 1;
		while(i<=100)
		{
			// 처리문장
			sum+=i;
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			// i ==> 100이 될 때 까지 증가
			i++;
		}
		
		System.out.println("총합: " + sum);
		System.out.println("짝수합: " + even);
		System.out.println("홀수합: " + odd);

	}

}
