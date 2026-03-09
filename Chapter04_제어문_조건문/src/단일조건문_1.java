/*
 * 	if(조건문)
 * 	{
 * 		실행 문장 ==> 조건 true일때 수행하는 문장
 * 	}
 * 
 * 	난수 3개 발생
 * 	최대값/최소값 => if
 * 
 * 		// 난수 발생
		// Math.random() => 0.0 ~ 0.99
		/// 
		// Random r = new Random()
		// r.nextInt(100) + 1 => 0~99
 * 
 */
import java.util.Random;	// 이미 만들어진 클래스를 가지고 올 때 import
// 자바에서 제공하는 클래스 / 사용자 정의 클래스
public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		// new : 동적 메모리 할당 => heap 영역에 저장 => 클래스를 저장할때 사용
		int num1 = r.nextInt(100) + 1; // r.nextInt(100) => 0~99 난수 발생
		// 0~100
		int num2 = r.nextInt(100) + 1;
		int num3 = r.nextInt(100) + 1;

		System.out.println(num1+", "+num2+", "+num3);
		
		// 요청 처리 => 사용자
		int max = num1;
		if(max <num2)
			max = num2;
		if(max<num3)
			max = num3;
		
		int min = num1;
		if(min > num2)
			min = num2;
		if(min > num3)
			min = num3;
		
		System.out.println("최대값: "+ max);
		System.out.println("최소값: " + min);

		// 중간값 출력
		int middle = num1+num2+num3 - max - min;
		System.out.println("중간값: " + middle);
		
		// 최대값 / 최소값 => 비교하는 데이터를 대입
		// 최대값은 제일 작은수부터, 최소값은 제일 큰 숫자부터 비교
	}

}
