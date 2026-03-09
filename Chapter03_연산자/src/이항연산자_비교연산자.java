/*
 * 	비교연산자
 * 		결과값은 boolean => true / false
 * 		== 같다 | != 다르다
 * 		< 작다 | > 크다 | <= 작거나 같다 | >= 크거나 같다
 * 
 * 	사용할 수 있는 데이터
 * 		정수 / 실수 / 문자 => 연산자 전체 사용이 가능함
 * 		논리 => ==(같다), !=(다르다) 두 가지 연산자만 사용 가능
 * 		문자열 => 비교연산자를 사용하지 않는다. 관련 비교 함수가 존재함 equals(), compare()
 * 			문자열은 참조연산자이기 때문에 직접적으로 비교연산자를 사용하면 변수에 저장된 주소를 직접 비교함
 * 			참조값을 비교해야하기 때문에 제공하는 메소드를 이용해야함
 * 
 * 		'A' < 'B' => true	// char는 모든 연산자를 사용하면 자동으로 정수형으로 변환됨 65 < 66
 */
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = 6==7;
		System.out.println("b1 = "+ b1);
		                          
		b1 = 6!=7;                
		System.out.println("b1 = "+ b1);
		                          
		b1 = 6<7;                 
		System.out.println("b1 = "+ b1);
		                          
		b1 = 6>7;                 
		System.out.println("b1 = "+ b1);
		                          
		b1 = 6<=7;                
		System.out.println("b1 = "+ b1);
		                          
		b1 = 6>=7;               
		System.out.println("b1 = "+ b1);
		
		
		System.out.println("============================");
		
		b1 = 'A'=='B';
		System.out.println("b1 = "+ b1);
		                          
		b1 = 'A'!='B';                
		System.out.println("b1 = "+ b1);
		                          
		b1 = 'A'<'B';                 
		System.out.println("b1 = "+ b1);
		                          
		b1 = 'A'>'B';                 
		System.out.println("b1 = "+ b1);
		                          
		b1 = 'A'<='B';                
		System.out.println("b1 = "+ b1);
		                          
		b1 = 'A'>='B';               
		System.out.println("b1 = "+ b1);
		
		System.out.println("============================");
		
		boolean r1 = false;
		boolean r2 = true;
		
		b1 = r1==r2;
		System.out.println("b1 = "+ b1);
		b1 = r1!=r2;
		System.out.println("b1 = "+ b1);
		//b1 = r1<r2;	// boolean은 ==과 != 연산자만 사용 가능하다
		
		System.out.println("============================");
		//'A'는 65	'a'는 97	'0'은 48
		b1 = 'A'==66;
		System.out.println("b1 = "+ b1);
		b1 = 'A'!=66;
		System.out.println("b1 = "+ b1);
		b1 = 'A'<66;
		System.out.println("b1 = "+ b1);
		b1 = 'A'>66;
		System.out.println("b1 = "+ b1);
		b1 = 'A'<=66;
		System.out.println("b1 = "+ b1);
		b1 = 'A'>=66;
		System.out.println("b1 = "+ b1);
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'0');
	}

}
