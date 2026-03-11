// 메뉴
// 메뉴 => 입력
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 제어문_반복문_while4 {
	// io 파일 입출력 / 네트워크 연결 / 데이터베이스 연동
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.println("🎵🎵🎵🎵🎵 지니뮤직 🎵🎵🎵🎵🎵");
		
		while(true) // 무한루프 => 종료조건을 줘야한다
		{
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 가요");
			System.out.println("2. 트롯");
			System.out.println("3. OST");
			System.out.println("4. POP");
			System.out.println("5. JAZZ");
			System.out.println("6. CLASSIC");
			System.out.println("7. 종료");
			System.out.println("===============");
			System.out.print("메뉴 선택: ");
			int menu = scan.nextInt();
			
			//에러처리 => 입력이 잘못된 경우
			if(menu<1 || menu>7)
			{
				System.out.println("없는 메뉴입니다!! 다시 입력하세요");
				// while문 처음으로 다시 돌아가야함
				continue;
				/*
				 * 	continue :
				 * 		while => 조건식으로 이동
				 * 		for => 증가식으로 이동
				 * 	break :
				 * 		종료
				 */
			}
			// 다중조건문 / 선택문
			if(menu == 7)
			{
				// 종료
				/*
				 * 	1. System.exit(0) => 프로그램 자체 종료
				 * 	2. while문을 종료
				 * 		break
				 */
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu == 1)
			{
				// 노래 출력
				System.out.println("===== 가요 =====");
				Document doc = 
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=M0100").get();
				Elements title = doc.select(".title");
				for(int i = 0; i < title.size(); i++)
				{
					String s = title.get(i).text();
					System.out.println((i+1)+"."+s);
				}
			}
			else if(menu == 2)
			{
				// 노래 출력
				System.out.println("===== 트롯 =====");
				Document doc = 
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=M0107").get();
				Elements title = doc.select(".title");
				for(int i = 0; i < title.size(); i++)
				{
					String s = title.get(i).text();
					System.out.println((i+1)+"."+s);
				}
				
			}
			else if(menu == 3)
			{
				// 노래 출력
				System.out.println("===== OST =====");
			}
			else if(menu == 4)
			{
				// 노래 출력
				System.out.println("===== POP =====");
			}
			else if(menu == 5)
			{
				// 노래 출력
				System.out.println("===== JAZZ =====");
			}
			else if(menu == 6)
			{
				// 노래 출력
				System.out.println("===== CLASSIC =====");
			}
		}
		
	}

}
