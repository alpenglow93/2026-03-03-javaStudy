package com.sist.music;

import lombok.Getter;
import lombok.Setter;

// 데이터를 모아서 관리 => 데이터형 클래스 => 캡슐화
// MusicVO / MusicDTO / MusicEntity
// => 데이터를 보호 / 한번에 모아서 전송 => 윈도우 / 브라우저
// 사용자 정의 데이터형 => 메모리 크기

@Getter	// 읽기 => 값 읽기
@Setter	// 쓰기 => 메모리 저장
// 전체적으로 만들려면 class 밖에 쓴다
public class Music {

	private int no;
//	@Getter
//	@Setter		<< 만일 클래스 내부에 이런식으로 올리면 Getter Setter 가 title 변수에만 생기게 된다
	private String title;
	private String singer;
	private String album;
	private String state;
	private int idcrement;
	//private String poster;

}
