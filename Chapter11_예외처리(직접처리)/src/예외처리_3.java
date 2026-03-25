// 부분적 처리
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = null;
		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println(s.trim());	// NullPointerException
			int[] arr = new int[2];
			arr[2] = 100;
			System.out.println(10/0);			
			System.out.println(Integer.parseInt("10 "));
			System.out.println("5");
			
		} catch (ArithmeticException e) {	// 에러가 발생해도 catch절에 있는 에러가 발생한게 아니면 catch절 수행을 하지 못한다 
			// TODO: handle exception		// 해당 에러는 0으로 나눴을때
			
			System.out.println("6.에러발생 수행: 에러 복구");
		} catch (NumberFormatException e)
		{
			System.out.println("7.에러발생 수행: 에러 복구");
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("8.에러발생 수행: 에러 복구");
		} catch (RuntimeException e)	// 위의 예외들보다 상위이기 때문에 마지막으로(아래로)
		{
			System.out.println("6.문자열 처리");
		}
		finally
		{
			System.out.println("9.무조건 수행문장");
			
		}
		System.out.println("End");

	}

}
