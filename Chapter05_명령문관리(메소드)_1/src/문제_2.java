// 정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
// 정수입력 / 이진법처리 / 출력
import java.util.*;
public class 문제_2 {
	
	static int input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("0~32767까지의 정수 입력");	// short...?
		return scan.nextInt();
	}
	
	static int[] binary(int num)
	{
		int[] b = new int[16];
		int index = 15;
		while(true)
		{
			b[index] = num%2;
			num /= 2;
			if(num==0)
				break;
			index--;
		}
		
		return b;
	}
	
	static void output(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(i%4==0 && i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(arr[i]);		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = input();
		int[] arr = binary(num);
		output(arr);
	}
}
