/*

1. 1부터 100까지 숫자 중 짝수의 합을 구하는 프로그램을 작성하시오.
2. 사용자에게 숫자 n을 입력받아 1부터 n까지 합을 구하시오.
3. 1부터 50까지 숫자 중 3의 배수만 출력하시오.
4. 1~100 사이에서 7의 배수 개수를 구하시오

5. 문자열 "JavaProgramming" 의 각 문자 하나씩 출력하시오
6. 1부터 10까지 숫자를 while문으로 출력하시오.
7. 사용자에게 숫자를 입력받아 1부터 그 숫자까지 출력하시오.
8. 1~100 사이 홀수만 출력하시오.
9. 1~100 사이 숫자 중 5의 배수 합을 구하시오.
10. 숫자 10부터 1까지 역순 출력하시오.

 */
import java.util.Scanner;
public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 1부터 100까지 숫자 중 짝수의 합을 구하는 프로그램을 작성하시오.
		int sum = 0;
		
		for(int i = 1 ; i <= 100; i++)
		{
			if(i%2==0)
				sum += i;
		}
		System.out.println("1부터 100까지 숫자 중 짝수의 합을 구하는 프로그램을 작성하시오: " + sum);
		
		System.out.println();
		
		// 2. 사용자에게 숫자 n을 입력받아 1부터 n까지 합을 구하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int inputnum = scan.nextInt();
		sum = 0;
		for(int i = 1; i <= inputnum; i++)
		{
			sum += i;
		}
		System.out.println("사용자에게 숫자 n을 입력받아 1부터 n까지 합을 구하시오 : " + sum);
		
		System.out.println();
		
		//3. 1부터 50까지 숫자 중 3의 배수만 출력하시오.
		for(int i = 1; i <= 50; i++)
		{
			if(i%3==0)
				System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println();
		
		// 4. 1~100 사이에서 7의 배수 개수를 구하시오
		int num = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i%7==0)
				num++;
		}
		System.out.println("1~100 사이에서 7의 배수 개수를 구하시오: " + num);
		
		System.out.println();
		
		//5. 문자열 "JavaProgramming" 의 각 문자 하나씩 출력하시오
		String str = "JavaProgramming";
		for(int i = 0; i < str.length(); i++)
		{
			System.out.print(str.charAt(i) + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// 6. 1부터 10까지 숫자를 while문으로 출력하시오.
		int j = 1;
		while(j <= 10)
		{
			System.out.print(j++ + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//7. 사용자에게 숫자를 입력받아 1부터 그 숫자까지 출력하시오.
		System.out.print("사용자에게 숫자를 입력받아 1부터 그 숫자까지 출력하시오: ");
		num = scan.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// 8. 1~100 사이 홀수만 출력하시오.
		for(int i = 1; i <= 100; i++)
		{
			if(i%2!=0)
				System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// 9. 1~100 사이 숫자 중 5의 배수 합을 구하시오.
		sum = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i%5==0)
				sum += i;
		}
		System.out.println("9. 1~100 사이 숫자 중 5의 배수 합을 구하시오: " + sum);
		
		System.out.println();
		
		//10. 숫자 10부터 1까지 역순 출력하시오.
		for(int i = 10; i >= 1; i--)
		{
			System.out.print(i + " ");
		}

	}

}
