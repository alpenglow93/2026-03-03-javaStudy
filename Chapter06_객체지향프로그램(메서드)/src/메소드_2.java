/*
 * 	매개변수
 * 	전송 ===> 전송법
 * 	Call By Value / Call By Reference
 * 		복사본			원본
 * 
 * 
 * 
 */

class Value
{
	int a;
	int b;
}

// 같은 메모리 주소를 이용하면 => 값을 같이 제어
// (배열/클래스) => 단, String은 call by value
// CallByValue ==> 값을 전송하면 메소드에서 새로운 메모리를 만들어서 값을 저장 후 제어
// 
class CallByValue
{
	void swap(int a, int b)
	{
		System.out.println("변경전: a = " + a + ", b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("변경후: a = " + a + ", b = " + b);
	}
	
	// 일반적인 클래스들은 call by reference지만 String 은 call by value (불변)
	void swap2(String s1, String s2)	
	{
		System.out.println("변경전: s1 = " + s1 + ", s2 = " + s2);
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("변경후: s1 = " + s1 + ", s2 = " + s2);
	}
}

class CallByReferece
{
	//int[] arr = {1,2};
	//int[] copy = arr; << 배열의 깊은복사
	//int[] copy = arr.clone(); << 이건 복사해서 대입해준것
	void swap(int[] arr)	// arr배열이 저장하는 주소값을 넘겨줌
	{
		System.out.println("수행전 arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println("수행후 arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
	}
	
	void swap2(Value v)
	{
		System.out.println("swap2: v = "+v);
		System.out.println("수행전 v.a = " + v.a + ", v.b = " + v.b);
		int temp = v.a;
		v.a = v.b;
		v.b = temp;
		System.out.println("수행후 v.a = " + v.a + ", v.b = " + v.b);
	}
	
	/*
	 * 	int[] rand(int[] arr)
	 * 	{
	 * 		변경
	 * 		return arr;
	 * 	}
	 * 
	 * 	void rand(int[] arr)
	 * 	{
	 * 		변경
	 * 	}	// 배열 넣으면 원본도 변경되기 때문에(Call By Reference) 이런 식으로 return을 따로 주지 않아도 변경이 된다
	 * 
	 */
}

class Test
{
	int a = 10;
	void display()
	{
		System.out.println("Test:display Call...");
		System.out.println("a = " + a);
		a++;
	}
}

public class 메소드_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValue call = new CallByValue();
		int a = 10;
		int b = 20;
		call.swap(a, b);
		System.out.println("수행후 원본: a = " + a + ", b = " + b);
		
		// 모든 클래스와 배열 => call by reference
		// String => call by value
		String s1 = "홍길동";
		String s2 = "심청이";
		call.swap2(s1, s2);
		System.out.println("수행후 원본: s1 = " + s1 + ", s2 = " + s2);
		
		CallByReferece cr = new CallByReferece();
		int[] arr = { 10, 20 };
		cr.swap(arr);
		System.out.println("수행후 원본 arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
		
		int[] data = { 10, 20 };
		int[] copy = data;
		System.out.println("copy = " + copy);
		System.out.println("data = " + data);
		copy[0] = 100;
		System.out.println("data[0] = " + data[0]);
		
		int[] copy2 = data.clone();	// 새로운 공간에 복제
		System.out.println("copy2 = " + copy2);	// [100,20]
		System.out.println("data = " + data);
		copy2[0] = 1000;
		System.out.println("data[0] = " + data[0]);
		
		Value v = new Value();
		System.out.println("main: v: " + v);
		v.a = 100;
		v.b = 200;
		cr.swap2(v);
		System.out.println("수행후 원본 v.a = " + v.a + ", v.b = " + v.b);
		
		// 호출만 한다면
		new Test().display();	// 호출만 한다면 따로 객체를 변수에 저장하지 않고 호출하는것도 가능하지만
		new Test().display();	// new를 3번 하게 된다면 이 셋은 다 다른 객체이다
		new Test().display();	// 셋 다 다른 객체이기 때문에 내부 변수 a는 ++을 해도 값이 변하지 않음
		// 한번만 호출하고 사용하려면 이렇게 써도 됨
		
		System.out.println();
		
		Test t = new Test();	// 여기는 T 변수에 객체를 저장했으므로 3번 display()를 호출하면 a++이 적용돼 값이 올라간다
		t.display();			// 연속해서 사용하려면 객체 주소를 저장해둬야함
		t.display();
		t.display();
		
		// 생성자는 반드시 => new 동반
		String s = "Hello";
		System.out.println(s.length());
		System.out.println("Hello".length());	// 문자열도 따로 저장하지 않고도 바로 메소드에 접근이 가능하다
		// 하지만 같은 문자열은 아
	}

}
