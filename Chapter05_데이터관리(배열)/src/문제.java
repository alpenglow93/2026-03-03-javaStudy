/*
 * 	배열 : 같은 유형 데이터를 여러개 모아서 관리할 목정
 * 		=> 가변형 / 필요 데이터 저장이 가능 => 컬렉션
 * 				( ArryaList / LinkedList / Vector / Map / Set )
 * 	1) 특징
 * 		= 연속적인 메모리 할당 => 인덱스를 이용한 접근
 * 		= 고정된 크기
 * 			배열 크기는 선언시에 정해진다 (한 번 선언하면 변경 불가능)
 * 			1. 선언
 * 				데이터형[] 배열명={값...}; // 선언과 동시에 초기화
 * 				데이터형[] 배열명 = new 데이터형[개수];
 * 		= 동일한 데이터 타입(가급적)
 * 	2) 장점
 * 		= 빠른 접근 속도 => 인덱스번호를 이용하기 때문
 * 			원래 => CPU 자주 사용시 데이터를 cache에 저장후 사용
 * 		= 간단한 구현 : 배열의 데이터 저장 구조 => 단순하다
 * 		= 고정된 크기 : 메모리의 사용량을 예측 => 메모리 관리가 쉽다
 * 	3) 단점
 * 		= 고정된 크기 : 추가, 삭제 어렵다 (비용이 많이 든다)
 * 		= 메모리 낭비 : 크게 만들면(사용이 없는 메모리)
 * 					적게 만들면 데이터 추가 저장이 어렵다
 * 		= 같은 데이터형만 저장 => 유연성이 떨어진다
 * 	4) 배열선언
 * 		데이터형[] 배열명
 * 	5) 초기화
 * 		선언과 동시에 초기화
 * 		데이터형[] 배열명 = { 값, 값... } => 명시적 초기화
 * 		디폴트 생성
 * 		데이터형[] 배열명 = new 데이터형[갯수]
 * 				int		=> 0
 * 				long	=> 0L
 * 				double	=> 0.0
 * 				boolean	=> false
 * 				String	=> null
 * 	6) 반복문을 이용 출력 방법
 * 		=> for-each (향상된 for)	=> 브라우저 화면 UI 출력에 많이 씀
 * 			for(변수선언:배열명)
 * 			// 변수에는 배열의 실제 저장된 값을 받는다 (인덱스를 이용하지 않고 실제 저장된 값을 이용한다)
 * 			// 배열명은 배열의 저장 위치
 * 			// 자동으로 종료
 * 			// 배열범위 초과시에 오류 발생 => for-each에서는 발생하지 않고 그냥 끝난다
 * 	7) 저장 위치가 다르다
 * 		int[] arr = {10,20,30};
 * 		arr에는 주소가 저장됨(stack)	//	heap 공간에 10 20 30 이 저장되고 해당 주소를 arr이 갖고있게된다
 * 
 * 		실제 저장된 메모리 주소를 이용하는 데이터형 => 참조 데이터형	(배열, 클래스)
 * 
 * 
 * 
 */
import java.util.Scanner;
public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		// 
		int[] num = new int[10];
		//int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("정수 10개 랜덤 입력");
		for(int i = 0; i < num.length; i++)
		{
			num[i] = (int)(Math.random()*100 + 1);
			if(num[i] % 3 == 0)
				System.out.print(num[i] + " ");
		}		
		System.out.println();
		System.out.println();
		
		//
		int[] number = new int[10];
		double avg = 0;
		int sum = 0;
		for(int i = 0; i < number.length; i++)
		{
			number[i] = (int)(Math.random() * 10) + 1;
			
			sum += number[i];
		}
		
		for(int a:number)
			System.out.print(a + " ");
		System.out.println("\n평균: " + (sum/(double)number.length));
		
		System.out.println();
		System.out.println();

		//
		int[] arr = new int[5];
		System.out.println("정수 5개 랜덤 입력");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random()*5 + 1);
		}
		System.out.print("정수 출력: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//
		char[] arr2 = new char[10]; 
		System.out.println("문자 10개 랜덤 입력");
		for(int i = 0; i < 10; i++)
		{
			arr2[i] = (char)(Math.random()*10 + 65);
		}
//		System.out.print("문자 10개 입력: ");
//		for(int i = 0; i < 10; i++)
//		{
//			arr2[i] = scan.next().charAt(0);
//		}
//		System.out.print("문자 출력: ");
		for(int i = 0; i < 10; i++)
		{
			System.out.print(arr2[i]);
		}
		
		System.out.println();
		System.out.println();
		
		//
		int[] arr3 = new int[10];
		System.out.println("정수 10개 랜덤 입력");
		for(int i = 0; i < 10; i++)
		{
			arr3[i] = (int)(Math.random()*100 + 1);
		}
//		System.out.print("정수 10개 입력: ");
//		for(int i = 0; i < 10; i++)
//		{
//			arr3[i] = scan.nextInt();
//		}
		System.out.printf("세번째, 다섯번째, 마지막 정수 출력: %d %d %d\n", arr3[2], arr3[4], arr3[arr.length-1]);
		
		System.out.println();
		System.out.println();
		
		//
		int[] arr4 = new int[10];
		int max = 0;
		System.out.println("정수 10개 랜덤 입력");
		for(int i = 0; i < 10; i++)
		{
			arr4[i] = (int)(Math.random()*100 + 1);
			if(max<arr4[i])
				max = arr4[i];
		}
//		System.out.print("정수 10개 입력: ");
//		for(int i = 0; i < 10; i++)
//		{
//			arr4[i] = scan.nextInt();
//			if(max<arr4[i])
//				max = arr4[i];
//		}
		
		System.out.println("가장 큰 수 출력: " + max);
		
		//
		sum = 0;
		for(int i : arr4)
		{
			sum+=i;
		}
		System.out.println("sum=" + sum);
		System.out.printf("평균:%.2f\n", sum/10.0);
		
		
		//
		
		
		
	}

}
