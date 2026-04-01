package com.sist.regex;
// or => |
public class 정규식_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// REGEXP_LIKE(name, "[가-힣]+")
		/*
		 * 	가나다 REFEXP_LIKE(name,"가나다")
		 * 	name LIKE '%가%
		 * 	OR name LIKE '%나%
		 * 	OR name LIKE '%다%
		 */
		System.out.println("dog".matches("dog|cat|pig"));	// dog cat pig 중 하나가 포함됐는지
		System.out.println("gif".matches("gif|jpg|png"));
		// => 확장자
		System.out.println("yes".matches("y(es)?"));	// y / yes
		System.out.println("ye".matches("y(es)?"));		// false

	}

}
