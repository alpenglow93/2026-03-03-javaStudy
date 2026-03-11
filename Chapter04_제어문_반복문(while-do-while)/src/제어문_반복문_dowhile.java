/*
 * 	1. 형식
 * 		초기값
 * 		do
 * 		{
 * 			실행문장
 * 			증가식
 * 		} while(조건식);
 * 
 * 		
 * 		continue : 조건식으로 이동
 * 					while, do~while문에서는 잘못 사용하면 무한루프에 빠진다
 * 		int i = 1;
 * 		while(i<=10)
 * 		{
 * 			if(i==2)
 * 				continue;	// 이 경우 증감이 되지 않은 상태에서 조건식으로 가게 돼 무한루프에 빠진다
 * 			System.out.println(i);
 * 			i++;
 * 		}
 * 
 */

import javax.swing.JOptionPane;

public class 제어문_반복문_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i = 1;
//		while(i <= 10)
//		{
//			if(i==2)
//				continue;	// 무한루프 발생
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("종료");
		
		int i = 1;	// while, do~while문은 초기값이 외부에 있다
		do
		{
			System.out.print(i + " ");	// 반복문장
			i++;
		} while(i<=10);
		System.out.println();
		
		i = 1;
		char c = 'A';
		do
		{
			System.out.print(c + " ");
			c++;
		} while(c<='Z');
		
		System.out.println();
		
		c = '0';
		do
		{
			System.out.print(c + " ");
			c++;
		} while(c<='9');
		
		System.out.println();
		
		String s = JOptionPane.showInputDialog("문자열 입력");
		// 글자수
		System.out.println("입력된 문자열: " + s);
		System.out.println("글자수: " + s.length());
		// A, a가 몇개인지 확인
		int count = 0;
		i = 0;
		do
		{
			char d = s.charAt(i);
			if(d=='A' || d == 'a')
				count++;
			
			i++;
		} while(i<s.length());
		
		System.out.println("A, a 총갯수: " + count);
		
		
	}

}
