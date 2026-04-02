package com.sist.apply;

import java.util.*;


public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("페이지 입력: ");
		int page = scan.nextInt();
		
		FoodSystem fs = new FoodSystem();
		ArrayList<Food> list = fs.food_list(page);
		
//		for(Food f:list)
//		{
//			System.out.println(f.getNo()+"."+f.getName());
//		}
//		
//		System.out.println("======================");
//		System.out.print("상세 볼 맛집 번호 입력: ");
//		int no = scan.nextInt();
//		Food ff = fs.foodDetail(no);
//		System.out.println("===== 맛집 정보 =====");
//		System.out.println("맛집명: " + ff.getName());
//		System.out.println("음식종류: " + ff.getType());
//		System.out.println("주차: " + ff.getParking());
//		System.out.println("영업시간: " + ff.getTime());
//		System.out.println("가격: " + ff.getPrice());
//		System.out.println("테마: " + ff.getTheme());
//		System.out.println("소개: " + ff.getContent());
//		System.out.println("주소: " + ff.getAddress());
//		System.out.println("전화: " + ff.getPhone());
//		System.out.println("평점: " + ff.getScore());
//		System.out.println("======================");
//		System.out.print("주소 입력: ");
//		String addr = scan.next();
//		ArrayList<Food> aList = fs.foodFind(addr);
//		for(Food f:aList)
//		{
//			System.out.println(
//					f.getNo()+"."
//					+ f.getName() + "("
//					+ f.getAddress() + ")"
//					);
//		}

		ArrayList lists = new ArrayList();
		lists.add(1);
		lists.add("홍");
		lists.add(10.5);
		lists.add('A');
		lists.add(true);
		lists.add(1);
		lists.add("홍");
		lists.add(10.5);
		lists.add('A');
		lists.add(true);
		lists.add(1);
		lists.add("홍");
		lists.add(10.5);
		lists.add('A');
		lists.add(true);
		
		for(int i = 0; i < lists.size(); i++)
		{
			System.out.println(lists.get(i));
			
		}
		
	}

}
