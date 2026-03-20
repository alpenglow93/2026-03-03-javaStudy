package com.sist.oop2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// 매개변수가 알 수 없는 경우 ==> 웹 (필터) => 가변매개변수
/*
 * 	printf("%d",10)
 * 	printf("%d%d",10, 20)
 * 	printf("%d%d%d",10, 20, 30)
 * 
 * 	String... str
 * 
 */
// 검색 => 필터링 => String.format(String, Object... org)
class Temp
{
	public void sum(int... value)
	{
		int s = 0;
		for(int i = 0; i < value.length; i++)
		{
			s+=value[i];	// 값읽기 => 배열
		}
		System.out.println("sum="+s);
	}
	// Object...
	
	public String change(int num)
	{
		DecimalFormat d = new DecimalFormat("###,###,###");	// 숫자 출력시 단위를 찍어줌
		return d.format(num);
	}
	
	public String dateChange(Date date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
}

public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temp t = new Temp();
		t.sum(10);
		t.sum(10,20,30,40,50,60,70);

		int a = 100000000;
		String res = t.change(a);
		System.out.println(res+"원");
		System.out.println(new Date());
		res = t.dateChange(new Date());
		System.out.println(res);
	}

}
