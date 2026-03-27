package com.sist.manager;

import java.io.*;

import com.sist.commons.Manager;
import com.sist.vo.*;

public class FoodManager implements Manager {
	// 맛집 데이터 저장
	public static FoodVO[] foods = new FoodVO[440];
	/*
	 * 	1. 데이터형
	 * 		= 기본형
	 * 			정수(int).....
	 * 		= 참조형
	 * 			클래스, 배열 => 주소를 이용한 방식
	 * 			---- 자바 라이브러리 클래스 / 사용자 정의
	 * 			클래스 1개는 한개 맛집에 대한 정보를 가지고 있다
	 * 	2. 데이터 공유
	 * 		=> 모든 사용자가 같은 데이터를 사용 => 공유
	 * 			=> static : 오라클 (데이터베이스 => 공유된 데이터)
	 * 	3. 모든 클래스에서 접근이 가능 => public
	 * 		모든 변수는 private이 아니다 => 선택적이다
	 * 	4. 초기화 => 값을 저장
	 * 		1) 명시적 초기화 int a = 10
	 * 		2) 초기화 블록
	 * 			인스턴스 {}
	 * 			정적	  static{}
	 * 			생성자
	 * 			=> 클래스 {} 은 선언만 가능
	 * 				=> 파일읽기(X)
	 * 			** static 변수 => static{}
	 * 			** 인스턴스 => 생성자()
	 * 			-------------------------------- 상속예외
	 */
	// 초기화 => 배열값 저장
	static
	{
		// 구현해서 초기화가 가능 => 자동 호출
		// => 파일 읽기 => CheckException => 예외처리
		// => 초기화블록은 throws를 사용할 수 없다
		try {
			StringBuffer sb = new StringBuffer();
			// 문자열을 모을 수 있는 임시 저장 장소를 가지고 있다
			// => 문자열 결합에 속도가 빠르다
			int i = 0;
			FileReader in = new FileReader("c:\\javaDev\\food.txt");
			while((i=in.read()) != -1)	// EOF -1 : End Of File
			{
				sb.append((char)i);
				// int read() => char 변환
				// 한글자씩 읽어 온다 ==> BufferedReader => 한줄씩
			}
			in.close();
			
			//System.out.println(sb.toString());
			// foods에 값 채우기
			String[] datas = sb.toString().split("\n");
			i = 0;
			/*
			 * 440|
			 * 솔향한우촌|
			 * 한식-생고기/등심|
			 * (033) 661-5955|
			 * 강원 강릉시 연곡면 영진리 364-60|
			 * 3.0|
			 * 40대, 주차방법: 무료, 주차장소: 업소앞|
			 * /restaurant/restimg/006/zzmenuimg/h20138629_z.jpg|
			 * 10:00 ~ 22:00|
			 * 솔향기 그윽한 강릉의 명품 '솔향한우촌'. 강릉시에 있는 강북공설운동장 입구에 위치한 '솔향한우촌'은 품질 좋은 소고기만을 취급하는 한우전문점이다. 190석 규모의 넓고 깔끔한 내부와 전용 주차장이 갖추어져 있어 여러 모임에도 적합한 곳. 직접 키운 채소, 지역 농민이 생산한 쌀과 야채, 한우 잡목반에서 직접 키운 암소를 제공하고 있다. 처음부터 끝까지 정성을 가득담아 한 끼의 근사한 식사를 제공하는 '솔향한우촌', 강릉에 온다면 이 곳을 방문해 보는 것은 어떨까.|가족외식 , 돌잔치/회갑/생일 , 어른과 함께라면 , 술 마시는 친구와 함께 , 특별한 날엔 , 점심식사 , 접대 , 주차공간 , 한우전문점 , 불고기 , 육회 , 몸보신 , 고기 보양식 , 강릉 정동진 해돋이축제|
			 * 10,000 ~ 20,000원
			 */
			for(String data : datas)
			{
				System.out.println(data);
				String[] s = data.split("\\|");
				FoodVO vo = new FoodVO();
				vo.setNo(Integer.parseInt(s[0]));
				vo.setName(s[1]);
				vo.setType(s[2]);
				vo.setPhone(s[3]);
				vo.setAddress(s[4]);
				vo.setScore(Double.parseDouble(s[5]));
				vo.setParking(s[6]);
				vo.setPoster(s[7]);
				vo.setTime(s[8]);
				vo.setContent(s[9]);
				vo.setTheme(s[10]);
				vo.setPrice(s[11]);
				foods[i] = vo;
				i++;				
			}
			
		} catch (Exception ex) {}
	}
	@Override
	public FoodVO[] food_list(int page) {
		// TODO Auto-generated method stub
		
		int j = 0;
		int pagecnt = (page*10)-10;	// 페이지별 배열의 시작점
		int row = 10;
		int total = food_total();
		if(total == page)
		{
			row = foods.length % 10;
		}
		FoodVO[] food = new FoodVO[row];
		// ArrayList => 배열의 단점을 보완 => 크기를 지정하지 않는다
		for(int i = 0; i<foods.length; i++)
		{
			// i >= pagecnt => 배열의 시작점
			if(j<10 && i>=pagecnt)
			{
				food[j] = foods[i];
				j++;
			}
		}
		
		/*
		 * 0
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 6
		 * 7
		 * 8
		 * 9
		 * 10
		 * 11
		 * 12
		 * 13...
		 */
		
		return food;
	}
	@Override
	public FoodVO food_detail(int no) {
		// TODO Auto-generated method stub
		
		return foods[no-1];
	}
	@Override
	public FoodVO[] food_find(String type, String fd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public FoodVO[] food_filter(String type) {
		// TODO Auto-generated method stub
		int row = 0;
		
		for(FoodVO vo:foods)
		{
			if(vo.getType().contains(type))
			{
				row++;
			}
		}
		FoodVO[] food = new FoodVO[row];
		
		int i = 0;
		for(FoodVO vo : foods)
		{
			if(vo.getType().contains(type))
			{
				food[i] = vo;
				i++;
			}
		}
		return food;
	}
	@Override
	public int food_total() {
		// TODO Auto-generated method stub
		return (int)(Math.ceil(foods.length/10.0));
	}

}
