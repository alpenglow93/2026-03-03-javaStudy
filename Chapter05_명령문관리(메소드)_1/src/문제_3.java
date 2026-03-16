/*
 * 	2. 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성 
 *		임의의 정수 입력 (배열 생성후)
 *		정렬 처리
 *		출력 
 */

import java.util.Arrays;

public class 문제_3 {

	static int[] init()
	{
		int[] arr = new int[5]; 
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		return arr;
	}
	
	static int[] sort_t(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	static int[] sort(int[] arr, boolean b)
	{
		int temp = arr[0];
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if (b)//(arr[i] > arr[j])
				{
					if(arr[i] > arr[j])
					{
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;						
					}
				}		
				else
				{
					if(arr[i] < arr[j])
					{
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;						
					}
				}
			}
		}
		
		return arr;
	}
	
	static void output(int[] arr)
	{
//		for(int i = 0; i < arr.length; i++)
//		System.out.print(arr[i] + " ");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = init();
		output(sort(arr, true));
		System.out.println();
		output(sort(arr, false));
		

	}

}
