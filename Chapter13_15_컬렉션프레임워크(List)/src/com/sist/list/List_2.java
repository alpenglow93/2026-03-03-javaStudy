package com.sist.list;
/*
 * 	ArrayList / Vector / LinkedList
 * 	=> 주요 메소드
 * 	=> 데이터 저장 공간 : 효율적으로 사용할 수 있게 만든 자료구조
 * 	=> 표준화 ㅣ 모든 개발자가 동일
 *  => 라이브러리 : 변수(X), 메소드 (O)
 * 		add(Object o) 추가
 * 			<String> 제네릭 => 데이터형 통일
 * 		set/remove
 * 		imEmpty() : 비어있는지 확인
 * 		clear() : 장바구니
 * 		size() : 정수
 * 		get() : 데이터 읽기
 * 	--------------------------
 * 		subList() : 원하는 갯수만큼 저장
 * 		retainAll() : 교집합
 * 		addAll() : 전체 데이터
 * 
 *  	List === Set === Map
 *  리스트와 호환 => Map(key,value)
 * 
 */

import java.util.*;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"aaa","bbb","ccc","ddd","aaa","bbb"};
		List<String> list = Arrays.asList(arr);
		
		Set<String> set = new HashSet<String>(list);	// 이렇게 set에 집어넣으면 중복이 제거된다
		
		for(String s:set)
		{
			System.out.println(s);
		}
		

	}

}
