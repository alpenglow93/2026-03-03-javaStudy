package com.sist.inner;

import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
 * 	searchMainDailyBoxOffice.do
 * 	searchMainRealTicket.do
 * 	searchMainDailySeatTicket.do
 */

/*
 * [] = List
 * {} = 객체 Movie
 * [{"movieCd":"20261782",
 * "movieNmEn":"PROJECT HAIL MARY",
 * "movieNm":"프로젝트 헤일메리",
 * "audiCnt":76511,
 * "salesAmt":1025956080,
 * "totIssuCntRatio":"27.1",
 * "totIssuAmtRatio":"31.9",
 * "rank":1,
 * "rownum":1,
 * "startDate":"2026년 04월 09일(목)",
 * "synop":"죽어가는 태양, 종말 위기에 놓인 지구.\r\n인류의 운명을 건 단 하나의 미션.\r\n그의 마지막 임무가 시작된다!\r\n\r\n눈을 떠보니 아득한 우주의 한가운데에서 깨어난\r\n중학교 과학교사 ‘그레이스’는\r\n희미한 기억 속에서 자신이 죽어가는 태양으로부터\r\n지구와 인류를 살릴 마지막 희망으로\r\n이곳에 왔다는 사실을 알게 된다.\r\n\r\n잃어버린 기억으로 인해 모든 것이 혼란스러운 상황에서\r\n‘그레이스’는 우연히 우주 한복판에서\r\n같은 목적으로 온 뜻밖의 존재 ‘로키’를 만나게 되고\r\n‘그레이스’와 ‘로키’는 각 두 행성의 운명을 건\r\n마지막 미션을 수행하러 떠나게 되는데…",
 * "repNationCd":"미국",
 * "movieType":"장편",
 * "moviePrdtStat":"개봉",
 * "showTm":"156",
 * "showTs":"26",
 * "prdtYear":"2026",
 * "indieYn":null,
 * "artmovieYn":null,
 * "multmovieYn":null,
 * "director":"필 로드",
 * "prNm":null,
 * "dtNm":"소니픽쳐스엔터테인먼트코리아주식회사극장배급지점",
 * "genre":"SF",
 * "watchGradeNm":"12세이상관람가",
 * "openDt":"20260318",
 * "thumbUrl":"/common/mast/movie/2026/03/thumb/thn_5ce07f68e95a463cbb483c0e9da05dff.jpg",
 * "totalSalesAmt":19585829550,
 * "totalAudiCnt":1732907},
 */

// => 데이터형 => 메모리에 읽기 / 쓰기
class Movie
{
	private String name;
	private String director;
	private String actor;
	private String genre;
	private String grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}	
}

class DataCollection
{
	private static List<Movie> mList = new ArrayList<Movie>();
	
	static
	{
		// 초기화
		try 
		{
			Document doc = Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainDailySeatTicket.do").get();
			//System.out.println(doc.toString());
			String data = doc.toString();
			data = data.substring(data.indexOf("["), data.lastIndexOf("]")+1);
			System.out.println(data);
			JSONParser jp = new JSONParser();
			JSONArray arr = (JSONArray)jp.parse(data);
			//System.out.println(arr.toJSONString());
			// Jackson
			for(int i = 0; i < arr.size(); i++)
			{
				// {}
				JSONObject obj = (JSONObject)arr.get(i);
				Movie m = new Movie();
				m.setName((String)obj.get("movieNm"));
				m.setDirector((String)obj.get("director"));
				m.setGenre((String)obj.get("genre"));
				m.setGrade((String)obj.get("watchGradeNm"));
				mList.add(m);
				
			}
			
		} catch (Exception ex) {ex.printStackTrace();}
		
		
	}
	
	class DataManager
	{
		// 기능 수행
		public void movieList()
		{
			mList.stream()
				 .forEach(m->System.out.println(
						 	m.getName()+" "+
						 	m.getDirector()+" "+
						 	m.getGenre()+" "+
						 	m.getGrade()						 	
						 ));
		}
		
	}
	// 영화 정보
	public void movieList()
	{
		DataManager dm = new DataManager();
		dm.movieList();
	}
	
}


public class 내부클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataCollection dc = new DataCollection();
		dc.movieList();

	}

}
