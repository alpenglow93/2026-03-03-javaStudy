/*
 *     정렬 
 *     40  20  50  10  30
 *     --  --
 *     20  40
 *     --      --
 *     20      50
 *     --          --
 *     10          20
 *     --              --
 *     10              30
 *     ---------------------- for 1 ==> 1 round
 *     10  40  50  20  30
 *         --  --
 *         40  50
 *         --      --
 *         20      40
 *         --          --
 *         20          30
 *     ---------------------  for 2 ==> 2 round 
 *     10  20  50  40  30
 *             --  --
 *             40  50
 *             --      --
 *             30      40
 *     --------------------- for 3 ==> 3round
 *     10 20   30  50  40
 *                 --  --
 *                 40  50
 *     --------------------- for 4  ==> 4 round
 *     10 20  30  40  50  ==> for => length-1
 *     
 *     
 *     값교환 
 *     int a=10
 *     int b=20 
 *     
 *     a=b // a=20
 *     b=a // b=20
 *     
 *     int temp=a // temp=10
 *     a=b // a=20
 *     b=temp // b=10
 *     
 */

import java.util.Arrays;

public class 데이터정렬_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[5];
        // 초기화 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1; // 1~100
        }
        
        System.out.println("정렬 전:");
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        
        // 올림차순 => ASC arr[i]>arr[j]
        // DESC => 내림차순 arr[i]<arr[j]
        System.out.println("\n정렬 후:");
        
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		
        		if(arr[i]<arr[j])
        		{
        			int temp=arr[i];// 값 교환 => 임시변수 설정
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        	System.out.println(Arrays.toString(arr));
        }
        
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
	}

}
