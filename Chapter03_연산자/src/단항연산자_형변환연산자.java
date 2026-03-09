/*
 * byte < char < int < long < double
 * 		=> boolean / String은 이걸로 형변환이 안 됨. . . .
 * 
 * 형변환연산자는 필요시에만 사용
 * 
 */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor		= 80;
		int eng		= 78;
		int math	= 87;
		
		int count = 3;
		
		int total = kor + eng + math;
		//double avg = total / count;	// 정수 / 정수 = 정수 인데 이것을 double형에 넣으면 소수점이 나오지 않게 됨 
		double avg = total / (double)count;
		
		System.out.println("총점: " + total);
		System.out.println("평균 출력: " + avg);
		
		char c = 'A';
		System.out.println((int)c);
		int i = 65;
		System.out.println((char)i);

		//형변환을 잘못하면 안되는 예
		int a = 123456;
		//double d = 123456.78;	// double로 계산하면 77이 나오는데 float로 계산하면 78이 된다. 바이트수가 다르기 때문에 생기는 오류
		float d = 123456.78f;
		int r = (int)((d-a) * 100);
		System.out.println(r);
		
		
	}

}
