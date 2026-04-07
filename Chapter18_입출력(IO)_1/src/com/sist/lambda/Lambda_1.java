package com.sist.lambda;
/*
 * 	람다식은 이름 없는 함수 => 선언이 없다 => 코드가 간결해진다
 * 	(함수)->{구현부}
 * 	매개변수가 있을수도 있고 없을수도 있다
 * 	
 * 	=> 메소드 참조 : 클래스 (::)
 * 		System.out::println		Customer::getName
 * 
 * 	=> 처리
 * 		스트림
 * 		중간 처리 ===== 최종 처리
 * 		filter(if)		출력: forEach
 * 		map(format)		데이터를 모아서 전송: collect() => toList()
 * 		sorted(정렬)		max/min/count
 * 		groupby
 * 	=> Null 처리(Optional)
 * 	
 * 	=> 소스가 간결 => 유지보수가 편리하다 (가독성)
 * 	=> 재사용 / 복잡한 코딩이 있는 경우 사용하지 않는다
 * 		=> 람다 : 즉석 처리
 * 	=> 스프링부트 : 보안 처리
 * 	=> JPA : 데이터베이스
 * 
 *  => 최종 : 보안 / JPA / Mybatis
 *  
 *  주요 메소드
 *  filter()
 *  map()
 *  sorted() => ASC만 가능 (DESC 불가능) => 역순으로 출력
 * 	
 * 	-------------------
 * 	**** 면접
 * 	객체 지향 프로그램
 * 		객체들의 협력 상호작용 기준 => 조립식
 * 		코드의 재사용성 / 유지보수 / 확장 / 신뢰성
 * 	함수형 프로그램 (람다)
 * 		결과값 => 입력값에 따라 영향이 있다
 * 		검증이 쉽다, 성능의 최적화 (캐시)
 * 	캐시: 임시 메모리 => 메모리 리소스를 아낄 수 있다
 * 	임시 메모리에 데이터를 가지고 온다
 * 	-------------------
 * 	스트림 : 데이터 처리
 * 			------- 조건 / 출력 / 데이터 모아서 사용
 * 	람다 : 코드를 짧게 쓴다 (함수를 한 줄로 줄여서 사용)
 * 		자바( -> ) , 자바스크립트 ( => )
 * 	function funcName()
 * 	{
 * 
 * 	}
 * 
 * 	let funcName=()=>{}
 * 
 * 	핵심
 * 		(매개변수)->{실행코드}
 * 
 */

import java.util.*;

public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//		numbers.stream()
//			   .filter(n->n%2==0)
//			   .forEach(n->System.out.println(n));
		
//		String name = null;
//		System.out.println(name.length());	// 오류 => 웹 : 500
//		System.out.println("프로그램 종료");
		// null을 방지하는 클래스 Optional
		
		Optional<String> name = Optional.ofNullable(null);
		System.out.println(name.orElse("이름 없음"));	// null일 경우 출력하는 디폴트값
		// 검색 / 데이터베이스 프로그램
		// 데이터베이스 => isNotNull() isNull => NVL()
		Optional<String> userName = Optional.of("홍길동");
		// 값이 있는 경우 실행
		userName.ifPresent(n->System.out.println("이름: "+n));
		// null에 주의
		/*
		 * 	orElse("기본값") => 값이 없는 경우(null) 대신 사용
		 * 	ifPresent() => 값이 있는 경우에만 수행
		 * 	isPresent() => 값이 있는지 확인
		 * 
		 * 	람다 => 코드를 줄인다
		 * 	스트림 => 임시 메모리(캐시)에 데이터를 한개씩 읽는 것
		 * 	Optional => null 안전하게 처리
		 * 
		 * 	Optional<String> a = Optional.of("hello");
		 * 		=> null값이 아니다
		 * 	Optional<String> a = Optional.ofNullable(null);
		 * 		=> null값일 가능성이 있다
		 * 	Optonal<String< b = Optional.empty() 빈 값
		 * 
		 * 	데이터베이스에서 데이터를 읽어 온다
		 * 	-------- 크롤링
		 * 
		 */
		
		// 값 변경
		Optional<String> opt = Optional.of("hello");
		Optional<Integer> len = opt.map(s->s.length());	// map => 값을 변경해서 사용시
		System.out.println(len.get());
		
		// Optional 안에 Optional => 첨부
		Optional<String> opt2 = Optional.of("hello");
		Optional<Integer> result =
				opt2.flatMap(s->Optional.of(s.length()));
		// flatMap : Optional 제거
		System.out.println(result.get());
		
		// 필터링
		Optional<Integer> opt3 = Optional.of(10);
		opt3.filter(n->n>5)	// if(n>5) => true/false
			.ifPresent(n->System.out.println("5보다 큼"));
		// filter의 조건이 true일때만 수행
		// null => 주소가 배정이 안 된 상태
		Optional<String> opt4 = Optional.ofNullable(null);
		System.out.println(opt4.isPresent());	// 값이 있는가? => false
		System.out.println(opt4.isEmpty());		// 비어있는가?  => true
		
		
		

	}

}
