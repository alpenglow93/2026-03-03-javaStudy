/*
 * 	부정연산자 : !
 * 		=> boolean 만 사용이 가능하다 (논리형)
 * 		!true => false
 * 		!false => true
 * 	범위에 없는 값 / 예약이 없는 날 / 로그인이 안 된 사람 등등...
 * 
 * 		!(score>=0 && score<=100)	// 이건 뭐 점수 입력이 잘못된 경우를 찾는 느낌
 * 
 * 	게임에서 턴을 넘어갈때 체크하는 용도로도 사용
 * 
 */
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = false;
		int i = 0;
		while(i<10)
		{
			b = !b;
			if(b==true)
				System.out.println("사용자");
			else
				System.out.println("컴퓨터");
			i++;
		}

	}

}
