package com.sist.collection;

import java.util.*;

public class Collection_total_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		set.add("6");
		set.add("7");
		set.add("8");
		set.add("9");
		
		// for-each만 사용이 가능
//		Iterator<String> it = set.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		// 순서X => 어떤 데이터가 먼저 출력할지 알 수 없다
		// => for-each보다는 iterator를 사용 (set을 순서대로 출력할때 사용)
		// => List에서 중복된 데이터 추출
		// => 네트워크 / Cookie
		for(String s:set)
		{
			System.out.println(s);
		}

	}

}
