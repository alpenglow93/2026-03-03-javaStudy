/*
 * 	생성자 선언 => 모든 클래스에서 제작하는 것은 아니다
 * 				필요시에만 만든다
 * 	=> 없는 경우에 자동으로 생성이 되어 있다
 */
class Student
{
	int hakbun;
	String name;
	int kor, eng, math;
	// => 변수값을 다르게 저장 (초기값을 다르게 생성)
	Student(int h, String n, int k, int e, int m)
	{
		System.out.println("this: " + this);
		// 값을 다르게 저장하는 경우
		hakbun = h;
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	Student(int hakbun, String name)
	{
		this.hakbun = hakbun;	// 멤버변수와 매개변수 이름이 같은데 그대로 쓰면 대입이 되지 않음 (지역변수 우선순위)
		this.name = name;		// this 키워드로 멤버변수가 누구인지 명시해줘야함
		// this => 자신의 객체명
		// 이것도 이름이 다를 경우 생략이 된것
		
		/*
		 * 	객체 생성
		 * 	=> Student s = new Student(1, "심청이");
		 * 	
		 * 		this = s;
		 * 			모든 클래스는 this를 갖고있다
		 * 			실행할때마다 this의 주소가 변경
		 * 			static Object this
		 * 		this는 멤버에서만 사용이 가능
		 * 		=> static은 this가 존재하지 않는다 
		 */
	}
	
	/*
	 * 	프로그램이 변수 찾을때
	 * 	=> 지역변수 => 인스턴스변수
	 * 	=> 메모리가 다르다
	 * 		Heap Stack
	 * 
	 */
	
}
public class 생성자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student hong = new Student(1, "홍길동", 90, 90, 90);
		Student shim = new Student(2, "심청이", 80, 80, 80);
		Student park = new Student(3, "박문수", 70, 70, 70);
		
		System.out.println(hong.hakbun + " " + hong.name + " " + hong.kor + " " + hong.eng + " " + hong.math);
		System.out.println(shim.hakbun + " " + shim.name + " " + shim.kor + " " + shim.eng + " " + shim.math);
		System.out.println(park.hakbun + " " + park.name + " " + park.kor + " " + park.eng + " " + park.math);
		
		Student lee = new Student(4, "이순신");
		//	lee => hakbun, name
		System.out.println("학번: " + lee.hakbun);
		System.out.println("이름: " + lee.name);
		System.out.println("lee: " + lee);

	}

}
