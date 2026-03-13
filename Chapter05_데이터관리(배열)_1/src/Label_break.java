// label이 있는 break
public class Label_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aaa:	// 라벨
		for(int i = 1; i <= 3; i++)
		{
			for(int k = 1; k <= 3; k++)
			{
				System.out.println("i="+i+", k="+k);
			}
			for(int j = 1; j <= 3; j++)
			{
				if(j==2) break aaa;	// j가 있는 for문 종료	// 라벨을 붙이면 aaa가 붙은 for문을 제어
				System.out.println("i="+i+", j="+j);
			}
		}

	}

}
