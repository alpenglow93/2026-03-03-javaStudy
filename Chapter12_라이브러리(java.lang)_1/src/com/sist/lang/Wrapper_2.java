package com.sist.lang;

import java.lang.reflect.Method;
import java.util.*;

class Controller
{
	// 어노테이션을 사용하면 메소드 명이 변경돼도 메인에서 변경 없이 사용 가능
	@RequestMapping("1")
	public void aaa()
	{
		System.out.println("Controller:aaa() Call...");
	}
	@RequestMapping("2")
	public void bbb()
	{
		System.out.println("Controller:bbb() Call...");
	}
	@RequestMapping("3")
	public void ccc()
	{
		System.out.println("Controller:ccc() Call...");
	}
	@RequestMapping("4")
	public void ddd()
	{
		System.out.println("Controller:ddd() Call...");
	}
	@RequestMapping("5")
	public void eee()
	{
		System.out.println("Controller:eee() Call...");
	}
}

public class Wrapper_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer> list = new ArrayList();
		// int[]
		// 배열 대신 사용하는 저장공간
//		list.add(10);
//		list.add("aaa");
//		list.add(10.5);
//		list.add('A');
//		list.add(true);
//		list.add(false);
//		list.add("bbb");
//		list.add(10.5f);	// Object이기 때문에 제네릭을 쓰기 전엔 어떤 데이터가 들어가도 된다 /
//		list.add(10);
//		list.add("aaa");
//		list.add(10.5);
//		list.add('A');
//		list.add(true);
//		list.add(false);
//		list.add("bbb");
//		list.add(10.5f);
		
		Scanner scan = new Scanner(System.in);
		//Controller c = new Controller();
//		System.out.print("aaa(1), bbb(2), ccc(3), ddd(4), eee(5): ");
//		int no = scan.nextInt();
//		if(no==1)
//		{
//			c.aaa();
//		}
//		else if(no==2)
//		{
//			c.bbb();
//		}
//		else if(no==3)
//		{
//			c.ccc();
//		}
//		else if(no==4)
//		{
//			c.ddd();
//		}
//		else if(no==5)
//		{
//			c.eee();
//		}
		
		try {
			Class clsName = Class.forName("com.sist.lang.Controller");
			Object obj = clsName.getDeclaredConstructor().newInstance();
			
			Method[] methods = clsName.getDeclaredMethods();
			
			System.out.println("1~5입력: ");
			String no = scan.next();
			
			for(Method m:methods)
			{
				RequestMapping rm = m.getAnnotation(RequestMapping.class);
				if(rm.value().equals(no))
				{
					m.invoke(obj, null);
				}
			}
			
		} catch (Exception ex) {}

	}

}
