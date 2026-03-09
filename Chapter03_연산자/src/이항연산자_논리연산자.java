/*
 * 	논리연산자 : 결과값은 boolean => 삼항연산자나 조건문 (if)
 * 		=> 최적화 연산자
 * 		=> 연산기호
 * 			&& => 포함된 경우
 * 			|| => 포함이 안 된 경우
 * 
 * 		(조건) && (조건)
 * 		(조건) || (조건)
 * 
 * 										 &&		 ||
 * 		--------------------------------------------------
 *   		true	ture		|		true	true
 *    		true	flase		|		false	true
 *     		false	true		|		false	true	
 *      	false	flase		|		false	false
 *      
 *      &&의 경우 첫항이 false면 무조건 false이므로 뒤는 계산하지 않는다
 *      ||의 경우 첫항이 true이면 무조건 true이므로 뒤는 계산하지 않는다
 *      	>> 최적화 연산
 *      		int x = 10;
 *      		int y = 9;
 *      		x>10 && ++y==x ==> false
 *      		해당 문장은 최적화 연산으로 뒤는 계산하지 않게 되어 y는 증감되지 않는 문제가 생김
 *      
 *      => 유효성 검사 -> 두개 이상을 검색 (범위/기간)
 *      		할때 많이 씀
 * 
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 9;
		boolean res = x>10 || ++y == x;
		System.out.println("결과값: " + res);
		System.out.println("y = " + y);

	}

}
