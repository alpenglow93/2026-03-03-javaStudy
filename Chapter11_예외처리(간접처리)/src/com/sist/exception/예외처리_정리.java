package com.sist.exception;
/*
 * 	1. 예외 복구
 * 		try
 * 			= 정상 실행이 가능 코딩
 * 			= 에러가 발생할 수 있다 (실수, 입력) => 사전에 방지
 * 			= 에러가 나면 => 스킵 => catch 이동
 * 				1
 * 				2
 * 				3 = 에러 ==> catch
 * 				4 => Skip
 * 				5 => Skip
 * 		catch
 * 			1. 에러 확인이 가능
 * 				printStackTrace / getMessage
 * 					|					| 에러 메세지만 전송
 * 				에러 위치 확인 => 실행하는 과정
 * 			2. 에러 복구가 가능 => 이동 : goto (사용금지)
 * 		finally
 * 			생략이 가능
 * 			=> try/catch 상관 없이 무조건 수행
 * 			=> 서버/오라클/파일 닫기
 * 		** catch : 에러 발생시 처리
 * 			=> 다중 catch가 가능
 * 				=> 통합 : Exception / Throwable
 * 		** 자동 close 호출
 * 			try~with~resource
 * 	2. 예외 회피 : 에러를 등록해서 컴파일시에 통과
 * 		throws => 특별한 경우가 아니면 throws 문장은 많이 없다
 * 			한글변환
 * 		https://www.google.com/search?q=%EC%9E%90%EB%B0%94&sca_esv=b67bc7baf628df58&source=hp&ei=QvzFacyGE7TS2roPvZSVwAk&iflsig=AFdpzrgAAAAAacYKUm8taA0AAr_vCfQN4-R06dsfNrm2&ved=0ahUKEwjMr6ujlL-TAxU0qVYBHT1KBZgQ4dUDCBY&uact=5&oq=%EC%9E%90%EB%B0%94&gs_lp=Egdnd3Mtd2l6IgbsnpDrsJQyCxAAGIAEGLEDGIMBMggQABiABBixAzILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMgsQABiABBixAxiDATIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAESP0JUABY3AdwAXgAkAEAmAFxoAH5AqoBAzMuMbgBA8gBAPgBAZgCBKACrgLCAgQQABgDwgIREC4YgAQYsQMY0QMYgwEYxwHCAggQLhiABBixA8ICCxAuGIAEGLEDGIMBmAMAkgcDMy4xoAfSIbIHAzIuMbgHrQLCBwUwLjMuMcgHCIAIAA&sclient=gws-wiz
 * 		자바 ------- 브라우저 (%EC%9E%90%EB%B0%94) Encoding
 * 		자바			Decoding ==> UTF-8
 * 		=> 소스가 긴 경우 => try 위치 설정이 안 되는 경우
 * 			(유지보수)
 * 		메소드() throws ...
 * 		=> 사용자 정의 메소드보다는 라이브러리에 많이 있다 		
 * 	3. catch 찾기 => 임의 발생 : throw
 * 		=> 필요시에는 직접 예외를 만들어서 사용
 * 						호출시에는 반드시 throw new 클래스()
 * 		throws : 예상되는 에러를 선언한다
 * 				=> 메소드 호출시 예외처리를 한 다음 사용
 * 				=> throws / try~catch
 * 		throw : 견고한 프로그램인지 확인
 * 	
 * 	
 */
public class 예외처리_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
