/*
 * 	달력 제작
 * 		입력된 년도/월 ==> 1일자의 요일이 필요하다
 *		1. 1년 1월 1일 ==> 월
 *		2. 1년 1월 1일 -----> 전년도까지	== 윤년 포함
 *		3. 입력한 달의 전달까지			==
 *		4. +1
 *		-------------------------------- 총날수 % 7 ==> 요일
 */
import java.util.*;
public class 달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 설정
		Scanner scan = new Scanner(System.in);		// 반복문에서 설정하면 안된다
		// new : 동적 메모리 할당 => molloc() => 승격되어 new라는 연산자가 됨
		// new => 새로운 메모리에 저장
		// => 오류 :OutOfMemoryException : 메모리 공간이 없다는 의미 (이클립스를 껐다켜야함)
		
		int year = 0, month = 0, day = 0;
		
		System.out.print("년도 입력: ");
		year = scan.nextInt();
		
		System.out.print("월 입력: ");
		month = scan.nextInt();

		System.out.print("일 입력: ");
		day = scan.nextInt();
		
		System.out.println(year + "년도 " + month + "월");
		String[] strWeek = { "일", "월", "화", "수", "목", "금", "토" };
		
		for(String w:strWeek)
		{
			System.out.print(w+"\t");
		}
		
		// 요일 구하기(총날수 % 7) => 전년도까지의 총날수
		int total = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		// 전달까지의 합
		int[] lastday = {
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastday[1] = 29;		
		else
			lastday[1] = 28;
		
		for(int i = 0;  i < month-1; i++)
		{
			total += lastday[i]; 
		}
		
		// 1일자 확인
		total++;
		
		// 요일 구하기
		int week = total%7;
		
		System.out.println("요일: "+ strWeek[week]);	// 월의 시작 요일 구한것을 출력
		
		// 달력 출력
		//System.out.println();
		for(int i = 1; i <= lastday[month-1]; i++)
		{
			if(i==1)
			{
				for(int j = 0; j < week; j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%d\t", i);
			//
			week++;
			if(week>6)	// 일요일이면 다음주로 줄바꿈
			{
				week = 0;
				System.out.println();
			}
		}
		

	}

}
