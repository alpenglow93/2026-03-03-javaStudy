import java.util.Scanner;

public class 문제_4 {

	static int inputYear()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("년도 입력: ");
		return scan.nextInt();
	}
	
	static boolean isYear(int year)
	{
		if((year%4==0) && (year%100 != 0) || (year%400 == 0))
			return true;
		else
			return false;
	}
	
	static void print(boolean b)
	{
		if(b == true)
		{
			System.out.println("윤년입니다");
		}
		else
		{
			System.out.println("윤년이 아닙니다");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print(isYear(inputYear()));
		
		int year = inputYear();
		boolean b = isYear(year);
		print(b);

	}

}
