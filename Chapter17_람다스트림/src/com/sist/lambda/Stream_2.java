package com.sist.lambda;
// 검색 => 입력된 사람만 

import java.io.FileReader;
import java.util.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Customer
{
	//C001,user001,pw001,김민수,minsu.kim1@test.com,010-1000-0001,서울,2023-01-02,VIP
	private String cno;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private String loc;
	private String regdate;
	private String grade;
}

class CustomerManager
{
	public static List<Customer> cList = new ArrayList<Customer>();
	static
	{
		try 
		{
			FileReader fr = new FileReader("c:\\javaDev\\고객.txt");
			String data = "";
			int i = 0;
			while((i=fr.read()) != -1) 
			{
				data += (char)i;
			}
			fr.close();
			
			String[] datas = data.split("\n");
			for(String cust:datas)
			{
				StringTokenizer st = new StringTokenizer(cust, ",");
				Customer c = new Customer();
				c.setCno(st.nextToken());
				c.setId(st.nextToken());
				c.setPwd(st.nextToken());
				c.setName(st.nextToken());
				c.setEmail(st.nextToken());
				c.setPhone(st.nextToken());
				c.setLoc(st.nextToken());
				c.setRegdate(st.nextToken());
				c.setGrade(st.nextToken());
				cList.add(c);
			}
			
		} catch (Exception ex) {}
	}
}

public class Stream_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("이름 입력: ");
//		String name = scan.next();
		
		CustomerManager cm = new CustomerManager();
//		for(Customer c:cm.cList)
//		{
//			if(c.getName().contains(name))
//			{
//				System.out.println(c.getName());
//			}
//		}
		//람다
//		cm.cList.stream()	// for
//				.filter(c->c.getName().contains(name))	// if
//				.forEach(c->System.out.println(c.getName()));	// 출력
		
		List<String> list =
				Arrays.asList("박문수","이순신","홍길동","강감찬","김두한");
		//Collections.sort(list,(a,b)->a.compareTo(b));
		list.sort(String::compareTo);	// 메소드 참조
		// 문자열 정렬 : compareTo
		System.out.println(list);
		
		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		int sum = data.stream()
					.reduce(0, (a,b)->a+b);
		System.out.println(sum);
		// reduce : 통계(누적합)
		// 메소드 + 형식 + 언제 사용하는지
		
	}

}
