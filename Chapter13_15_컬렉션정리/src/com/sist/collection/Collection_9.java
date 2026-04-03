package com.sist.collection;
/*
 * 인터페이스 구현된클래스
 * 	Map - HashMap : 비동기(더 빠름)
 * 		- Hashtable : 동기 => Hashtable의 단점을 보완 : HashMap
 * 
 * 	동기는 데이터를 보내고 확인하기 때문에 속도는 늦지만 신뢰성이 높다
 * 
 * 	List / Set => Collection
 *	Map은 Collection 상속을 받지 않았기 때문에 메소드가 다르다
 *
 *	특징
 *		두 개를 동시에 저장 (key, value)
 *			key를 가지고 value값을 얻어온다
 *			key 중복(X) value 중복(O)
 *			같은 키 => 덮어쓴다
 *			=> 응용 : Spring / MyBatis / 웹 라이브러리
 *					Spring : 클래스 찾기(id, 클래스 주소)
 *					MyBatis : SQL (id, "SQL문장")
 *				=> Session / Cookie / Request / Response
 * 	사용처 : 클래스 관리
 * 			메모리 할당 후 관리
 * 			---------------- 메모리 주소
 * 		map.put("a", new A())
 * 					--------- 한 번 메모리 할당(싱글턴)
 * 
 */

import java.util.*;

class AA
{
	public void disp()
	{
		System.out.println("AA:disp() Call");
	}
}

public class Collection_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,AA> map = new HashMap<String,AA>();
		
		map.put("aa", new AA());
		
		AA a = new AA();
		
		AA b = new AA();
		
		AA c = new AA();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}
