/*
 * 	1. 배열 선언
 * 	2. 배열 초기화
 * 	3. 반복문을 이용한 데이터 출력
 * 	4. 배열 복사
 * 	5. 동적생성
 * 
 * 
 * 	1) 선언
 * 		데이터형[] 배열명;	권장사항
 * 		데이터형 배열명[];	C언어 호환
 * 
 * 		=> 정수 10개
 * 		int[] arr;
 * 		=> 문자
 * 		char[] arr;
 * 		=> 문자열
 * 		String[] arr
 * 		=> 실수
 * 		double[] arr;
 * 		=> 논리
 * 		boolean[] arr;
 * 
 * 	2) 몇개? => 초기화
 * 		10 20 30 40 50
 * 		int[] arr = {10, 20, 30, 40, 50};	// 선언과 동시에 초기화
 * 		===> 참조변수 (저장된 메모리의 주소만 가지고 있는 변수)
 * 		stack				heap
 * 		--arr--			---------------------
 * 		100					10 20 30 40 50
 * 		-------		100----------------------
 * 
 * 						arr[0] arr[1] arr[2] arr[3] arr[4]
 * 		사용법은 일반변수와 동일
 * 		범위를 초과하면 오류 발생	(ArrayIndexOutOfBoundsException)
 * 
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println("arr="+arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
//		arr[0]=100;
//		arr[1]=200;
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		//		arr.length => 배열의 갯수
		
		for(int i = 0; i < arr.length; i++)	// length는 갯수이고 인덱스는 0부터 시작이므로 <= 를 사용하면 오류가 남
		{
			System.out.println(arr[i]);
		}
		System.out.println("===============");
		// 향상된 for문 => 화면 출력 (브라우저에서 출력)
		for(int a:arr)	// arr 배열로부터 실제 저장된 값 a를 출력
		{
			System.out.println(a);
		}
		
		/*
		 * for(int a:arr)	// a: 실제 저장된 값을 가지고 온다(인덱스번호가 아님)
		 * 					// arr: 데이터가 모아진 상태 (배열, 컬렉션)
		 * 데이터형 동일 / 큰 데이터형으로 받을 수 있다
		 * 
		 * 	=> 데이터값 수정 : for each은 실제 값을 가져오기 때문에 값 변경이 안되므로 수정은 일반 for문 사용해야함
		 * 	=> 화면 출력 : for each
		 */
	}

}
