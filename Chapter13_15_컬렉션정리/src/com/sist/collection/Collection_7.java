package com.sist.collection;
// TreeSet : 검색속도가 빠르다 => 코딩테스트

import java.util.*;

public class Collection_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		for(int i = 0; i < 10; i++)
		{
			int k = r.nextInt(100)+1;
			// 0~99 => 1~100
			set.add(k);	// AutoBoxing : Integer i = 10
			System.out.print(k+" ");
		}
		System.out.println("\n실제 저장된 갯수:" + set.size());
		for(Integer i:set)
		{
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		// => TreeSet에 저장
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.addAll(set);
		for(Integer i:set2)
		{
			System.out.print(i + " ");			
		}
		System.out.println();
		System.out.println("===== 50 이상인 숫자 =====");
		
//		for(Integer i : set2)
//		{
//			if(i>=50)
//				System.out.print(i + " ");
//		}
		/*
		 * tailSet()
		 * headSet()
		 * 기억해두기
		 * ==> 자음 검색
		 */
		System.out.println(set2.tailSet(50)); // 50 포함 되네
		System.out.println("===== 50 이하인 숫자 =====");
		System.out.println(set2.headSet(50)); // 50 포함 안 되네
		
		System.out.println("===== 바로 위의 값 =====");
		System.out.println(set2.higher(30));	// 30 바로 위의 값
		
		System.out.println("===== 같거나 큰 값 =====");
		System.out.println(set2.ceiling(50));
		
		System.out.println("===== 바로 아래의 값 =====");
		System.out.println(set2.lower(50));	// 50 바로 아래의 값

		System.out.println("===== 같거나 작은 값 =====");
		System.out.println(set2.floor(50));
		
		
		System.out.println(set2.first());	// 가장 작은 값 (처음 값)
		System.out.println(set2.last());	// 가장 큰 값 (마지막 값)
		
	}

}
