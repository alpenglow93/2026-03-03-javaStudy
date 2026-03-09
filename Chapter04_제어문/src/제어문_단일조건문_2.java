// if 15를 넣었을때 3배수 5배수 7배수
// 로그인 체크, 유효성 검사
public class 제어문_단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 15;
		if(num%3==0)	// 3의 배수면
		{
			System.out.println(num + "는(은) 3의 배수입니다");
		}
		if(num%5==0)	// 5의 배수면
		{
			System.out.println(num + "는(은) 5의 배수입니다");
		}
		if(num%7==0)	// 7의 배수면
		{
			System.out.println(num + "는(은) 7의 배수입니다");
		}
	}

}
