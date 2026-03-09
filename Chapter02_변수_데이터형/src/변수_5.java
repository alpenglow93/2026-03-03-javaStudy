/*
 * 		변수
 * 		1. 국어 / 수학 / 영어 / 총점 / 평균 / 학점 / 등수
 * 		int kor = 0;
		int math = 0;
		int eng = 0;
		int total = 0;
		double avg = 0;
		String grade;
		int rank = 0;
		
		2. 문자열 저장 : String
 */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int drink = 12;
		//
		//drink -= 5;
		//
		//System.out.println("남은 음료수: " + drink);
		// 남은 음료수: 7

		/*
		 * 샌드위치 칼로리 250
		 * 사과 100
		 * 주스 150
		 * 
		 * 샌드위치1 사과2 주스1
		 * => 총칼로리는?
		 */
		
		/*
		int sandwich = 250;
		int apple = 100;
		int juice = 150;
		int totalCal = sandwich + apple * 2 + juice;
		System.out.println(totalCal);
		*/
		
		/*
		 * 이름은 홍길동 / 성별 남자 / 나이 20
		 * 장바구니
		 * 	우유 1200원 2개
		 *  빵 1500원 3개
		 *  계란 200원 10개
		 */
		//성별은 뭐고 나이는 뭐고 장바구니에 총 ?
		String name = "홍길동";
		String sex = "남자";
		int age = 20;
		double height = 180.5;
		boolean isCard = false;
		
		int milkPrice = 1200 * 2;
		int breadPrice = 1500 * 3;
		int eggPrice = 200 * 10;
		
		System.out.println("이름: " + name);
		System.out.println("성별: " + sex);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("카드 존재 여부: " + isCard);
		
		System.out.println("장바구니의 총합: " + (milkPrice + breadPrice + eggPrice));
		
		String msg = """
				달걀은 식탁에서 빠질 수 없는 단골 식재료지만, 달걀 껍데기에 묻은 세균은 식중독을 일으킬 위험이 있다. 가정에서의 보관과 조리 방법뿐 아니라 달걀을 세척·포장하는 과정에서도 위생 관리가 중요한 이유다.

이와 관련해 식품의약품안전처는 달걀 껍데기에 있을 수 있는 ‘살모넬라균’을 효과적으로 제거하기 위한 ‘달걀 세척·살균 가이드라인’을 4일 공개했다.
				""";
		
		System.out.println(msg);

	}

}
